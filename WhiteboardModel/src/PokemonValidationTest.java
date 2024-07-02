// Validates Pokemon is assigned an appropriate level in setLvl() method
class PokemonValidationTest {
    public static void main(String[] args) {

        // Pokemon level testing
        Pokemon pkmn = new Pokemon();

        pkmn.setLvl(Pokemon.MIN_LVL); // value should "stick" and be 1, no error message
        System.out.println(pkmn);

        pkmn.setLvl(Pokemon.MAX_LVL); // value should "stick" and be 100, no error message
        System.out.println(pkmn);

        pkmn.setLvl(0); // error message, value rejected (value is still 100)
        System.out.println(pkmn);

        pkmn.setLvl(101); // error message, value rejected (value is still 100)
        System.out.println(pkmn);

        System.out.println();

        // pokemon evolution testing
        Pokemon squirtle = new Pokemon("Squirtle");
        System.out.println("Pokemon: " + squirtle.getSpecies());
        squirtle.evolve();

        Pokemon invalidSpecies = new Pokemon("Random");
        System.out.println("Pokemon: " + invalidSpecies.getSpecies());
        invalidSpecies.evolve();
    }
}

