package ru.epage.asdf.app.actions;

import ru.epage.asdf.app.persons.Person;

public class ElfMageSpecial implements Action {

    public void execute(Person person) {
        person.setFlag(1);
    }
}
