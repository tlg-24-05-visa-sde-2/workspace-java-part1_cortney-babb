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

    //methods
    public void attack() {
        System.out.println(species + " used " + move + "!\n" + "It was " + damage +
                ".\n" + "Opponent " + rival + " fainted? " + isDefeated);
        System.out.println();
    }

    public void levelUp() {
        System.out.println(species + " has battled against " + rival + ".\n" + species +
                " gained experience and has increased from level " + lvl + " to " + ++lvl + ".");
        System.out.println();
    }

    public void evolve() {
        System.out.println("Something is happening! " + species + " is evolving.\n...\n" +
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
        return "Pokemon: species=" + species + ", rival=" + rival + ", move=" + move +
                ", damage=" + damage + ", isDefeated=" + isDefeated;
    }
}