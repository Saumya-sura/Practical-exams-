
class Bird {
    String name;
    int age;

    // No-argument constructor
    Bird() {
        this.name = "Unknown Bird";
        System.out.println("No-arg constructor: Name = " + this.name);
    }

    // Constructor with name
    Bird(String name) {
        this.name = name;
        System.out.println("One-arg constructor: Name = " + this.name);
    }

    // Constructor with name and age
    Bird(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Two-arg constructor: Name = " + this.name + ", Age = " + this.age);
    }
}


public class bird {
    public static void main(String[] args) {
        Bird b1 = new Bird();
        Bird b2 = new Bird("Parrot");
        Bird b3 = new Bird("Sparrow", 2);

        System.out.println("\nDisplaying bird names:");
        System.out.println("Bird 1: " + b1.name);
        System.out.println("Bird 2: " + b2.name);
        System.out.println("Bird 3: " + b3.name);
    }
}
