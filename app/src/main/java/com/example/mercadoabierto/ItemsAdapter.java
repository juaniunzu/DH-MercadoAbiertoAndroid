package com.example.mercadoabierto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemsAdapter extends RecyclerView.Adapter {

    private List<Item> listaItems;

    public ItemsAdapter(List<Item> listaItems) {
        this.listaItems = listaItems;
    }

    //creo la celda del item
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //creo inflador
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        //con el inflador, inflo el xml a view y lo guardo en una variable local
        View xmlInfladoAView = layoutInflater.inflate(R.layout.celda_item, parent, false);

        //paso esta view a viewholder usandola como parametro para instanciar viewholder, la guardo en variable local
        RecyclerView.ViewHolder xmlViewAViewHolder = new ItemsViewHolder(xmlInfladoAView);

        //retorno el viewholder
        return xmlViewAViewHolder;

    }

    //le cargo los datos a la celda
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        //tomo el item mostrado en la posicion determinada y lo guardo en variable local
        Item item = listaItems.get(position);

        //casteo el parametro holder para que sea de tipo ItemsViewHolder,
        //de esta manera tendra disponible el metodo cargarItem()
        ItemsViewHolder itemsViewHolder = (ItemsViewHolder) holder;

        //le asocio el item usando el metodo correspondiente, uso el item guardado localmente arriba
        itemsViewHolder.cargarItem(item);

    }

    //informo cuantos items hay en la lista
    @Override
    public int getItemCount() {
        return listaItems.size();
    }

    //creo viewHolder (representacion java de la celda)
    private class ItemsViewHolder extends RecyclerView.ViewHolder{

        private ImageView celdaItemImageViewImagen;
        private TextView celdaItemTextViewNombre;
        private TextView celdaItemTextViewPrecio;

        public ItemsViewHolder(@NonNull View itemView) {
            super(itemView);

            celdaItemImageViewImagen = itemView.findViewById(R.id.celdaItemImageViewImagen);
            celdaItemTextViewNombre = itemView.findViewById(R.id.celdaItemTextViewNombre);
            celdaItemTextViewPrecio = itemView.findViewById(R.id.celdaItemTextViewPrecio);

        }

        //metodo que se usa para enlazar item con celda, en el onBindViewHolder
        public void cargarItem(Item unItem){

            celdaItemImageViewImagen.setImageResource(unItem.getImagen());
            celdaItemTextViewNombre.setText(unItem.getNombre());
            celdaItemTextViewPrecio.setText(unItem.getPrecio());

        }

    }

}
