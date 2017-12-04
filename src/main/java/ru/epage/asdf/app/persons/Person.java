package ru.epage.asdf.app.persons;

import ru.epage.asdf.app.actions.Action;

import java.util.List;

/**
 * this class describes the behavior of a person
 * @author asdforia@github.com
 * @since 2017-12-04
 */
public class Person {

    private int health;
    private int flag;
    private List<Action> actions;

    /**
     * Person Constructor
     * @param actions list of skills and abilities of person
     */
    public Person(List<Action> actions) {
        this.health = 100;
        this.flag = 0;
        this.actions = actions;
    }

    /**
     * attack another person with random abilities
     * @param person attacked person
     */
    public void randomAttack(Person person) {
        actions.get((int)(Math.random() * actions.size())).execute(person);
    }

    /**
     * getting damage from another person
     * @param damage value of damage
     */
    public void getDamage(int damage) {
        this.health -= damage;
    }

    /**
     * setting flag value
     * @param flag flag value
     */
    public void setFlag(int flag) {
        this.flag = flag;
    }
}
