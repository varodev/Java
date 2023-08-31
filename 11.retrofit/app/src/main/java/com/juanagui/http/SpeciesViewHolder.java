package com.juanagui.http;
//contacto directo con la vista y sabe pintar los elementos de la lista con los valores correspondientes
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.juanagui.http.pokemon.Species;
//cada uno de los elementos visuales de los elementos de la lista hereda de esta clase
public class SpeciesViewHolder extends RecyclerView.ViewHolder {
         private final TextView _speciesNameTextView;
         private final SpeciesAdapter.OnSpeciesClickListener _onSpeciesClickListener;
         private Species _species;
    public SpeciesViewHolder(@NonNull View itemView, SpeciesAdapter.OnSpeciesClickListener _onSpeciesClickListener) {
        super(itemView);//poner datos del meme en la vista
        _speciesNameTextView = itemView.findViewById(R.id.species_name);
        this._onSpeciesClickListener = _onSpeciesClickListener;

        _speciesNameTextView.setOnClickListener(new View.OnClickListener() {//cuando pasa una vista me subescribo al evento setOnClickListener(escuchar)
            @Override
            public void onClick(View view) {
                if (_species != null) {
                    _onSpeciesClickListener.onSpeciesClick(_species);
                }
            }
        });

    }//constructor SpeciesViewHolder
    public void bind(Species species) {//metodo creado desde holder.bind(_speciesList.get(position));>onBindViewHolder>SpeciesAdapter.java
        _species = species;
        _speciesNameTextView.setText(species.name);
    }
}