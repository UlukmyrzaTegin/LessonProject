package less_12_inheritance.exercises;

import org.w3c.dom.ls.LSOutput;

/**
 * TheSusanin
 * 09 март 2021
 */
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println("Name: " + name);
    }
}

