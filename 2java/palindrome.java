import java.util.Scanner;

public class palindrome {
    public  static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num ");
        int num = sc.nextInt();
        int og =num;
        int r=0;
        while(num!=0){
            r=r*10+num%10;
            num=num/10;
        }
        if(og==r){
            System.out.println("The number is a palindrome.");
        }
        else{
            System.out.println("The number is not a palindrome.");
        }

        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("The string is a palindrome.");
        }
        else{
            System.out.println("The string is not a palindrome.");
        }

        // String reverse using StringBuilder
        System.out.println("Enter a string: ");
        String str2 = sc.nextLine();
        StringBuilder sb = new StringBuilder(str2);
        sb.reverse();
        if(str2.equals(sb.toString())){
            System.out.println("The string is a palindrome.");
        }
        else{
            System.out.println("The string is not a palindrome.");
        }
        
        
    }
}
