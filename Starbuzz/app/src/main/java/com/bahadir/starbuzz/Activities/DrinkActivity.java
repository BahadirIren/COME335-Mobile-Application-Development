package com.bahadir.starbuzz.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.bahadir.starbuzz.Models.Drink;
import com.bahadir.starbuzz.R;
import com.bahadir.starbuzz.Services.DrinkService;

public class DrinkActivity extends AppCompatActivity {
    ImageView drinkImageView;
    TextView drinkDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        Intent intent = getIntent();
        Drink drink = (Drink) intent.getSerializableExtra(DrinkService.DRINK_EXTRA);

        init_UI();

        getSupportActionBar().setTitle(drink.getName());

        drinkImageView.setImageDrawable(getDrawable(drink.getImageResourceID()));
        drinkDescription.setText(drink.getDescription());
    }

    private void init_UI() {
        drinkImageView = findViewById(R.id.drinkImageView);
        drinkDescription = findViewById(R.id.drinkDescriptionTextView);
    }
}