package com.gamefreak;// date/time usage + formatting

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * This Pokemon application allows the user to partake in a battle with their
 * chosen species from only the Kanto starters.
 */

/**
 * JR: Demonstrates very good understanding of program concepts,
 * with nice creativity applied, which appears to be implemented correctly.
 * Code could be tightened up in places, but that is not expected at this stage of the program.
 *
 * See comments below and in the other classes.
 *
 * Code is clean, readable, well-formatted.
 *
 * Class participation has been very good, keep it up.
 *
 * Class names, package names, and overall structure are correct.
 *
 * See private comments (not in the eval spreadsheet) at the end of this class definition.
 */
public class Pokemon {
    // static "shared" public fields not to be changed, min and max valid lvl
    // also class constants
    // JR: better naming = MIN/MAX_LEVEL
    public static final int MIN_LVL = 1;
    public static final int MAX_LVL = 100;

    // properties or attributes w/ data encapsulation
    // JR: better naming = level
    private int lvl = 5; // default 5

    // default with enum: ["Pikachu", "Squirtle", "Bulbasaur", "Charmander"]
    private PokemonSpecies species = PokemonSpecies.PIKACHU;

    // JR: the 'rival' property could just be another Pokemon object
    private PokemonRival rival; // enum: ["Pikachu", "Squirtle", "Bulbasaur", "Charmander"]

    // JR: I don't think this attribute gets used anywhere
    private String move = "Run Away"; // default move

    private DamageType damage = DamageType.NO_EFFECT; // default damage constraint: ["No effect",
    // "Not very effective", "Effective", "Very effective"]
    private boolean isDefeated;

    // constructors
    public Pokemon() {
    }

    public Pokemon(PokemonSpecies species) {
        setSpecies(species);
    }

    // JR: be consistent with parameter sequencing across ctors, when possible
    // species, rival, move,  and then add lvl
    public Pokemon(int lvl, PokemonSpecies species, PokemonRival rival, String move) {
        this(species); // delegates to lvl, species, move constructor above
        setLvl(lvl);
        setRival(rival);
        setMove(move);
    }

    public Pokemon(int lvl, PokemonSpecies species, PokemonRival rival, String move,
                   DamageType damage, boolean isDefeated) {
        // using this() to delegate to neighboring constructor above for lvl, species and move
        this(lvl, species, rival, move);
        // delegate to setters
        setDamage(damage);
        setDefeated(isDefeated);
    }

    // business or "action" methods
    // user's pokemon attack / damage

    /*
     * JR: this method could take the Pokemon object as its parameter,
     * and then generate a random DamageType from the options available.
     * Doesn't one Pokemon attack another Pokemon, and inflict various "damage" to it?
     */
    public void attack() {
        System.out.println(getSpecies() + " used " + getMove() + "!");

        if (getDamage().equals(DamageType.NO_EFFECT)) {
            System.out.println("It had no effect.");
        } else {
            System.out.println("It was " + getDamage() + ".");
        }
        System.out.println();
    }

    // rival pokemon's attack / damage
    public void rivalAttack(String move, DamageType damage) {
        System.out.println("Enemy " + getRival() + " used " + move + "!");

        if (getDamage().equals(DamageType.NO_EFFECT)) {
            System.out.println("It had " + DamageType.NO_EFFECT + ".");
        } else {
            System.out.println("It was " + damage + ".");
        }
        System.out.println();
    }

    // levels up or outputs if user's pokemon has been defeated
    public void levelUp() {
        if (getDefeated()) {
            isDefeated = true;  // JR: unnecessary, if you're in here, isDefeated is already true
            System.out.println("Enemy " + getRival() + " has been defeated!");
            System.out.println(getSpecies() + " gained experience and has increased from level "
                    + getLvl() + " to " + (++lvl) + ".");
        } else {
            isDefeated = false; // JR: also unnecessary
            System.out.println(getSpecies() + " has fainted.");
        }
        System.out.println();
    }

