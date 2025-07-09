package com.adedeji.restaurantapp2;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.adedeji.restaurantapp2.databinding.ActivityMenuBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;


public class MenuActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private ActivityMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize the binding object
        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Set the initial fragment
//        getSupportFragmentManager().beginTransaction()
//                .replace(R.id.frame_content, new StarterFragment())
//                .commit();

        // Set the selected item in the bottom navigation bar
        int selectedItemId = getIntent().getIntExtra("SELECTED_ITEM_ID", R.id.navigation_starter);

        loadFragmentForId(selectedItemId);

        //binding bottom nav bar
        binding.bottomNavBar.setOnNavigationItemSelectedListener(this);

    }

    //Load the fragment based on the selected item from the main activity
    private void loadFragmentForId(int selectedItemId) {
        if (selectedItemId == R.id.navigation_starter){
            onStarterClicked();
        } else if (selectedItemId == R.id.navigation_main_course){
            onMainCourseClicked();
        } else if (selectedItemId == R.id.navigation_dessert){
            onDessertClicked();
        }
        else if (selectedItemId == R.id.navigation_drinks){
            onDrinksClicked();
        }

        // Display the selected item in the bottom navigation bar
        binding.bottomNavBar.setSelectedItemId(selectedItemId);

    }

    //bottom nav bar click listener
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.navigation_starter){
            onStarterClicked();
            return true;
        } else if (item.getItemId() == R.id.navigation_main_course){
            onMainCourseClicked();
            return true;
        } else if (item.getItemId() == R.id.navigation_dessert){
            onDessertClicked();
            return true;
        }
        else if (item.getItemId() == R.id.navigation_drinks){
            onDrinksClicked();
            return true;
        }
        return false;
    }

    private void onStarterClicked() {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_content, new StarterFragment()).commit();
    }

    private void onMainCourseClicked() {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_content, new MainCourseFragment()).commit();

    }

    private void onDessertClicked() {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_content, new DessertFragment()).commit();
    }

    private void onDrinksClicked() {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_content, new DrinksFragment()).commit();
    }

}