package com.example.ejemplolistaapp;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/*
    RecycleView nos ofrece una lista optimizada para cuando queremos mostrar más elementos
    de los que aparecen en pantalla. De hecho, la función onBindViewHolder() nos permite
    establecer que se debe poner(como datos) en los elementos nuevos que van apareciendo
    a medida que nos movemos en la lista.
 */
public class FoodListAdapter extends RecyclerView.Adapter<FoodListAdapter.FoodListHolder> {

        // Nuestro "contenedor" por cada linea
        public static class FoodListHolder extends RecyclerView.ViewHolder {
            private TextView foodText;
            private View myView;
            private ImageView myImg;
            private Resources myRes;
            public FoodListHolder(@NonNull View itemView) {
                super(itemView);
                myView = itemView;
                foodText = itemView.findViewById(R.id.itemTxt);
                myImg = itemView.findViewById(R.id.itemImg);
                myRes = itemView.getResources();
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

    // Position hace referencia a un elemento en la lista que estás visualizando
    @Override
    public void onBindViewHolder(@NonNull FoodListHolder holder, int position) {
            // Los 'resources' sólo pueden sor obtenidos por View
           String[] str = holder.myRes.getStringArray(R.array.foodArray);

           // Para otro tipo de recursos que no son Strings usamos TypedArray
           TypedArray img = holder.myRes.obtainTypedArray(R.array.foodImgs);
           holder.foodText.setText(str[position%3]);
           holder.myImg.setImageDrawable(img.getDrawable(position%3));
    }

    // Cuantos elementos vamos a tener
    @Override
    public int getItemCount() {
        return 25;
    }


}
