package com.gamefreak;

/**
 * JR: duplicate of PokemonSpecies.
 */
public enum PokemonRival {
    PIKACHU("Pikachu"),
    CHARMANDER("Charmander"),
    SQUIRTLE("Squirtle"),
    BULBASAUR("Bulbasaur");

    private String rival;

    PokemonRival(String rival) {
        this.rival = rival;
    }

    public String getRival(){
        return rival;
    }

    public String toString() {
        return getRival();
    }
}