package com.gamefreak.client;

import com.gamefreak.DamageType;
import com.gamefreak.Pokemon;
import com.gamefreak.PokemonRival;
import com.gamefreak.PokemonSpecies;

/*
 * Main class for application
 */

/**
 * JR: very impressive, the amount of thought and work you put into this, and I commend you for that.
 * This is a mini-application, more than just a test-drive of a few basic instances, but that's great.
 * The logic demonstrated here does appear to all work correctly, though I didn't study it exhaustively.
 */
public class PokemonClient {
    public static void main(String[] args) {

        //instances & properties
        Pokemon pk1 = new Pokemon(24, PokemonSpecies.PIKACHU, PokemonRival.SQUIRTLE, "Thundershock",
                DamageType.SUPER_EFFECTIVE, true);
        //calling the instance/methods
        System.out.println("Pokemon 1:\n" + pk1.getSpecies() + " vs " + pk1.getRival());
        System.out.println(pk1.getSpecies() + ": " + pk1.chatter());
        pk1.attack();
        pk1.levelUp();
        pk1.evolve();


        Pokemon pk2 = new Pokemon(20, PokemonSpecies.BULBASAUR, PokemonRival.CHARMANDER,
                "Vine Whip", DamageType.NOT_VERY_EFFECTIVE, false);
        System.out.println("Pokemon 2:\n" + pk2.getSpecies() + " vs " + pk2.getRival());
        System.out.println(pk2.getSpecies() + ": " + pk2.chatter());
        pk2.rivalAttack("Scratch", DamageType.EFFECTIVE);
        pk2.attack();
        pk2.rivalAttack("Ember", DamageType.SUPER_EFFECTIVE);
        pk2.setDefeated(false);
        pk2.levelUp();
        pk2.evolve();


        // utilizes constraint with 3 arguments and takes default value for lvl
        Pokemon pk3 = new Pokemon(12, PokemonSpecies.SQUIRTLE, PokemonRival.PIKACHU, "Bubblebeam");
        System.out.println("Pokemon 3:\n" + pk3.getSpecies() + " vs " + pk3.getRival());
        System.out.println(pk3.getSpecies() + ": " + pk3.chatter());
        pk3.catching(false);
        pk3.rivalAttack("Growl", DamageType.NO_EFFECT);
        pk3.catching(true);
        System.out.println();


        Pokemon pk4 = new Pokemon(34, PokemonSpecies.CHARMANDER, PokemonRival.SQUIRTLE,
                "Flamethrower", DamageType.NOT_VERY_EFFECTIVE, true);
        System.out.println("Pokemon 4:\n" + pk4.getSpecies() + " vs " + pk4.getRival());
        System.out.println(pk4.getSpecies() + ": " + pk4.chatter());
        pk4.attack();
        pk4.rivalAttack("Bubblebeam", DamageType.SUPER_EFFECTIVE);
        pk4.setMove("Fire Punch");
        pk4.attack();
        pk4.catching(true);


        System.out.println("\ntoString() Data:");
        // calling toString()
        System.out.println(pk1.toString());
        System.out.println(pk2);
        System.out.println(pk3);
        System.out.println(pk4);
    }
}