/*
 * This Pokemon application allows the user to partake in a battle with their chosen species.
 */
class Pokemon {
    // properties or attributes (5-6 max)
    private int lvl = 5; // default 5, min level
    private String species; // constraint: ["Charmander", "Squirtle", "Bulbasaur", "Pikachu"]
    private String rival; // constraint: ["Charmander", "Squirtle", "Bulbasaur", "Pikachu"]
    private String move = "Run Away"; //defaulted move when none are chosen
    private String damage = "No effect"; // constraint: ["No effect", "Not very effective", "Effective", "Super Effective"]
    private Boolean isDefeated;

    // constructors


    // methods
    public void attack() {
        System.out.println(getSpecies() + " used " + getMove() + "!\n" + "It was " + getDamage() +
                ".\n" + "Opponent " + getRival() + " fainted? " + getDefeated());
        System.out.println();
    }

    public void levelUp() {
        System.out.println(getSpecies() + " has battled against " + getRival() + ".\n" + getSpecies() +
                " gained experience and has increased from level " + getLvl() + " to " + ++lvl + ".");
        System.out.println();
    }

    public void evolve() {
        System.out.println("Something is happening! " + getSpecies() + " is evolving.\n...\n" +
                "Congratulations on your new Pokemon!");
        System.out.println();
    }

    public String chatter(String message) {
        return message;
    }

    // getters and setters
    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
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
        return "Pokemon: species=" + getSpecies() + ", rival=" + getRival() + ", move=" + getMove() +
                ", damage=" + getDamage() + ", isDefeated=" + getDefeated();
    }
}