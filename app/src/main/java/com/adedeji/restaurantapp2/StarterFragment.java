package com.adedeji.restaurantapp2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

public class StarterFragment  extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_recycler_view, container, false);

        // Initialize RecyclerView and set adapter
        RecyclerView List = view.findViewById(R.id.recycler_menu);

        Dish[] starters = {
                new Dish("Bruschetta with tomato and basil", "Toasted bread topped with fresh tomatoes, basil, and garlic", 1099),
                new Dish("Truffle and mushroom arancini", "Crispy risotto balls filled with truffle oil and wild mushrooms", 1399),
                new Dish("Prawn and avocado cocktail", "Succulent prawns layered with creamy avocado and tangy cocktail sauce", 1599),
                new Dish("Spinach and feta filo parcels", "Flaky filo pastry stuffed with spinach and feta cheese", 1299),
                new Dish("Caprese stuffed mushrooms", "Portobello mushrooms filled with mozzarella, cherry tomatoes, and basil pesto", 1199),
                new Dish("Spicy chorizo croquettes", "Crispy croquettes with smoky chorizo and a manchego cheese center", 1349),
                new Dish("Smoked salmon tartare", "Finely chopped smoked salmon with capers, red onion, and lemon zest on toast", 1499)
        };

        DishAdapter adapter = new DishAdapter(starters);
        List.setAdapter(adapter);

        return view;
    }


}
