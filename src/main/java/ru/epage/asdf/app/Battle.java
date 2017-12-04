package ru.epage.asdf.app;

import ru.epage.asdf.app.teams.Team;

import java.util.ArrayList;
import java.util.List;

public class Battle {
    List<Team> teams = new ArrayList<Team>();

    public void addTeam(Team team) {
        this.teams.add(team);
    }

    public List<Team> getTeams() {
        return this.teams;
    }
}
