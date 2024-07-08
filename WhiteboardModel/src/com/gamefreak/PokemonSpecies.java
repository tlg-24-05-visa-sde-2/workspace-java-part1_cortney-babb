package com.gamefreak;

public enum PokemonSpecies {
    PIKACHU("Pikachu"),
    CHARMANDER("Charmander"),
    SQUIRTLE("Squirtle"),
    BULBASAUR("Bulbasaur");

    private String species;

    PokemonSpecies(String species) {
        this.species = species;
    }

    public String getSpecies(){
        return species;
    }

    public String toString() {
        return getSpecies();
    }
}