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
        String msg = pk1.chatter("~Pika pi!");
        System.out.println(pk1.getSpecies() + ": " + msg);
        pk1.attack();
        pk1.levelUp();
        pk1.evolve();


        Pokemon pk2 = new Pokemon(10, "Bulbasaur", "Charmander",
                    "Vine Whip", "Not very effective", false);
        System.out.println("Pokemon 2:");
        msg = pk2.chatter("~Bulba..bulbaSAUR!");
        System.out.println(pk2.getSpecies() + ": " + msg);
        pk2.attack();
        pk2.levelUp();

        // utilizes constraint and takes default values for lvl and move
        Pokemon pk3 = new Pokemon("Charmander");
        System.out.println("Pokemon 3:");
        System.out.println("Pokedex Data: " + pk3.getSpecies() + " is level " +
                            pk3.getLvl() + " and knows the move " + pk3.getMove() +
                            ". Would you like it to learn a new move?\ny/n");


        System.out.println("\ntoString() Data:");
        // calling toString()
        System.out.println(pk1.toString());
        System.out.println(pk2);
        System.out.println(pk3);
    }
}