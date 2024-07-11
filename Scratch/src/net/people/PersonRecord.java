package net.people;

import java.time.LocalDate;
import java.time.Period;

record PersonRecord(String name, LocalDate birthDate) {
    public int currentAge() {
        return Period.between(birthDate(), LocalDate.now()).getYears();
    }
}
