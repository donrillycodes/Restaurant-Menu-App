package com.adedeji.restaurantapp2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

public class MainCourseFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_recycler_view, container, false);

        // Initialize RecyclerView and set adapter
        RecyclerView List = view.findViewById(R.id.recycler_menu);

        Dish[] mains = {
                new Dish("Beef and red wine pie", "Tender beef slow-cooked in rich red wine gravy, topped with puff pastry", 2299),
                new Dish("Salmon and dill en croute", "Fresh salmon fillet wrapped in buttery pastry with a dill cream sauce", 2499),
                new Dish("Eggplant and lentil moussaka", "Layers of roasted eggplant, spiced lentils, and creamy béchamel", 1899),
                new Dish("Chicken and wild mushroom risotto", "Creamy Arborio rice with roasted chicken and earthy wild mushrooms", 1999),
                new Dish("Herb-crusted rack of lamb", "Tender lamb coated with rosemary and thyme, served with roasted garlic mash", 2599),
                new Dish("Butternut squash ravioli", "Handmade pasta filled with roasted squash, served in a sage butter sauce", 1799),
                new Dish("Grilled swordfish with salsa verde", "Juicy swordfish steak topped with a zesty herb and caper salsa", 2399)
        };

        DishAdapter adapter = new DishAdapter(mains);
        List.setAdapter(adapter);

        return view;
    }
}
