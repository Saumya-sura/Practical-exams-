import java.util.*;
public class menu {
        public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
int choice; 
do { 
System.out.println("1.Factorial 2.Palindrome 3.ASCII 4.Exit"); 
choice = sc.nextInt(); 
switch(choice) { 
case 1: 
 
int n = sc.nextInt(); 

 int fact = 1; 
                    for(int i=1;i<=n;i++) fact*=i; 
                    System.out.println(fact); 
                    break;

 case 2: 
                    int num = sc.nextInt(), rev=0, temp=num; 
                    while(num>0){ 
                        rev = rev*10 + num%10; 
                        num/=10; 
                    } 
                    System.out.println(temp==rev?"Palindrome":"Not Palindrome"); 
                    break; 
 
                case 3: 
                    char ch = sc.next().charAt(0); 
                    System.out.println((int)ch); 
                    break; 
                }


}while(choice!=4); 
}
}
