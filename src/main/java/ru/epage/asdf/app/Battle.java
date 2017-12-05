package ru.epage.asdf.app;

import ru.epage.asdf.app.teams.Team;

import java.util.List;

public class Battle {
    List<Team> teams;

    Team nextMove() {
        return this.teams.get((int)(Math.random() * this.teams.size()));
    }

    void createPairOppositeForce(List<Team> allteams) {
        this.teams.add(allteams.get((int)(Math.random()) * allteams.size()));
        Team temp = allteams.get((int)(Math.random()) * allteams.size());
        do {
            temp = allteams.get((int)(Math.random()) * allteams.size());
        } while (this.teams.get(0).getType() == !temp.getType());

    }
}
