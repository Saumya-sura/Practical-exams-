import java.util.Scanner;

public class divbyzero {
    public static void main (String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            System.out.println("Enter 2 numebr");
            int n2 = sc.nextInt();
            int result = num / n2;
            System.out.println("Result: " + result);
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("This block will always execute.");
        }
    }
}
