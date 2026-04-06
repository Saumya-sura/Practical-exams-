import java.util.Scanner;

public class revnum {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num =sc.nextInt();
        while (num!=0){
            int r=num%10;
            System.out.print(r);
            num=num/10;
        }
        
    }  
}
