// E) Abstract class Shape, Rectangle, Circle
abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class ShapeDemoE {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(5, 3);
        Shape s2 = new Circle(4);
        System.out.println("Rectangle Area: " + s1.calculateArea());
        System.out.println("Circle Area: " + s2.calculateArea());
    }
}
