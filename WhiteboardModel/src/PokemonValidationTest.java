// Validates Pokemon is assigned an appropriate level in setLvl() method
class PokemonValidationTest {
    public static void main(String[] args) {

        // Pokemon level data testing (setLvl() )
        System.out.println("Pokemon Level Validation: \n[");
        Pokemon pkmn = new Pokemon();

        pkmn.setLvl(Pokemon.MIN_LVL); // value should "stick" and be 1, no error message
        System.out.println(pkmn);

        pkmn.setLvl(Pokemon.MAX_LVL); // value should "stick" and be 100, no error message
        System.out.println(pkmn);

        pkmn.setLvl(0); // error message, value rejected (value is still 100)
        System.out.println(pkmn);

        pkmn.setLvl(101); // error message, value rejected (value is still 100)
        System.out.println(pkmn);


        System.out.println("]\n*********************************************************\n");
        System.out.println("Pokemon Evolution & Species Validation: \n[");

        // pokemon species (from setSpecies() in Pokemon.java) and evolution testing (evolve() method)
        Pokemon pkmn1 = new Pokemon();
        pkmn1.setSpecies("Pikachu");
        pkmn1.setLvl(25);
        pkmn1.evolve(); // Expected to evolve at level 25

        pkmn1.setSpecies("Squirtle");
        pkmn1.setLvl(30);
        pkmn1.evolve(); // Not ready to evolve, evolves at lvl 32

        pkmn1.setSpecies("Charmander");
        pkmn1.setRival("Bulbasaur");
        pkmn1.setLvl(34);
        pkmn1.setDefeated(true);
        pkmn1.levelUp(); // Expecting Charmander to level up and qualify to evolve at lvl 35
        pkmn1.evolve();

        pkmn1.setSpecies("Bulbasaur");
        pkmn1.setLvl(29);
        pkmn1.evolve(); // Not ready to evolve, evolves at lvl 30

        pkmn1.setSpecies("Mewtwo"); // Expected to return error message as Random isn't part of the selection
        pkmn1.setLvl(14); // Expected to retain previous species Bulbasaur and reassign its level to 14
        pkmn1.evolve(); // Should not evolve

        System.out.println("]");
    }
}

