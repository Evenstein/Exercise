package com.evenstein.exercise.inheritance;

import java.util.Objects;

/**
 * Created by Vitaly on 16.01.2017.
 */
public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public String toString() {
        return super.toString()
                + "[bonus = " + bonus
                + "]";
    }

    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;

        Manager other = (Manager) otherObject;
        return Objects.equals(bonus, other.bonus);
    }

    public int hashCode() {
        return super.hashCode() + 30 * new Double(bonus).hashCode();
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

}
