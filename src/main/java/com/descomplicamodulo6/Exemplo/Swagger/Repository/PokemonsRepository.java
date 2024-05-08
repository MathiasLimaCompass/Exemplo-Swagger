package com.descomplicamodulo6.Exemplo.Swagger.Repository;

import java.io.Serializable;
import java.util.List;
import com.descomplicamodulo6.Exemplo.Swagger.Entity.PokemonEntity;

public class PokemonsRepository implements Serializable {

    private Integer count;
    private String next;
    private String previous;
    private List<PokemonEntity> results;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<PokemonEntity> getResults() {
        return results;
    }

    public void setResults(List<PokemonEntity> results) {
        this.results = results;
    }
}
