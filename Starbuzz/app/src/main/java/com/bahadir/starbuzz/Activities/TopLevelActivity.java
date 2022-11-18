package com.bahadir.starbuzz.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.bahadir.starbuzz.R;

public class TopLevelActivity extends AppCompatActivity {
    ListView optionsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        init_UI();
    }

    private void init_UI() {
        optionsListView = findViewById(R.id.optionsListView);

        optionsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0: // Drinks
                        Intent intent = new Intent(TopLevelActivity.this,
                                DrinkCategoryActivity.class);
                        startActivity(intent);
                        break;
                    case 1: // Foods
                        break;
                    case 2: // Stores
                        break;
                    default:
                        break;
                }
            }
        });

    }
}