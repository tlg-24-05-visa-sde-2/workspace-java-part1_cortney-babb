/*
 * Main class for application
 */
class PokemonClient {
    public static void main(String[] args) {

        //instances & properties
        Pokemon pk1 = new Pokemon(24, "Pikachu", "Squirtle", "Thundershock",
                DamageType.SUPER_EFFECTIVE, true);
        //calling the instance/methods
        System.out.println("Pokemon 1:\n" + pk1.getSpecies() + " vs " + pk1.getRival());
        System.out.println(pk1.getSpecies() + ": " + pk1.chatter());
        pk1.attack();
        pk1.levelUp();
        pk1.evolve();


        Pokemon pk2 = new Pokemon(20, "Bulbasaur", "Charmander",
                    "Vine Whip", DamageType.NOT_VERY_EFFECTIVE, false);
        System.out.println("Pokemon 2:\n" + pk2.getSpecies() + " vs " + pk2.getRival());
        System.out.println(pk2.getSpecies() + ": " + pk2.chatter());
        pk2.attack();
        pk2.evolve();

        // utilizes constraint with 3 arguments and takes default value for lvl
        Pokemon pk3 = new Pokemon(12, "Charmander", "Ember");
        System.out.println("Pokemon 3:");
        System.out.println(pk3.getSpecies() + ": " + pk3.chatter());
        System.out.println("Pokedex Data: " + pk3.getSpecies() + " is currently level " +
                           pk3.getLvl()+ " and knows the move " + pk3.getMove() +
                            ". Would you like it to learn a new move?\ny/n");
        pk3.setMove("Fire spin");
        System.out.println("User selected y.\nCharmander learned " + pk3.getMove() + "!");


        System.out.println("\ntoString() Data:");
        // calling toString()
        System.out.println(pk1.toString());
        System.out.println(pk2);
        System.out.println(pk3);
    }
}