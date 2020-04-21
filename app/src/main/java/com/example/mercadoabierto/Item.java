package com.example.mercadoabierto;

import android.content.Intent;

public class Item {

    private String nombre;
    private Integer imagen;
    private String precio;

    public Item(String nombre, Integer imagen, String precio) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getImagen() {
        return imagen;
    }

    public void setImagen(Integer imagen) {
        this.imagen = imagen;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
