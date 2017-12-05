package ru.epage.asdf.app.teams;

import ru.epage.asdf.app.Warrior;

import java.util.List;

public class Elfs implements Team {

    List<Warrior> warriors;
    private boolean type;

    @Override
    public void attack() {
    }

    @Override
    public boolean getType() {
        return this.type;
    }
}
