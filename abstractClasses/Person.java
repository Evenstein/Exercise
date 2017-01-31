package com.evenstein.exercise.abstractClasses;

/**
 * Created by Vitaly on 16.01.2017.
 */
public abstract class Person {

    public abstract String getDescription();
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
