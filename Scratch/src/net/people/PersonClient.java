package net.people;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person person = new Person("Cort", LocalDate.of(1995, 10, 12));
        System.out.println(person.name() + " is " + person.currentAge() + " years old.");
        System.out.println(person);

        System.out.println();

        PersonRecord p2 = new PersonRecord("Malachi", LocalDate.of(2018, 11, 29));
        System.out.println(p2.name() + " is " + p2.currentAge() + " years old.");
        System.out.println(p2);
    }
}