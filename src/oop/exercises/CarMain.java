package oop.exercises;

public class CarMain {
    public static void main(String[] args) {



        Car p = new Car(100, 100).addGas(5).distanceAndFuel(100);
        System.out.println(p);

    }
}
