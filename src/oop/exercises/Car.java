package oop.exercises;

public class Car {

    double gas;
    double efficiency;
    double start;




    public Car addGas(double litres) {
        return new Car(this.start, gas + litres);
    }

    public Car(double start, double gas, double efficiency) {
        this.start = start;
        this.gas = gas;
        this.efficiency = efficiency;
    }

    public Car(double start, double gas) {
        this.start = start;
        this.gas = gas;
        efficiency = start / gas;
    }

    public double getGas() {
        return gas;
    }

    public double getStart() {
        return start;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public Car distanceAndFuel(double distance) {
        return new Car(this.start + distance, gas - (distance / (gas / start) ) );
    }

    @Override
    public String toString() {
        return "Car{" +
                "gas=" + gas +
                ", efficiency=" + efficiency +
                ", start=" + start +
                "consumption" + gas / start +
                '}';
    }
}
