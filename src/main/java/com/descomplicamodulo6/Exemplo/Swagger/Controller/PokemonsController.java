package com.descomplicamodulo6.Exemplo.Swagger.Controller;

import com.descomplicamodulo6.Exemplo.Swagger.Entity.PokemonEntity;
import com.descomplicamodulo6.Exemplo.Swagger.Service.PokemonsService;
import io.swagger.v3.oas.annotations.Operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("${app.environment.base-path}")
public class PokemonsController {

    @Autowired
    private PokemonsService pokemonsService;

    @Operation(summary = "Listar Pokemons")
    @GetMapping("/listar")
    public ResponseEntity<List<PokemonEntity>> ListarPokemons() {
        List<PokemonEntity> pokemons = pokemonsService.consultarPokemons();
        if (pokemons == null || pokemons.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(pokemons);
        }
    }
}
