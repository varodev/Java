package com.juanagui.http;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.juanagui.http.pokemon.PokemonService;
import com.juanagui.http.pokemon.Species;
import com.juanagui.http.pokemon.SpeciesChunk;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {//si no va, cambiar en el movil fecha y hora + meter el manifiesto permisos

    private static final String TAG = MainActivity.class.getName();
    private PokemonService _service;//es una interfaz
    private int _offset = 0;
    private static final int LIMIT = 20;
    private List<Species> _species = new ArrayList<>();//listas de especies like a lista de memes pero no a mano
    private SpeciesAdapter _adapter;//interfaz

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()//config con un builder
                .baseUrl("https://pokeapi.co/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())//JSON
                .build();
        _service = retrofit.create(PokemonService.class);//se crea el svc y se guardia en variable local    //convertidor de JSON a objetos

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));//SE LE PASA UN CONTEXTO/ACTIVIDAD

        _adapter = new SpeciesAdapter(_species, new SpeciesAdapter.OnSpeciesClickListener() {//CREO ADAPTER Y GUARDO EN UN CAMPO PARA ACCEDER LUEGO EN EL LOADCHUNK
            @Override                                        //LINEA 16 ADAPTER
            public void onSpeciesClick(Species species) {//CUANDO TE CLIKAN DETALLES DE LA ESPECIE(NOMBRE Y URL)
                Intent intent = new Intent();//SE CREA INTENT //OTRA ACTIVIDAD(SPECIESDETAILSACTIVITY) PARA VER LOS DETALLES DE LA ESPECIE
                intent.setClass(MainActivity.this, SpeciesDetailsActivity.class);//LE DICES DE QUE CLASE VIENE Y DONDE DEBE IR
                intent.putExtra(SpeciesDetailsActivity.NAME_KEY, species.name);//NECESITA ALMENOS QUE LE DIGA CUAL ES EL NOMBRE DE LA ESPECIE
                startActivity(intent);//ARRANCAME LA ACTIVIDAD Y PASAMOS A SPECIESDETAILSACTIVITY
            }
        });

        recyclerView.setAdapter(_adapter);

        Button loadMoreButton = findViewById(R.id.load_more_button);//boton que carga más

        loadMoreButton.setOnClickListener(new View.OnClickListener() {//escuchar cuando alguien hace click en el boton
            @Override//desencadena esta clase anonima que implementa la interfaz onclicklistener
            public void onClick(View view) {
                loadChunk(_offset, LIMIT);
            }//un solo metodo
        });//ESTO ES UN CALLBACK-->CUANDO TE CLIKE AVISAME PARA CARGAR OTRO TROZO DE SPECIES

        loadChunk(_offset, LIMIT);
    }

    //como cargar un chunk? chunk es una clase con un bloque pokemon species //Consumir la llamada de forma asincrona
    private void loadChunk(int offset, int limit) {//no se puede llamar de forma bloqueante en el hilo principal
        Call<SpeciesChunk> call = _service.listSpecies(offset, limit);//call es una clase de retrofit(llamada para obtener lista de especies)

        call.enqueue(new Callback<SpeciesChunk>() {//metodo enqueue--encolar y cuando termine retrofit que te devuelva(callback)//interfaz
            @Override
            public void onResponse(Call<SpeciesChunk> call, Response<SpeciesChunk> response) {//cuando el metodo se ha completado, devuelve propia call y respuesta de specieschunk
                if (response.isSuccessful()) {//si la respuesta de specieschunk es satisfactoria(200)
                    List<Species> species = response.body().results;//ir al cuerpo de la respuesta de la lista de pokemon-->devuelve clase//body es de la clase specieschunk
                    _species.addAll(species);//como mostrarlos por pantalla lista de especies, si es correcto responde del tipo specieschunk
                    for (Species specie : species) {//bucle que sale por el log el nombre de las especies
                        Log.i(TAG, specie.toString());
                    }
                    _adapter.notifyItemRangeInserted(offset, LIMIT);//hay que avisarle al adapter que tiene nuevos elementos que debe de tener en cuenta y su rango
                    _offset += LIMIT;//del 0 al 20, del 20 al 40, etc
                 } else {
                    Log.e(TAG, response.errorBody().toString());
                }
            }//onResponse

            @Override
            public void onFailure(Call<SpeciesChunk> call, Throwable t) {//si la respuesta de specieschunk va mal
                Log.e(TAG, t.getLocalizedMessage());//si la hora o fecha del dispositivo esta mal puede que no vaya la app
            }
        });//callback
    }
}