package com.gamefreak;

// enum list of values

/**
 * JR: nothing wrong here, per se, but I thought damage was manifested as an int value,
 * which could be an attribute of eachw DamageType instance, just like a display-string.
 */
public enum DamageType {
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