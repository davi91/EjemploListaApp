package com.example.ejemplolistaapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FoodListAdapter extends RecyclerView.Adapter<FoodListAdapter.FoodListHolder> {

        // Nuestro "contenedor" por cada linea
        public static class FoodListHolder extends RecyclerView.ViewHolder {

            public FoodListHolder(@NonNull View itemView) {
                super(itemView);
            }
        }

    // Éste método es el que nos interesa, el que se ejecuta primero, de aquí podemos sacar una vista
    @NonNull
    @Override
    public FoodListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // En este caso, hacemos referencia al layout que creamos nosotros, un elemento de la lista
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_text_field, parent, false);

        FoodListHolder vh = new FoodListHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodListHolder holder, int position) {

    }

    // Cuantos elementos vamos a tener
    @Override
    public int getItemCount() {
        return 5;
    }


}
