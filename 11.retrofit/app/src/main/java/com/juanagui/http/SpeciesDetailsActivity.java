package com.juanagui.http;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.juanagui.http.pokemon.PokemonService;
import com.juanagui.http.pokemon.SpeciesDetails;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SpeciesDetailsActivity extends AppCompatActivity {

    private static final String TAG = SpeciesDetailsActivity.class.getName();
    public final static String NAME_KEY = "NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_species_details);

        Intent intent = getIntent();
        String speciesName = intent.getStringExtra(NAME_KEY);//LE PASAN POR EL INTENT EL POKEMON CLIKADO, FILTRADO POR NOMBRE
        //IR A LA API A POR LOS DETALLES DEL POKEMON
        Gson gson = new GsonBuilder()//MAS DE UNA PALABRA EN EL GSON, CONVERSOR
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)//snakeCase
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://pokeapi.co/api/v2/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();//CREO RETROFIT

        PokemonService _service = retrofit.create(PokemonService.class);
        Call<SpeciesDetails> speciesDetailsCall = _service.speciesDetails(speciesName);//LLAMADA A DAME LOS DETALLES DE UNA ESPECIE

        speciesDetailsCall.enqueue(new Callback<SpeciesDetails>() {//SE ENCOLA LA LLAMADA, SE LE PASA IMPLEMENTACION DE CALLBACK PERO DE SPECIESDETAILS
            @Override
            public void onResponse(Call<SpeciesDetails> call, Response<SpeciesDetails> response) {
                if (response.isSuccessful()) {
                    SpeciesDetails speciesDetails = response.body();//SI TIENE EXITO EN EL BODY TE DEVUELVE SPECIESDETAILS
                    TextView speciesDetailNameTextView = findViewById(R.id.species_detail_name);//SITIO DONDE SE PONE EL NOMBRE
                    speciesDetailNameTextView.setText(speciesDetails.name);
                    if (speciesDetails.flavorTextEntries != null && !speciesDetails.flavorTextEntries.isEmpty()) {
                        TextView speciesDetailDescriptionTextView = findViewById(R.id.species_detail_description);//SITIO DONDE SE PONE LA DESCRIPCION
                        speciesDetailDescriptionTextView.setText(speciesDetails.flavorTextEntries.get(0).flavorText);//COJES 1ER ELEMENTO DE LA DESCRIPCION Y LO PINCHAS
                    }
                } else {
                    Log.e(TAG, response.errorBody().toString());
                }
            }

            @Override
            public void onFailure(Call<SpeciesDetails> call, Throwable t) {
                Log.e(TAG, t.getLocalizedMessage());
            }
        });
    }
}