// Shape interface with area and perimeter methods
interface Shape {
	double area();
	double perimeter();
}

// Circle class implementing Shape
class Circle implements Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double area() {
		return Math.PI * radius * radius;
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}
}

// Rectangle class implementing Shape
class Rectangle implements Shape {
	private double length, width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double area() {
		return length * width;
	}

	public double perimeter() {
		return 2 * (length + width);
	}
}

// Demo class to test the implementation
public class shape {
	public static void main(String[] args) {
		Shape c = new Circle(5);
		Shape r = new Rectangle(4, 6);
		System.out.println("Circle area: " + c.area());
		System.out.println("Circle perimeter: " + c.perimeter());
		System.out.println("Rectangle area: " + r.area());
		System.out.println("Rectangle perimeter: " + r.perimeter());
	}
}
