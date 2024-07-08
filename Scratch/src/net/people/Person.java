package net.people;

import java.time.LocalDate;
import java.time.Period;

/*
 * An immutable class
 * A class definition written in such a way that instances of it (person objects),
 * once created cannot have their fields or "instance variables" changed
 * there are no public methods to do so, getters but no setters
 */
class Person {
    private final String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    /*
     * Returns person's age in whole years
     * This is the period of time between birthdate and today's date
     * Derived property - calculated from existing data, not a new field
     */
    public int currentAge() {
        Period periodBetween = Period.between(birthDate(), LocalDate.now());
        return periodBetween.getYears();
    }

    public String name() {
        return name;
    }

    public LocalDate birthDate() {
        return birthDate;
    }

    public String toString() {
        return String.format("Name: name=%s, birthDate=%s", name(), birthDate());
    }
}