package oop;

import java.util.Objects;
import java.util.Random;

public class Employee {
    private final String name;
    protected double salary;
    private int id;
    private static int lastId = 0;
    private static final Random generator = new Random();

    public Employee() {
        name = "";
        salary = 0;
        id = 1 + generator.nextInt(1_000_000);
        lastId++;
        id = lastId;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary) {
        this.name = "";
        this.salary = salary;
    }

    public final String getName() {
        return name;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent/ 100;
        this.salary += raise;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public Employee getSupervisor() {
        return null;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name" +
                name + ",salary=" + salary + "]";
    }


    public final boolean equals(Object otherObject) {
        if(this == otherObject) return true;
        if(!(otherObject instanceof Employee)) return false;
        Employee other = (Employee) otherObject;
        return id == other.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, id);
    }
}
