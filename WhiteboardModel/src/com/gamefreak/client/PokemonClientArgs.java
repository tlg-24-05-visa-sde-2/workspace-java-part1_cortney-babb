package com.gamefreak.client;

import com.gamefreak.DamageType;
import com.gamefreak.Pokemon;
import com.gamefreak.PokemonRival;
import com.gamefreak.PokemonSpecies;

import java.util.Arrays;

public class PokemonClientArgs {
    public static void main(String[] args) {
        // checking for 6 arguments (required)
        if (args.length < 6) {
            String requirements = "Requirements: java PokemonClientArgs " +
                        "<lvl> <species> <rival> <move> <damage> <isDefeated>";
            String ex = "Example: java PokemonClientArgs " +
                    "20 Pikachu Charmander Thundershock Effective false";
            String disclaimer = "Level must be in range of: " +
                    Pokemon.MIN_LVL + " and " + Pokemon.MAX_LVL;
            String disclaimer2 = "Species must be a valid Kanto starter: " +
                    "Pikachu, Squirtle, Charmander, Bulbasaur\n" +
                    "Rival must be a valid Kanto starter: " +
                    "Pikachu, Squirtle, Charmander, Bulbasaur";
            String disclaimer3 = "Valid damage effects: " +
                    Arrays.toString(DamageType.values());
            String disclaimer4 = "Valid response type - Did you defeat your rival? " +
                    "True or False";


            System.out.println(requirements + "\n" + ex + "\n" + disclaimer +
                    "\n" + disclaimer2 + "\n" + disclaimer3 + "\n" + disclaimer4);
            return;
        }

        int lvl = Integer.parseInt(args[0]);
        PokemonSpecies species = PokemonSpecies.valueOf(args[1].toUpperCase());
        PokemonRival rival = PokemonRival.valueOf(args[2].toUpperCase());
        String move = args[3];
        DamageType damage = DamageType.valueOf(args[4].toUpperCase());
        Boolean isDefeated = Boolean.parseBoolean(args[5]);

        Pokemon pokemon = new Pokemon(lvl, species, rival, move, damage, isDefeated);

        System.out.println("Success! Your input of " + args.length +
                " entries satisfies the required number of arguments.");
        System.out.println("Enjoy your new Pokemon! It will accompany you " +
                "along your journey throughout Kanto.\nYou are able to engage in " +
                "battle as well as catch new Pokemon along the way.\nPikachu: " + pokemon.chatter());
        System.out.println(pokemon);


    }
}