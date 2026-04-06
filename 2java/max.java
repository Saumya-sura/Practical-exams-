import java.util.Scanner;

class max{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number:");
        int num3 = sc.nextInt();
        int max = Math.max(num1, Math.max(num2, num3));
        System.out.println("The maximum number is: " + max);
        int min = Math.min(num1, Math.min(num2, num3));
        int total = num1 + num2 + num3;
        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
        System.out.println("The total of the three numbers is: " + total);
        System.out.println("The average of the three numbers is: " + (total / 3.0));
        
    }
}