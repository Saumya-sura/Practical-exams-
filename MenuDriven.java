import java.util.*;

public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Factorial");
            System.out.println("2. Palindrome");
            System.out.println("3. Type casting (ascii)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int n = sc.nextInt();
                    int fact = 1;
                    for (int i = 1; i <= n; i++) fact *= i;
                    System.out.println("Factorial of " + n + " is " + fact);
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    int rev = 0, temp = num;
                    while (temp != 0) {
                        rev = rev * 10 + temp % 10;
                        temp /= 10;
                    }
                    if (num == rev)
                        System.out.println(num + " is a Palindrome");
                    else
                        System.out.println(num + " is not a Palindrome");
                    break;
                case 3:
                    System.out.print("Enter a character: ");
                    char ch = sc.next().charAt(0);
                    int ascii = (int) ch;
                    System.out.println("ASCII value of '" + ch + "' is " + ascii);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
