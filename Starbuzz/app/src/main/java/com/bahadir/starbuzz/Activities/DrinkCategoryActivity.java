package com.bahadir.starbuzz.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.bahadir.starbuzz.Adapters.DrinkCategoryListAdapter;
import com.bahadir.starbuzz.Models.Drink;
import com.bahadir.starbuzz.R;
import com.bahadir.starbuzz.Services.DrinkService;


public class DrinkCategoryActivity extends AppCompatActivity {
    ListView drinksListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);

        init_UI();

        ArrayAdapter<Drink> adapter = new ArrayAdapter<>(this, R.layout.drink_list_item,
                R.id.drinkNameTextView, DrinkService.getDrinksList());

        DrinkCategoryListAdapter customAdapter =
                new DrinkCategoryListAdapter(DrinkService.getDrinksList(), this);

        drinksListView.setAdapter(customAdapter);
    }

    private void init_UI() {
        drinksListView = findViewById(R.id.drinksListView);

        drinksListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Drink clickedItem = (Drink) drinksListView.getItemAtPosition(i);

                Intent intent = new Intent(DrinkCategoryActivity.this, DrinkActivity.class);
                intent.putExtra(DrinkService.DRINK_EXTRA, clickedItem);
                startActivity(intent);
            }
        });
    }
}