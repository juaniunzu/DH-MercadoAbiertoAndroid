package com.example.mercadoabierto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    public static final String NOMBRE_ITEM = "nombreItem";
    public static final String PRECIO_ITEM = "precioItem";
    public static final String IMAGEN_ITEM = "imagenItem";

    private ImageView activityDetailImageViewImagen;
    private TextView activityDetailTextViewNombre;
    private TextView activityDetailTextViewPrecio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        activityDetailImageViewImagen = findViewById(R.id.activityDetailImageViewImagen);
        activityDetailTextViewNombre = findViewById(R.id.activityDetailTextViewNombre);
        activityDetailTextViewPrecio = findViewById(R.id.activityDetailTextViewPrecio);


        //recibo intent desde el fragment
        Intent desdeItemsFragment = getIntent();

        Bundle desdeFragment = desdeItemsFragment.getExtras();

        String nombre = desdeFragment.getString(NOMBRE_ITEM);
        String precio = desdeFragment.getString(PRECIO_ITEM);
        Integer imagen = desdeFragment.getInt(IMAGEN_ITEM);

        activityDetailImageViewImagen.setImageResource(imagen);
        activityDetailTextViewPrecio.setText(precio);
        activityDetailTextViewNombre.setText(nombre);



    }
}
