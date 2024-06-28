/*
 * Main class for application
 */
class PokemonClient {

    public static void main(String[] args) {
        //instances & properties
        Pokemon pk1 = new Pokemon();
        pk1.setLvl(20);
        pk1.setSpecies("Pikachu");
        pk1.setRival("Squirtle");
        pk1.setMove("Thundershock");
        pk1.setDamage("Super effective");
        pk1.setDefeated(true);

        //calling the instance/methods
        System.out.println("Pokemon 1:");
        String msg = pk1.chatter("~Pika pi!");
        System.out.println(pk1.getSpecies() + ": " + msg);
        pk1.attack();
        pk1.levelUp();
        pk1.evolve();


        Pokemon pk2 = new Pokemon();
        pk2.setLvl(10);
        pk2.setSpecies("Bulbasaur");
        pk2.setRival("Charmander");
        pk2.setMove("Vine Whip");
        pk2.setDamage("Not very effective");
        pk2.setDefeated(false);

        System.out.println("Pokemon 2:");
        msg = pk2.chatter("~Bulba..bulbaSAUR!");
        System.out.println(pk2.getSpecies() + ": " + msg);
        pk2.attack();
        pk2.levelUp();


        System.out.println("\ntoString() Data:");
        // calling toString()
        System.out.println(pk1.toString());
        System.out.println(pk2);
    }
}