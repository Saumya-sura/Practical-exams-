class Dog {
    String name;
    String color;

    // Parameterized constructor
    Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void printDetails() {
        System.out.println("Dog's Name: " + name);
        System.out.println("Dog's Color: " + color);
    }
}

public class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Brown");
        dog1.printDetails();
    }
}
