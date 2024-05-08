package com.descomplicamodulo6.Exemplo.Swagger.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.descomplicamodulo6.Exemplo.Swagger.Entity.PokemonEntity;
import com.descomplicamodulo6.Exemplo.Swagger.Repository.PokemonsRepository;
import com.google.gson.Gson;

@Service
public class PokemonsService {

    @Value("${pokemon.api.url}")
    private String pokemonApiUrl;

    public List<PokemonEntity> consultarPokemons() {

        // read file.json mock

        String json = "{\n" +
                "  \"count\": 1118,\n" +
                "  \"next\": \"https://pokeapi.co/api/v2/pokemon?offset=20&limit=20\",\n" +
                "  \"previous\": null,\n" +
                "  \"results\": [\n" +
                "    {\n" +
                "      \"name\": \"bulbasaur\",\n" +
                "      \"url\": \"https://pokeapi.co/api/v2/pokemon/1/\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"ivysaur\",\n" +
                "      \"url\": \"https://pokeapi.co/api/v2/pokemon/2/\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"venusaur\",\n" +
                "      \"url\": \"https://pokeapi.co/api/v2/pokemon/3/\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"charmander\",\n" +
                "      \"url\": \"https://pokeapi.co/api/v2/pokemon/4/\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"charmeleon\",\n" +
                "      \"url\": \"https://pokeapi.co/api/v2/pokemon/5/\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"charizard\",\n" +
                "      \"url\": \"https://pokeapi.co/api/v2/pokemon/6/\"\n" +
                "    }\n" +
                "   ]\n" +
                "}";

        Gson gson = new Gson();
        PokemonsRepository pokemonsRepository = gson.fromJson(json, PokemonsRepository.class);

        if (pokemonsRepository != null) {
            return pokemonsRepository.getResults();
        }

        return null;

    }
}
