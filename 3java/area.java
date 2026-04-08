
class Room {
	private double length;
	private double breadth;

	// Constructor for square room
	Room(double side) {
		this.length = side;
		this.breadth = side;
	}

	// Constructor for rectangular room
	Room(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	double computeArea() {
		return length * breadth;
	}
}

public class area {
	public static void main(String[] args) {
		// Example: Square room
		Room squareRoom = new Room(5);
		System.out.println("Area of square room: " + squareRoom.computeArea());

		// Example: Rectangular room
		Room rectangularRoom = new Room(5, 8);
		System.out.println("Area of rectangular room: " + rectangularRoom.computeArea());
	}
}
