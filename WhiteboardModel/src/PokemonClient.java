/*
 * Main class for application
 */
class PokemonClient {
    public static void main(String[] args) {

        //instances & properties
        Pokemon pk1 = new Pokemon(20, "Pikachu", "Squirtle", "Thundershock",
                    "Super effective", true);
        //calling the instance/methods
        System.out.println("Pokemon 1:");
        System.out.println(pk1.getSpecies() + ": " + pk1.chatter());
        pk1.attack();
        pk1.levelUp();
        pk1.evolve();


        Pokemon pk2 = new Pokemon(30, "Bulbasaur", "Charmander",
                    "Vine Whip", "Not very effective", false);
        System.out.println("Pokemon 2:");
        System.out.println(pk2.getSpecies() + ": " + pk2.chatter());
        pk2.attack();
        pk2.levelUp();
        pk2.evolve();

        // utilizes constraint with 3 arguments and takes default value for lvl
        Pokemon pk3 = new Pokemon(Pokemon.MIN_LVL, "Charmander", "Ember");
        System.out.println("Pokemon 3:");
        System.out.println(pk3.getSpecies() + ": " + pk3.chatter());
        System.out.println("Pokedex Data: " + pk3.getSpecies() + " is currently level " +
                           pk3.MIN_LVL + " and knows the move " + pk3.getMove() +
                            ". Would you like it to learn a new move?\ny/n");


        System.out.println("\ntoString() Data:");
        // calling toString()
        System.out.println(pk1.toString());
        System.out.println(pk2);
        System.out.println(pk3);
    }
}