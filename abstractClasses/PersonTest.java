package com.evenstein.exercise.abstractClasses;

/**
 * Created by Vitaly on 16.01.2017.
 */
public class PersonTest {

    public static void main(String... args) {

        Person[] people = new Person[2];

        people[0] = new Employee("Jason Bourne", 45000, 2008, 02, 29);
        people[1] = new Student("Mike Tyson", "computer science");

        for (Person p:people) {
            System.out.println( p.getName() + ", " + p.getDescription());
        }

    }

}
