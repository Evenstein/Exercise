package com.evenstein.exercise.interfaces;

import java.util.Arrays;

/**
 * Created by Vitaly on 16.01.2017.
 */
public class ManagerTest {

    public static void main(String... args) {

        /*com.evenstein.exercise.inheritance.Manager boss = new Manager("Cris Stuart", 95000, 2010, 04, 21);
        boss.setBonus(10000);*/

        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Donald Trump", 95000, 2008, 02, 29);;
        staff[1] = new Employee("Jason Bourne", 45000, 2008, 02, 29);
        staff[2] = new Employee("Condolisa Rice", 29000, 2012, 05, 9);

        Arrays.sort(staff);

        for (Employee e:staff) {
            System.out.println("name = " + e.getName() + ", salary = " + e.getSalary()
            + ", hire day = " + e.getHireDay());
        }

    }

}
