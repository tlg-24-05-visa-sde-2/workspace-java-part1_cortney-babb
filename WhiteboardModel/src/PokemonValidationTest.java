// Validates Pokemon is assigned an appropriate level in setLvl() method
class PokemonValidationTest {
    public static void main(String[] args) {

        // Pokemon level testing
        System.out.println("Pokemon Level Validation: \n[\n");
        Pokemon pkmn = new Pokemon();

        pkmn.setLvl(Pokemon.MIN_LVL); // value should "stick" and be 1, no error message
        System.out.println(pkmn);

        pkmn.setLvl(Pokemon.MAX_LVL); // value should "stick" and be 100, no error message
        System.out.println(pkmn);

        pkmn.setLvl(0); // error message, value rejected (value is still 100)
        System.out.println(pkmn);

        pkmn.setLvl(101); // error message, value rejected (value is still 100)
        System.out.println(pkmn);


        System.out.println("\n]\n*********************************************************\n");
        System.out.println("Pokemon Evolution & Species Validation: \n[\n");

        // pokemon species and evolution testing
        Pokemon pkmn1 = new Pokemon();
        pkmn1.setSpecies("Pikachu");
        pkmn1.setLvl(25);
        pkmn1.evolve();

        pkmn1.setSpecies("Squirtle");
        pkmn1.setLvl(30);
        pkmn1.evolve();

        pkmn1.setSpecies("Charmander");
        pkmn1.setRival("Bulbasaur");
        pkmn1.setLvl(34);
        pkmn1.setDefeated(true);
        pkmn1.levelUp(); // Expecting Charmander to level up and qualify to evolve
        pkmn1.evolve();

        pkmn1.setSpecies("Bulbasaur");
        pkmn1.setLvl(29);
        pkmn1.evolve();

        pkmn1.setSpecies("Mewtwo"); // Expected to return error message as Random isn't part of the selection
        pkmn1.setLvl(14); // Expected to retain previous species Bulbasaur and reassign its level to 14
        pkmn1.evolve(); // Should not evolve

        System.out.println("]");
    }
}

