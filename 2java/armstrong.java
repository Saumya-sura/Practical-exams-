import java.util.Scanner;
public class armstrong {
        public static void main (String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            int og = num;
            int n = 0, temp = num, sum = 0;
            // Count number of digits
            while (temp != 0) {
                n++;
                temp /= 10;
            }
            temp = num;
            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, n);
                temp /= 10;
            }
            if (og == sum) {
                System.out.println("The number is an armstrong number.");
            } else {
                System.out.println("The number is not an armstrong number.");
            }
        }
}