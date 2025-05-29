package com.adedeji.restaurantapp2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

public class DrinksFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_recycler_view, container, false);

        // Initialize RecyclerView and set adapter
        RecyclerView List = view.findViewById(R.id.recycler_menu);

        Dish[] drinks = {
                new Dish("Mango and passionfruit mojito", "A refreshing blend of mango, passionfruit, mint, and rum", 899),
                new Dish("Elderflower and cucumber spritz", "Light and floral cocktail with elderflower liqueur and fresh cucumber", 799),
                new Dish("Espresso martini", "Vodka, coffee liqueur, and freshly brewed espresso, shaken to perfection", 1199),
                new Dish("Berry and mint iced tea", "Cold-brewed black tea infused with mixed berries and fresh mint", 599),
                new Dish("Pomegranate gin fizz", "Tart pomegranate juice mixed with gin, soda, and a splash of lime", 849),
                new Dish("Spiced chai latte", "Warm, aromatic chai tea blended with steamed milk and a hint of vanilla", 699),
                new Dish("Watermelon basil cooler", "Fresh watermelon juice with basil and a touch of vodka, served over ice", 799)
        };
        // Create and set adapter
        DishAdapter adapter = new DishAdapter(drinks);
        List.setAdapter(adapter);

        return view;
    }
}
