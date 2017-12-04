package ru.epage.asdf.app.persons;

import ru.epage.asdf.app.actions.Action;

import java.util.List;

public class ElfMage extends Person {
    /**
     * Person Constructor
     *
     * @param actions list of skills and abilities of person
     */
    ElfMage(List<Action> actions) {
        super(actions);
    }
}
