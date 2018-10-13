package com.example.digital.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewPersonajes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewPersonajes = findViewById(R.id.reclyclerView_personajes);

         List<Personaje> personajes = cargarPersonajes();

        new PersonajeAdapter(personajes);

    }
    private List<Personaje> cargarPersonajes(){

        List<Personaje> personajes = new ArrayList<>();
        personajes.add(new Personaje("Homero Simpson","Los Simpson", null));
        personajes.add(new Personaje("Elsa","Frozen", null));
        personajes.add(new Personaje("Alf","Alf", null));
        personajes.add(new Personaje("RickyFort","Felfort",null));
        personajes.add(new Personaje("Clark","Los 100", null));
        personajes.add(new Personaje("Diosito","El marginal", null));
        personajes.add(new Personaje("Walter White","Breaking Bad", null));
        personajes.add(new Personaje("BrianOconner","Rapidos y Furiosos",null));
        personajes.add(new Personaje("PepeArgento","Los Argento",null));
        personajes.add(new Personaje("Wally","Buscando a Wally",null));
        personajes.add(new Personaje("Barney","Barney el Dinosaurio",null));
        personajes.add(new Personaje("Denver","La casa de papel",null));
        personajes.add(new Personaje("DonRamon","El Chavo del Ocho",null));
        personajes.add(new Personaje("Venom","El Hombre araña",null));
        personajes.add(new Personaje("Tom","Tom Y Jerry",null));
        return personajes;


    }
}
