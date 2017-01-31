package com.evenstein.exercise.inheritance;

/**
 * Created by Vitaly on 16.01.2017.
 */
public class ManagerTest {

    public static void main(String... args) {

        Manager boss = new Manager("Cris Stuart", 95000, 2010, 04, 21);
        boss.setBonus(10000);

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Jason Bourne", 45000, 2008, 02, 29);
        staff[2] = new Employee("Condolisa Rice", 29000, 2012, 05, 9);

        for (Employee e:staff) {
            System.out.println(e.toString());
        }

    }

}
