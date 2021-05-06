package inheritanceAndReflection;

import oop.Employee;

public class Manager extends Employee {

    private double bonus;

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public Employee getSupervisor() {
        return super.getSupervisor();
    }

    public Manager(String name, double salary) {
        super(name, salary); // из класса Employee
        bonus = 0;
    }

    @Override
    public String toString() {
        return super.toString() + "[bonus=" + bonus + "]";
    }
}
