class Car{
    void  drive(){
        System.out.println("Car is driving");
    }

}
class Bike extends Car{
    void drive_bike(){
        System.out.println("Bike is driving");
    }
}
class Truck extends Car{
    void drive_truck(){
        System.out.println("Truck is driving");
    }
}
public class vehicle {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
        Truck t = new Truck();

        c.drive();
        b.drive_bike();
        t.drive_truck();
    }
}
