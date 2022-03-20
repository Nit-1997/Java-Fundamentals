package Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.acc();
        car.start();
        car.stop();
        car.brake();
    }

    // do not use interfaces casually in performance critical code
    //interface to interface extends then you have to override all
    // java 8 + we can provide default implementation for interfaces
}
