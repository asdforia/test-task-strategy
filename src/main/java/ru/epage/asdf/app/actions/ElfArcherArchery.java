package ru.epage.asdf.app.actions;

import ru.epage.asdf.app.persons.Person;

public class ElfArcherArchery implements Action {
    public void execute(Person person) {
        person.getDamage(7);
    }
}