    // data validation: specific response types for evolution method
    public void evolve() {
        int[] evoLvl = {25, 32, 35, 30};
        String[] evoSpecies = {"Raichu", "Wartortle", "Charmeleon", "Ivysaur"};
        String msg1 = "Something is happening! " + getSpecies() + " is evolving.\n...\n";
        String msg2 = "\nCongratulations on your new Pokemon!\n";
        String msg3 = getSpecies() + " is not ready to evolve.\nCurrent level: " + getLvl() + "\nEvolution level: ";
        boolean isEvolving = false;

        // assigns an evolutionary level to each Pokemon and outputs executes evolution if it is true

        /*
         * JR: could switch-case on species instead, or a better if-condition,
         * and the redundancies could be eliminated, as well.
         * Perfectly okay what you've done here, at this early stage in Java.
         *
         * The PokemonSpecies could itself carry the evoLvl attribute, like a display-string.
         *
         * Perhaps something like this would be better (pseudocode and not tested):
         *  if (species == PIKACHU _and_ lvl >= evoLvl[0])
         *    msg = msg1 + getSpecies() + " has evolved into " + evoSpecies[0] + msg2 + ".");
         *  else
         *    msg = msg3 + evoLvl[0]
         *  That is, just figure out which message you want to show, but don't show it here
         *
         *  else if
         *    same deal for SQUIRTLE and evoLvl[1]
         *
         *  Then, at the end, *after* all the if-else branches, print the message (once!)
         */
        if (getSpecies().equals(PokemonSpecies.PIKACHU)) {
            if (getLvl() >= evoLvl[0]) {
                isEvolving = true;
                System.out.println(msg1 + getSpecies() + " has evolved into " + evoSpecies[0] + msg2 + ".");
            }
            else {
                System.out.println(msg3 + evoLvl[0]);
            }
        } else if (getSpecies().equals(PokemonSpecies.SQUIRTLE)) {
            if (getLvl() >= evoLvl[1]) {
                isEvolving = true;
                System.out.println(msg1 + getSpecies() + " has evolved into " + evoSpecies[1] + msg2 + ".");
            }
            else {
                System.out.println(msg3 + evoLvl[1]);
            }
        } else if (getSpecies().equals(PokemonSpecies.CHARMANDER)) {
            if (getLvl() >= evoLvl[2]) {
                isEvolving = true;
                System.out.println(msg1 + getSpecies() + " has evolved into " + evoSpecies[2] + "." + msg2);
            }
            else {
                System.out.println(msg3 + evoLvl[2]);
            }
        } else if (getSpecies().equals(PokemonSpecies.BULBASAUR)) {
            if (getLvl() >= evoLvl[3]) {
                isEvolving = true;
                System.out.println(msg1 + getSpecies() + " has evolved into " + evoSpecies[3] + "." + msg2);
            }
            else {
                System.out.println(msg3 + evoLvl[3]);
            }
        }

        System.out.println();
    }

    // assigns a sound effect to each Pokemon
    /*
     * JR: this could be more cleanly done if PokemonSpecies carried the attribute itself,
     * just like you already do with that display-string attribute.
     */
    public String chatter() {
        String chat = "";
        if (getSpecies().equals(PokemonSpecies.PIKACHU)) {
            chat = "~Pika pi!";
        } else if (getSpecies().equals(PokemonSpecies.CHARMANDER)) {
            chat = "~Char!";
        } else if (getSpecies().equals(PokemonSpecies.SQUIRTLE)) {
            chat = "~Squirtle squirt!";
        } else if (getSpecies().equals(PokemonSpecies.BULBASAUR)) {
            chat = "~Bulba!";
        }
        return chat;
    }

    // catch / fail output
    public boolean catching(boolean isCaught) {
        System.out.println("You threw a Pokeball!");

        if (isCaught) {
            isCaught = true;  // JR: unnecessary, if the if block is active, you know it's true

            System.out.println("All right! The Pokemon was caught!");

            LocalDateTime caughtDay = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            String formatCaughtDay = caughtDay.format(formatter);
            System.out.println(getRival() + " was caught on " + formatCaughtDay);
        } else {
            isCaught = false; // JR: unnecessary, same reason as above
            System.out.println("Darn! The Pokemon broke free!\n");
        }
        return isCaught;
    }

    // data encapsulation: getters and setters
    public int getLvl() {
        return lvl;
    }

    // error handling / data validation constraint: level must be between 1 and 100 inclusive
    public void setLvl(int lvl) {
        if (lvl >= MIN_LVL && lvl <= MAX_LVL) {
            this.lvl = lvl;
        } else {
            System.out.println("Error: " + lvl + " is invalid. Level must be between " +
                    MIN_LVL + " and " + MAX_LVL + " inclusive!");
        }
    }

    public PokemonSpecies getSpecies() {
        return species;
    }

    public void setSpecies(PokemonSpecies species) {
        this.species = species;
    }

    public PokemonRival getRival() {
        return rival;
    }

    public void setRival(PokemonRival rival) {
        this.rival = rival;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    // ENUM usage
    public DamageType getDamage() {
        return damage;
    }

    // ENUM usage
    public void setDamage(DamageType damage) {
        this.damage = damage;
    }

    public boolean getDefeated() {
        return isDefeated;
    }

    public void setDefeated(boolean defeated) {
        isDefeated = defeated;
    }

    // toString()
    public String toString() {
        return String.format("Pokemon: species=%s, level=%s, rival=%s, " +
                        "move=%s, damage=%s, isDefeated=%s]",
                getSpecies(), getLvl(), getRival(), getMove(), getDamage(), getDefeated());
    }

    /**
     * JR: between you me, this is very good work, and please keep these comments private.
     *
     * It's clear you put an enormous degree of thought and work into this assignment,
     * and I applaud you for that.
     *
     * Could be cleaner and tighter in several places, and you'll realize
     * how to do this with experience and practice, but this is not expected at weeks 2-3.
     *
     * I see greatness in you, and am looking forward to see what you're like after week 6.
     * During project week, I make visits, and "force" the teams to "do it the right way,"
     * which is a huge amount of work for me, but the light bulbs start firing and it's all worth it.
     * Be psyched - you're off to a good start, and have all the right stuff to be a great developer.
     */
}