import java.time.*;

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
        pk2.rivalAttack("Scratch", DamageType.EFFECTIVE);
        pk2.attack();
        pk2.rivalAttack("Ember", DamageType.SUPER_EFFECTIVE);
        pk2.setDefeated(false);
        pk2.levelUp();
        pk2.evolve();

        // utilizes constraint with 3 arguments and takes default value for lvl
        Pokemon pk3 = new Pokemon(12, "Squirtle", "Pikachu", "Bubblebeam");
        System.out.println("Pokemon 3:\n" + pk3.getSpecies() + " vs " + pk3.getRival());
        System.out.println(pk3.getSpecies() + ": " + pk3.chatter());
        pk3.catching(false);
        pk3.rivalAttack("Growl", DamageType.NO_EFFECT);
        pk3.catching(true);


        System.out.println("\ntoString() Data:");
        // calling toString()
        System.out.println(pk1.toString());
        System.out.println(pk2);
        System.out.println(pk3);
    }
}