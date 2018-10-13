package com.example.digital.recyclerview;

import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class PersonajeAdapter extends RecyclerView.Adapter {

    private List<Personaje> listaDePersonajes;

    public PersonajeAdapter(List<Personaje> listaDePersonajes) {
        this.listaDePersonajes = listaDePersonajes;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
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
    }
}
