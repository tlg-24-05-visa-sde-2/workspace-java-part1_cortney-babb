package net.people;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person person = new Person("Cort", LocalDate.of(1995, 10, 12));

        System.out.println(person.name() + " is " + person.currentAge() + " years old.");

        System.out.println(person);
    }
}