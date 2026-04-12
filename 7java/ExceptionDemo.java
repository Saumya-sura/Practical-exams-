import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50}; // array of size 5

        try {
            // Taking number input
            System.out.print("Enter a number: ");
            String numInput = sc.next();  // take as string first
            int number = Integer.parseInt(numInput); // may throw NumberFormatException

            // Taking index input
            System.out.print("Enter an index (0-4): ");
            int index = sc.nextInt(); // may throw InputMismatchException

            // Access array element
            int value = arr[index]; // may throw ArrayIndexOutOfBoundsException

            // Perform division
            int result = value / number; // may throw ArithmeticException

            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Input number is not a valid integer.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds for array of size 5.");

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");

        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        }

        sc.close();
    }
}