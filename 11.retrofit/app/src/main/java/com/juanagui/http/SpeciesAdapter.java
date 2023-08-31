package com.juanagui.http;
//entremedias del RV y las vistas, coordina y crea vistas y en un momento dado se le llama para que pongan los datos de la lista
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.juanagui.http.pokemon.Species;

import java.util.List;
//responsable de enlazar los datos de la lista con el ViewHolder
public class SpeciesAdapter extends RecyclerView.Adapter<SpeciesViewHolder> {//adaptador datos a viewHolder
        private final List<Species> _speciesList;
        private final OnSpeciesClickListener _onSpeciesClickListener;
    public SpeciesAdapter(List<Species> speciesList, OnSpeciesClickListener onSpeciesClickListener) {//recibir lista especies, constructor y pasar especies del MainActivity
        _speciesList = speciesList;
        _onSpeciesClickListener = onSpeciesClickListener;
    }//constructor SpeciesAdapter
//////////////////////////////////////////////////////////////////
    public interface OnSpeciesClickListener {//INTERFAZ DE CALLBACK, CUANDO ME CLIKEN EN LA PANTALLA, QUE ME HAN CLIKADO A VER QUE HACES
        void onSpeciesClick(Species species);
    }/////////////////////////////////////////////////////////////
    @Override//inflar el diseño de los elementos individuales y crear un ViewHolder y pasarle el diseño
    public SpeciesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {//encargado de crear vistas y pasarselas a un viewholder ya creado
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_species_item, parent, false);//inflador
        return new SpeciesViewHolder(view, _onSpeciesClickListener);//devolver viewHolder(pasar vista)
    }
    @Override//rellenar los campos de la vista para un elemento concreto
    public void onBindViewHolder(@NonNull SpeciesViewHolder holder, int position) {//recibe un viewholder y se encarga de darle datos xa que los pinte en pantalla y se encarge de hacerlo el viewholder
        holder.bind(_speciesList.get(position));
    }
    @Override
    public int getItemCount() {
        return _speciesList.size();
    }
}