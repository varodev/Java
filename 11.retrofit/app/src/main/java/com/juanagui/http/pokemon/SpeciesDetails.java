package com.juanagui.http.pokemon;

import com.google.gson.annotations.SerializedName;

import java.net.URI;
import java.util.List;

public class SpeciesDetails {//ACONTINUACIOM, CLASES ANIDADAS
    public String name;
    //@SerializedName("flavor_text_entries") commented coz we're setting the proper FieldNamingPolicy in the builder
    public List<FlavorTextEntry> flavorTextEntries;//ES UNA LISTA -- VER SPECIESDETAILACTIVITY LINEA 49
    //DENTRO DE CADA UNO TIENE public String flavorText;

    public class FlavorTextEntry {
        //@SerializedName("flavor_text") commented coz we're setting the proper FieldNamingPolicy in the builder
        public String flavorText;
        public Language language;
        public Version version;

        public class Language {
            public String name;
            public URI url;
        }

        public class Version {
            public String name;
            public URI url;
        }
    }
}