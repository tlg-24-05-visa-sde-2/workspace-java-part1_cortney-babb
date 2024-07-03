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
    private String damage = "No effect"; // default damage constraint: ["No effect",
                                         // "Not very effective", "Effective", "Very effective"]
    private Boolean isDefeated;

    // constructors
    public Pokemon() { // default
    }

    public Pokemon(String species) {
        setSpecies(species);
    }

    public Pokemon(int lvl, String species, String move) {
        this(species); // delegates to species constructor above
        setLvl(lvl);
        setMove(move);
    }

    public Pokemon(int lvl, String species, String rival, String move, String damage, Boolean isDefeated) {
        // using this() to delegate to neighboring constructor above for lvl, species and move
        this(lvl, species, move);
        // delegate to setters
        setRival(rival);
        setDamage(damage);
        setDefeated(isDefeated);
    }

    // business or "action" methods
    public void attack() {
        System.out.println(getSpecies() + " used " + getMove() + "!\n" +
                "It was " + getDamage() + ".\n" + "Opponent " +
                getRival() + " fainted? " + getDefeated());
        System.out.println();
    }

    public void levelUp() {
        System.out.println(getSpecies() + " has battled against " +
                getRival() + ".\n" + getSpecies() +
                " gained experience and has increased from level " +
                getLvl() + " to " + ++lvl + ".");
        System.out.println();
    }
    // data validation: specific response types for evolution method
    public void evolve() {
        String msg1 = "Something is happening! " + getSpecies() + " is evolving.\n...\n";
        String msg2 = "\nCongratulations on your new Pokemon!\n";
        int evolveLvl = 0;
        boolean isEvolving = false;
        // assigns an evolutionary level to each Pokemon and outputs executes evolution if it is true
        if (getSpecies().equals("Pikachu") && getLvl() == 25) {
            evolveLvl = 25;
            isEvolving = true;
            if (getLvl() >= 25) {
                System.out.println(msg1 + "Pikachu has evolved into Raichu." + msg2);
            }
        } else if (getSpecies().equals("Squirtle") && getLvl() >= 32) {
            evolveLvl = 32;
            isEvolving = true;
            if (getLvl() >= 32) {
                System.out.println(msg1 + "Squirtle has evolved into Wartortle." + msg2);
            }
        } else if (getSpecies().equals("Charmander") && getLvl() >= 35) {
            evolveLvl = 35;
            isEvolving = true;
            if (getLvl() >= 35) {
                System.out.println(msg1 + "Charmander has evolved into Charmeleon." + msg2);
            }
        } else if (getSpecies().equals("Bulbasaur") && getLvl() >= 30) {
            evolveLvl = 30;
            isEvolving = true;
            if (getLvl() >= 30) {
                System.out.println(msg1 + "Bulbasaur has evolved into Ivysaur." + msg2);
            }
        }
        // checks to see if pokemon is at evolution level to display message/lvl if it is ready or not
        if (!isEvolving) {
            System.out.println(getSpecies() + " is not ready to evolve.\nCurrent level: " +
                    getLvl() + "\n");
        } else {
            System.out.println(getSpecies() + " evolved at level " + evolveLvl + ".\n");
        }

    }



    // assigns a message to each Pokemon
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
                    " is invalid. Level must be between" + MIN_LVL + " and " + MAX_LVL + " inclusive!");
        }
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        // validate a set of valid Pokemon
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

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public Boolean getDefeated() {
        return isDefeated;
    }

    public void setDefeated(Boolean defeated) {
        isDefeated = defeated;
    }

    // toString()
    public String toString() {
        return "Pokemon: species=" + getSpecies() + ", level=" + getLvl() +
                ", rival=" + getRival() + ", move=" + getMove() +
                ", damage=" + getDamage() + ", isDefeated=" + getDefeated();
    }
}