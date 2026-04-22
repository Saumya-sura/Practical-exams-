
// B) Multilevel inheritance: Vehicle -> Car -> ElectricCar
class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }
}

class Car extends Vehicle {
    void fuelType() {
        System.out.println("Car uses petrol/diesel.");
    }
}

class ElectricCar extends Car {
    super.start(); // Call Vehicle's start method
    void batteryCapacity() {
        System.out.println("ElectricCar battery capacity: 60 kWh");
    }
}

public class VehicleDemoB {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        ec.start();
        ec.fuelType();
        ec.batteryCapacity();
    }
}
