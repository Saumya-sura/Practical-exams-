import java.util.Scanner;

public class inte{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       try{
        System.out.println("enter num");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("num is " + num);
       }catch(NumberFormatException e){
        System.out.println("NumberFormatException: " + e.getMessage());
       }finally{
        System.out.println("This block will always execute.");
    }

}}