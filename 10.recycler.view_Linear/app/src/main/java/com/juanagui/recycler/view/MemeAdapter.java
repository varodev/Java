package com.juanagui.recycler.view;
//entremedias del RV y las vistas, coordina y crea vistas y en un momento dado se le llama para que pongan los datos de la lista
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
//responsable de enlazar los datos de la lista con el ViewHolder
public class MemeAdapter extends RecyclerView.Adapter<MemeViewHolder> {//adaptador datos a viewHolder
        private final List<Meme> _memes;
        private final OnMemeClickListener _onMemeClickListener;
//recibir lista memes, constructor y pasar memes del MainActivity
    public MemeAdapter(List<Meme> memes, OnMemeClickListener onMemeClickListener) {
        _memes = memes;
        _onMemeClickListener = onMemeClickListener;
    }
    ////////////////////////////////////////////////////////
    public interface OnMemeClickListener {// interfaz que representa una accion;me dice que meme se ha pulsado
        void onMemeClick(int position);//¿que meme se ha pulsado? te doy la posicion
    }///////////////////////////////////////////////////

    @Override//inflar el diseño de los elementos individuales y crear un ViewHolder y pasarle el diseño
    public MemeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {//encargado de crear vistas y pasarselas a un viewholder ya creado
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_meme_item, parent, false);//inflador
        return new MemeViewHolder(view, _onMemeClickListener);//devolver viewHolder(pasar vista)
    }
    @Override//rellenar los campos de la vista para un elemento concreto
    public void onBindViewHolder(@NonNull MemeViewHolder holder, int position) {//recibe un viewholder y se encarga de darle datos xa que los pinte en pantalla y se encarge de hacerlo el viewholder
        holder.bind(_memes.get(position));//enlazar viewHolder con la posicion del elemento del arraylist List<Meme> _memes del MainActivity //pasar el meme y que lo pinte en pantalla todos los elementos del meme
    }
        @Override
    public int getItemCount() {//lo necesita el recyclyerView; devolver el número de elementos de la lista
        return _memes.size();//devolver el numero de elementos(tamaño) de la lista
    }
}//