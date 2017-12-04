package ru.epage.asdf.app.teams;

import ru.epage.asdf.app.persons.Person;

import java.util.ArrayList;
import java.util.List;

public class ElfTeam implements Team {
    public List<Person> warriors = new ArrayList<Person>();
    public List<Person> maniacWarriors = new ArrayList<Person>();
    public ElfTeam() {
        super();
    }

}
