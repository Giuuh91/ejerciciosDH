package com.example.digital.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
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

         LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
         PersonajeAdapter personajesAdapter = new PersonajeAdapter(personajes);

         recyclerViewPersonajes.setLayoutManager(linearLayoutManager);
         recyclerViewPersonajes.setAdapter(personajesAdapter);


    }
    private List<Personaje> cargarPersonajes(){

        List<Personaje> personajes = new ArrayList<>();
        personajes.add(new Personaje("Homero Simpson","Los Simpson", R.drawable.homer_simpson_));
        personajes.add(new Personaje("Elsa","Frozen", R.drawable.ricky));
        personajes.add(new Personaje("Alf","Alf", R.drawable.alf));
        personajes.add(new Personaje("RickyFort","Felfort",R.drawable.ricky));
        personajes.add(new Personaje("Clark","Los 100", R.drawable.alf));
        personajes.add(new Personaje("Diosito","El marginal", R.drawable.homer_simpson_));
        personajes.add(new Personaje("Walter White","Breaking Bad", R.drawable.ricky));
        personajes.add(new Personaje("BrianOconner","Rapidos y Furiosos",R.drawable.alf));
        personajes.add(new Personaje("PepeArgento","Los Argento",R.drawable.ricky));
        personajes.add(new Personaje("Wally","Buscando a Wally",R.drawable.ricky));
        personajes.add(new Personaje("Barney","Barney el Dinosaurio",R.drawable.ricky));
        personajes.add(new Personaje("Denver","La casa de papel",R.drawable.ricky));
        personajes.add(new Personaje("DonRamon","El Chavo del Ocho",R.drawable.ricky));
        personajes.add(new Personaje("Venom","El Hombre araña",R.drawable.ricky));
        personajes.add(new Personaje("Tom","Tom Y Jerry",R.drawable.ricky));
        return personajes;


    }
}
