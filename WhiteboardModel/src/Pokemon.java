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

    public Pokemon(String species, String move) {
        this(species);
        setMove(move);
    }

    public Pokemon(int lvl, String species, String rival, String move, String damage, Boolean isDefeated) {
        // using this() to delegate to neighboring constructor above for species and move
        this(species, move);
        // delegate to setters
        setLvl(lvl);
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
        System.out.println("Something is happening! " + getSpecies() + " is evolving.\n...");
        if (getSpecies().equals("Pikachu")) {
            System.out.println("Pikachu has evolved into Raichu.");
        } else if (getSpecies().equals("Squirtle")) {
            System.out.println("Squirtle has evolved into Wartortle.");
        } else if (getSpecies().equals("Charmander")) {
            System.out.println("Charmander has evolved into Charmeleon.");
        } else if (getSpecies().equals("Bulbasaur")) {
            System.out.println("Bulbasaur has evolved into Ivysaur.");
        } else {
            System.out.println("Invalid species! Please select from the following starters:\n" +
                            "Pikachu, Charmander, Squirtle, Bulbasaur");
        }
        System.out.println("Congratulations on your new Pokemon!\n");
    }

    public String chatter(String message) {
        return message;
    }

    // data encapsulation: getters and setters
    public int getLvl() {
        return lvl;
    }
    // error handling / data constraint: level must be between 1 and 100 inclusive
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
        this.species = species;
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