package com.juanagui.http.pokemon;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PokemonService {//INTERFAZ API
    @GET("pokemon-species")
    Call<SpeciesChunk> listSpecies(
            @Query("offset") int offset,
            @Query("limit") int limit);

    //REEMPLAZAR EN EL PATH EL NOMBRE DEL POKEMON QUE SEA
    @GET("pokemon-species/{name}")//COMO SE OBTIENE DETALLES DE UN POKEMON
    Call<SpeciesDetails> speciesDetails(@Path("name") String name);//DEVUELVE CALL CON SU MTO ANONIMO
}