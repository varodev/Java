package com.juanagui.http.pokemon;

import java.net.URI;
import java.util.List;
//relacionado con PokemonService
public class SpeciesChunk {//es una clase de datos
    public int count;
    public URI next;
    public URI previous;
    public List<Species> results;
    //ver List<Species> species = response.body().results>MainActivity
}