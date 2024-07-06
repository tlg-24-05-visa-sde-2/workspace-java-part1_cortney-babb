// enum list of values
enum DamageType {
    NO_EFFECT("No effect"),
    NOT_VERY_EFFECTIVE("Not very effective"),
    EFFECTIVE("Effective"),
    SUPER_EFFECTIVE("Super effective");

    private String damage;

    // must be implicitly private
    DamageType(String damage) {
        this.damage = damage;

    }
    public String getDamage() {
        return damage;
    }

    public String toString() {
        return getDamage();
    }
}