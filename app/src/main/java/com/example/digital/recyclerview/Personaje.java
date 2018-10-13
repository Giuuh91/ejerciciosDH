package com.example.digital.recyclerview;

import android.widget.ImageView;

public class Personaje {

    private String nombre;
    private String programa;
    private Integer imagenPersonaje;

    public Personaje() {
    }

    public Personaje(String nombre, String programa, Integer imagenPersonaje) {
        this.nombre = nombre;
        this.programa = programa;
        this.imagenPersonaje = imagenPersonaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public Integer getImagenPersonaje() {
        return imagenPersonaje;
    }

    public void setImagenPersonaje(Integer imagenPersonaje) {
        this.imagenPersonaje = imagenPersonaje;
    }
}
