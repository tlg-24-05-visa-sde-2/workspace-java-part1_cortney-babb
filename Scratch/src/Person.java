import java.time.LocalDate;

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

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String toString() {
        return String.format("Name: name=%s, birthDate=%s", getName(), getBirthDate());
    }
}