public class sumofdigits {
        public static void main (String args[]){
            int number = 12345; 
            int sum = 0;
            int temp = number;
            
            while (temp > 0) {
                sum += temp % 10; // Add the last digit to sum
                temp /= 10; // Remove the last digit
            }
            
            System.out.println("The sum of the digits in " + number + " is: " + sum);
        }
}
