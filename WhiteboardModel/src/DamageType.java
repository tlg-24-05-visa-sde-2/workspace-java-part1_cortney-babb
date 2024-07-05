// enum list of values
enum DamageType {
    NO_EFFECT("No effect"),
    NOT_VERY_EFFECTIVE("Not very effective"),
    EFFECTIVE("Effective"),
    SUPER_EFFECTIVE("Super effective");

    private String display;

    // must be implicitly private
    DamageType(String display) {
        this.display = display;
    }
    public String getDisplay() {
        return display;
    }

    public String toString() {
        return getDisplay();
    }
}