package com.evenstein.exercise.inheritance;

import java.util.ArrayList;

/**
 * Created by evenstein on 19.01.17.
 */
public class ArrayListTest {

    public static void main(String... args) {

        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new Employee("Jason Bourne", 45000, 2008, 02, 29));
        staff.add(new Employee("Condolisa Rice", 29000, 2012, 05, 9));
        staff.add(new Employee("Cris Stuart", 95000, 2010, 04, 21));

        for (Employee e:staff) {
            e.raiseSalary(5);
        }

        for (Employee e:staff) {
            System.out.print("Name = " + e.getName() + ", salary = " + e.getSalary()
            + ", hireDay = " + e.getHireDay());
            System.out.println();
        }

        Integer a = 100;
        Integer b = 100;
        if (a == b)
            System.out.println(true);
        else
            System.out.println(false);

    }

}
