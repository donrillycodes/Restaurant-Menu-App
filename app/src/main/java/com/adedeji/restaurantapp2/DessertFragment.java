package com.adedeji.restaurantapp2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

public class DessertFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_recycler_view, container, false);

        // Initialize RecyclerView and set adapter
        RecyclerView List = view.findViewById(R.id.recycler_menu);

        Dish[] desserts = {
                new Dish("Chocolate and hazelnut fondant", "Warm molten chocolate cake with a gooey hazelnut center", 1499),
                new Dish("Sticky toffee pudding", "Moist date sponge soaked in toffee sauce, served with vanilla ice cream", 1299),
                new Dish("Lemon and raspberry tart", "Zesty lemon curd and fresh raspberries in a buttery shortcrust pastry", 1399),
                new Dish("Tiramisu with espresso", "Classic Italian dessert with layers of coffee-soaked ladyfingers and mascarpone", 1599),
                new Dish("Salted caramel cheesecake", "Creamy cheesecake with a rich salted caramel swirl and biscuit base", 1399),
                new Dish("Pistachio and rose panna cotta", "Silky panna cotta infused with rosewater and topped with crushed pistachios", 1299),
                new Dish("Apple and cinnamon crumble", "Warm spiced apples topped with a buttery oat crumble, served with custard", 1349)
        };

        // Create and set adapter
        DishAdapter adapter = new DishAdapter(desserts);
        List.setAdapter(adapter);

        return view;
    }
}
