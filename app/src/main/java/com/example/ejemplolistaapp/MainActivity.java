package com.example.ejemplolistaapp;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RecyclerView recyclerView = findViewById(R.id.foodList);

        // Todos los elementos serán del mismo tamaño
        recyclerView.setHasFixedSize(true);

        // Para configurarlo, hay que establecer un linearLayoutManager
        RecyclerView.LayoutManager l_manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(l_manager);

        //  Ahora establecemos el adaptador, quien manejará los distintos elementos de la lista
        RecyclerView.Adapter adapter = new FoodListAdapter();
        recyclerView.setAdapter(adapter);
    }


}
