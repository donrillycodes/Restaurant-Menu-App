package com.adedeji.restaurantapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import com.adedeji.restaurantapp2.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    CardView starterCard;
    CardView mainCourseCard;
    CardView dessertCard;
    CardView drinksCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize the binding object
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        starterCard = findViewById(R.id.card_view_starters);
        mainCourseCard = findViewById(R.id.card_view_main_course);
        dessertCard = findViewById(R.id.card_view_dessert);
        drinksCard = findViewById(R.id.card_view_drinks);


        starterCard.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MenuActivity.class);
            intent.putExtra("SELECTED_ITEM_ID", R.id.navigation_starter);
            startActivity(intent);
        });

        mainCourseCard.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MenuActivity.class);
            intent.putExtra("SELECTED_ITEM_ID", R.id.navigation_main_course);
            startActivity(intent);
        });

        dessertCard.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MenuActivity.class);
            intent.putExtra("SELECTED_ITEM_ID", R.id.navigation_dessert);
            startActivity(intent);
            });

        drinksCard.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MenuActivity.class);
            intent.putExtra("SELECTED_ITEM_ID", R.id.navigation_drinks);
            startActivity(intent);
            });

    }
}