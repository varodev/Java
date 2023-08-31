package com.juanagui.recycler.view;
//contacto directo con la vista y sabe pintar los elementos de la lista con los valores correspondientes
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
//cada uno de los elementos visuales de los elementos de la lista hereda de esta clase
public class MemeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
//crear variables de las vistas que en constructor igualas a los recursos
        private final TextView _nameTextView;
        private final TextView _topTextView;
        private final ImageView _imageView;
        private final TextView _bottomTextView;
        private final MemeAdapter.OnMemeClickListener _onMemeClickListener;
    //recibir el click en un elemento visual porq tiene una vista

    public MemeViewHolder(@NonNull View itemView, MemeAdapter.OnMemeClickListener onMemeClickListener) {
        super(itemView);//poner datos del meme en la vista
        _nameTextView = itemView.findViewById(R.id.name);
        _topTextView = itemView.findViewById(R.id.top_text);
        _imageView = itemView.findViewById(R.id.image);
        _bottomTextView = itemView.findViewById(R.id.bottom_text);
        _onMemeClickListener = onMemeClickListener;
        itemView.setOnClickListener(this);//cuando pasa una vista me subescribo al evento setOnClickListener(escuchar)
    }
    public void bind(Meme meme) {//metodo creado desde holder.bind(meme)>onBindViewHolder>MemeAdapter.java
        _nameTextView.setText(meme.name);
        _topTextView.setText(meme.topText);
        _imageView.setImageResource(meme.imageResId);
        _bottomTextView.setText(meme.bottomText);
    }
    @Override//si me pulsan le tengo que decir a alguien DONDE me han pulsado
    public void onClick(View view) {//es un callback
        _onMemeClickListener.onMemeClick(getAdapterPosition());//se ejecutará en el activity
    }//interface definida en MemeAdapter
}