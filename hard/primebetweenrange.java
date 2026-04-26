public class primebetweenrange {
    public static void main (String args[]){
        int lower = 10, upper = 50;
        System.out.println("Prime numbers between " + lower + " and " + upper + " are:");
        
        for (int num = lower; num <= upper; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // n is divisible by a number other than 1 and itself
            }
        }
        return true; // n is prime
    }   
}
