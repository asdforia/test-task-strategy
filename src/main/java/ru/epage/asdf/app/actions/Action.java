package ru.epage.asdf.app.actions;

import ru.epage.asdf.app.persons.Person;

public interface Action {
    void execute(Person person);
}
