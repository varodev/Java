package com.juanagui.recycler.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MemeAdapter.OnMemeClickListener {
    private static final String TAG = MainActivity.class.getName();

    //crear lista (interfaz) de memes; relacionado con el constructor de Meme.java
    private final List<Meme> _memes = Arrays.asList(
            new Meme("Grumpy Cat", R.drawable.grumpy_cat, "", "Good!"),
            new Meme("Brace Yourselves", R.drawable.brace_yourselves_x_is_coming, "Brace Yourselves", "Winter is Coming!"),
            new Meme("Futurama Fry", R.drawable.futurama_fry, "Not sure if ___", "Or just ___"),
            new Meme("One Does Not Simply", R.drawable.one_does_not_simply, "One does not simply", "Walk into mordor"),
            new Meme("Bad Luck Brian", R.drawable.bad_luck_brian, "", "Bad Luck Brian!"),
            new Meme("First World Problems", R.drawable.first_world_problems, "", ""),
            new Meme("Am I The Only One Around Here", R.drawable.am_i_the_only_one_around_here, "Am I The Only One Around Here", "Who ___")
    );//adapter se le pasa la lista de memes

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);//Mostrar en el interfaz de usuario bibliotecas listas de elementos(contenedor lista)
        recyclerView.setLayoutManager(new LinearLayoutManager(this));//organizar los elementos dentro del RecyclerView en línea.
        //recyclerView.setLayoutManager(new GridLayoutManager(this, 2));//organizar los elementos dentro del RecyclerView en parrilla.
        recyclerView.setAdapter(new MemeAdapter(_memes, this));//se le añade un adapter
    }
    @Override
    public void onMemeClick(int position) {
        Meme meme = _memes.get(position);//alguien ha sido clickado en esta posicion
        Log.i(TAG, String.format("Meme %s was clicked", meme.name));//se saca por consola el nombre del meme
    }
}