package com.evenstein.exercise.interfaces;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Created by Vitaly on 16.01.2017.
 */
public class Employee implements Comparable<Employee>, Cloneable {

    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public Employee clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.hireDay = (LocalDate) super.clone();
        return cloned;
    }

    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }

    public String toString() {
        return getClass().getName()
                + " [name = " + name
                + ", salary = " + salary
                + ", hireDay = " + hireDay
                + "]";
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;

        if (this == null) return false;

        if (getClass() != otherObject.getClass()) return false;

        Employee other = (Employee) otherObject;
        return Objects.equals(name, other.name)
                && Objects.equals(salary, other.salary)
                && Objects.equals(hireDay, other.hireDay);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary, o.salary);
    }
}
