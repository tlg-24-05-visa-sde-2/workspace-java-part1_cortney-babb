// date/time usage + formatting
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * This Pokemon application allows the user to partake in a battle with their
 * chosen species from only the Kanto starters.
 */
class Pokemon {
    // static "shared" public fields not to be changed, min and max valid lvl
    // also class constants
    public static final int MIN_LVL = 1;
    public static final int MAX_LVL = 100;

    // properties or attributes w/ data encapsulation
    private int lvl = 5; // default 5
    // default with enum: ["Pikachu", "Squirtle", "Bulbasaur", "Charmander"]
    private PokemonSpecies species = PokemonSpecies.PIKACHU;
    private PokemonRival rival; // enum: ["Pikachu", "Squirtle", "Bulbasaur", "Charmander"]
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
            isDefeated = true;
            System.out.println("Enemy " + getRival() + " has been defeated!");
            System.out.println(getSpecies() + " gained experience and has increased from level "
                    + getLvl() + " to " + (++lvl) + ".");
        } else {
            isDefeated = false;
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
        if (getSpecies().equals(PokemonSpecies.PIKACHU)) {
            if (getLvl() >= evoLvl[0]){
                isEvolving = true;
                System.out.println(msg1 + getSpecies() + " has evolved into " +
                        evoSpecies[0] + msg2 + ".");
            } else {
                System.out.println(msg3 + evoLvl[0]);
            }
        } else if (getSpecies().equals(PokemonSpecies.SQUIRTLE)) {
            if (getLvl() >= evoLvl[1]){
                isEvolving = true;
                System.out.println(msg1 + getSpecies() + " has evolved into " +
                        evoSpecies[1] + msg2 + ".");
            } else {
                System.out.println(msg3 + evoLvl[1]);
            }
        } else if (getSpecies().equals(PokemonSpecies.CHARMANDER)) {
            if (getLvl() >= evoLvl[2]){
                isEvolving = true;
                System.out.println(msg1 + getSpecies() + " has evolved into " +
                        evoSpecies[2] + "." + msg2);
            } else {
                System.out.println(msg3 + evoLvl[2]);
            }
        } else if (getSpecies().equals(PokemonSpecies.BULBASAUR)) {
            if (getLvl() >= evoLvl[3]){
                isEvolving = true;
                System.out.println(msg1 + getSpecies() + " has evolved into " +
                        evoSpecies[3] + "." + msg2);
            } else {
                System.out.println(msg3 + evoLvl[3]);
            }
        }

        System.out.println();
    }

    // assigns a sound effect to each Pokemon
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
            isCaught = true;

            System.out.println("All right! The Pokemon was caught!");

            LocalDateTime caughtDay = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            String formatCaughtDay = caughtDay.format(formatter);
            System.out.println(getRival() + " was caught on " + formatCaughtDay);
        } else {
            isCaught = false;
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
        // validate a set of valid Pokemon, PokemonValidationTest
//        if (species.equals("Pikachu") || species.equals("Charmander") ||
//                species.equals("Squirtle") || species.equals("Bulbasaur")) {
//            this.species = species;
//        } else {
//            System.out.println("Error: Invalid Pokemon! Must select one of the following Kanto starters: "
//                    + "Pikachu, Charmander, Squirtle, Bulbasaur");
//        }
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
}