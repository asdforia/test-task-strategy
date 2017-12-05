package ru.epage.asdf.app;

public class Action {
    String description() {
        return "attack!";
    }

    void execute() {
        System.out.println("execute");
    }
}
