// D) Method overriding: Vehicle, Car, Bike
class Vehicle {
    void maxSpeed() {
        System.out.println("Vehicle max speed: 100 km/h");
    }
}

class Car extends Vehicle {
    @Override
    void maxSpeed() {
        System.out.println("Car max speed: 180 km/h");
    }
}

class Bike extends Vehicle {
    @Override
    void maxSpeed() {
        System.out.println("Bike max speed: 120 km/h");
    }
}

public class VehicleDemoD {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.maxSpeed();
        v2.maxSpeed();
    }
}
