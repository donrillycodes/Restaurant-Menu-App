package com.adedeji.restaurantapp2;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DishAdapter extends RecyclerView.Adapter<DishAdapter.DishViewHolder> {
    private Dish[] dishes;

    // Constructor to initialize the dishes array
    public DishAdapter(Dish[] dishes) {
        this.dishes = dishes;
    }

    @NonNull
    @Override
    public DishViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dish, parent, false);
        return new DishViewHolder(view);
    }

    // Bind the dish data to the view holder
    @Override
    public void onBindViewHolder(@NonNull DishViewHolder holder, int position) {
        holder.bind(dishes[position]);
    }

    // Get the number of items in the list
    @Override
    public int getItemCount() {
        return dishes.length;
    }

    // ViewHolder class for the dish items
    static class DishViewHolder extends RecyclerView.ViewHolder {
        private TextView titleTextView;
        private TextView descriptionTextView;
        private TextView priceTextView;

        public DishViewHolder (@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.title_text);
            descriptionTextView = itemView.findViewById(R.id.description_text);
            priceTextView = itemView.findViewById(R.id.price_text);
        }

        public void bind(Dish dish) {
            titleTextView.setText(dish.title);
            descriptionTextView.setText(dish.description);
            priceTextView.setText(String.format("$%.2f", dish.price / 100.0));
        }
    }
}