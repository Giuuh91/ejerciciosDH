package com.example.digital.recyclerview;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;
import java.util.zip.Inflater;

public class PersonajeAdapter extends RecyclerView.Adapter {

    private List<Personaje> listaDePersonajes;


    public PersonajeAdapter(List<Personaje> listaDePersonajes) {
        this.listaDePersonajes = listaDePersonajes;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflador = LayoutInflater.from(parent.getContext());
        View viewCelda = inflador.inflate(R.layout.celda_personaje,parent,false);

        PersonajeViewHolder personajeViewHolder = new PersonajeViewHolder(viewCelda);

        return personajeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Personaje personaje = listaDePersonajes.get(position);
        PersonajeViewHolder personajeViewHolder = (PersonajeViewHolder) holder;
        personajeViewHolder.bind(personaje);
        
    }

    @Override
    public int getItemCount() {
        return listaDePersonajes.size();
    }

    private class PersonajeViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageViewPersonaje;
        private TextView nombrePersonaje;
        private TextView programaPersonaje;

        public PersonajeViewHolder(View itemView) {
            super(itemView);
           imageViewPersonaje =  itemView.findViewById(R.id.celda_imageView_personaje);
           nombrePersonaje = itemView.findViewById(R.id.celda_textView_personaje);
           programaPersonaje = itemView.findViewById(R.id.celda_textView_programa);
        }

        public void bind(Personaje unPersonaje){
            nombrePersonaje.setText(unPersonaje.getNombre());
            programaPersonaje.setText(unPersonaje.getPrograma());

        }
    }
}
