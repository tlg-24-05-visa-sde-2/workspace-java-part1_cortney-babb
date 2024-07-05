import java.time.LocalDate;
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
    private String species; // constraint: ["Pikachu", "Squirtle", "Bulbasaur", "Charmander"]
    private String rival; // constraint: ["Pikachu", "Squirtle", "Bulbasaur", "Charmander"]
    private String move = "Run Away"; // default move
    private DamageType damage = DamageType.NO_EFFECT; // default damage constraint: ["No effect",
                                         // "Not very effective", "Effective", "Very effective"]
    private boolean isDefeated;

    // constructors
    public Pokemon() {
    }

    public Pokemon(String species) {
        setSpecies(species);
    }

    public Pokemon(int lvl, String species, String rival, String move) {
        this(species); // delegates to lvl, species, move constructor above
        setLvl(lvl);
        setRival(rival);
        setMove(move);
    }

    public Pokemon(int lvl, String species, String rival, String move, DamageType damage, boolean isDefeated) {
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
            System.out.println("It had no effect.");
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
            System.out.println(getSpecies() + " gained experience and has increased from level " +
                    getLvl() + " to " + (++lvl) + ".");
        } else {
            isDefeated = false;
            System.out.println(getSpecies() + " has fainted.");
        }
        System.out.println();
    }

    // data validation: specific response types for evolution method
    public void evolve() {
        String msg1 = "Something is happening! " + getSpecies() + " is evolving.\n...\n";
        String msg2 = "\nCongratulations on your new Pokemon!\n";
        boolean isEvolving = false;

        // assigns an evolutionary level to each Pokemon and outputs executes evolution if it is true
        if (getSpecies().equals("Pikachu") && getLvl() >= 25) {
            isEvolving = true;
//            System.out.printf("╔═╦╦╦╦═╦═╦╦╦╗╔╗\n║║║║═╣═║╔╣╩║║║║\n║╔╣║║║║║╚╣║║╚╝║\n╚╝╚╩╩╩╩╩═╩╩╩══╝\n");
            System.out.println(msg1 + "Pikachu has evolved into Raichu." + msg2);

        } else if (getSpecies().equals("Squirtle") && getLvl() >= 32) {
            isEvolving = true;
            System.out.println(msg1 + "Squirtle has evolved into Wartortle." + msg2);

        } else if (getSpecies().equals("Charmander") && getLvl() >= 35) {
            isEvolving = true;
            System.out.println(msg1 + "Charmander has evolved into Charmeleon." + msg2);

        } else if (getSpecies().equals("Bulbasaur") && getLvl() >= 30) {
            isEvolving = true;
            System.out.println(msg1 + "Bulbasaur has evolved into Ivysaur." + msg2);

        }
        if (!isEvolving) {
            System.out.println(getSpecies() + " is not ready to evolve.\nCurrent level: " +
                    getLvl() + "\n");
        }
    }

    // assigns a sound effect to each Pokemon
    public String chatter() {
        String chat = "";
        if (getSpecies().equals("Pikachu")) {
            chat = "~Pika pi!";
        } else if (getSpecies().equals("Charmander")) {
            chat = "~Char!";
        } else if (getSpecies().equals("Squirtle")) {
            chat = "~Squirtle squirt!";
        } else if (getSpecies().equals("Bulbasaur")) {
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
            System.out.println("Error: " + lvl +
                    " is invalid. Level must be between " + MIN_LVL + " and " + MAX_LVL + " inclusive!");
        }
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        // validate a set of valid Pokemon, PokemonValidationTest
        if (species.equals("Pikachu") || species.equals("Charmander") || species.equals("Squirtle")
        || species.equals("Bulbasaur")) {
            this.species = species;
        } else {
            System.out.println("Error: Invalid Pokemon! Must select one of the following Kanto starters: " +
                    "Pikachu, Charmander, Squirtle, Bulbasaur");
        }
    }

    public String getRival() {
        return rival;
    }

    public void setRival(String rival) {
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
                "move=%s, damage=%s, isDefeated=%s", getSpecies(), getLvl(),
                getRival(), getMove(), getDamage(), getDefeated());
    }
}