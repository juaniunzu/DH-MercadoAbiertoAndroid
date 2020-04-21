package com.example.mercadoabierto;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class ItemsFragment extends Fragment implements ItemsAdapter.ItemListener {

    private RecyclerView recyclerView;
    private ItemsAdapter adapter;



    public ItemsFragment() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //inflo el fragment a view - NECESARIO PARA PODER ENLAZAR EL RECYCLERVIEW
        View view = inflater.inflate(R.layout.fragment_items, container, false);

        //uso el fragment inflado para poder enlazar el recyclerview con el elemento xml
        recyclerView = view.findViewById(R.id.fragmentItemsRecyclerView);

        //creo lista de items
        List<Item> listaItems = crearListaItems();

        //creo adapter
        adapter = new ItemsAdapter(listaItems, this);


        //creo el layout manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        //seteo el manager y el adapter al recyclerview
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

        return view;
    }

    //metodo para crear lista de items
    public List<Item> crearListaItems(){

        List<Item> listaItemsCreada = new ArrayList<>();

        listaItemsCreada.add(new Item("Juego de platos", R.drawable.juego_platos, "$2.500"));
        listaItemsCreada.add(new Item("Lampara palermitana", R.drawable.lampara, "$1.700"));
        listaItemsCreada.add(new Item("Laptop re cheta", R.drawable.laptop, "$30.000"));
        listaItemsCreada.add(new Item("Set de destornilladores", R.drawable.set_destornilladores, "$1.100"));
        listaItemsCreada.add(new Item("Taladro", R.drawable.taladro, "$2.700"));
        listaItemsCreada.add(new Item("Juego de platos", R.drawable.juego_platos, "$2.500"));
        listaItemsCreada.add(new Item("Lampara palermitana", R.drawable.lampara, "$1.700"));
        listaItemsCreada.add(new Item("Laptop re cheta", R.drawable.laptop, "$30.000"));
        listaItemsCreada.add(new Item("Set de destornilladores", R.drawable.set_destornilladores, "$1.100"));
        listaItemsCreada.add(new Item("Taladro", R.drawable.taladro, "$2.700"));
        listaItemsCreada.add(new Item("Juego de platos", R.drawable.juego_platos, "$2.500"));
        listaItemsCreada.add(new Item("Lampara palermitana", R.drawable.lampara, "$1.700"));
        listaItemsCreada.add(new Item("Laptop re cheta", R.drawable.laptop, "$30.000"));
        listaItemsCreada.add(new Item("Set de destornilladores", R.drawable.set_destornilladores, "$1.100"));
        listaItemsCreada.add(new Item("Taladro", R.drawable.taladro, "$2.700"));

        return listaItemsCreada;

    }

    public void agregarItem(String nombre, String precio){



    }


    @Override
    public void hicieronClick(Item unItem) {

    }
}
