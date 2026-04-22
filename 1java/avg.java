public class avg {
    public static void main (String[] args) {
        String name;
        int age;
        double marks1, marks2, marks3, average;
        // i want a phone number 10 digits
        long phoneNumber;
       
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.print("Enter marks of subject 1: ");
        marks1 = sc.nextDouble();
        System.out.print("Enter marks of subject 2: ");
        marks2 = sc.nextDouble();
        System.out.print("Enter marks of subject 3: ");
        marks3 = sc.nextDouble();
        System.out.print("Enter your phone number: ");
        phoneNumber = sc.nextLong();

        // calculating average
        average = (marks1 + marks2 + marks3) / 3;
        
    }
}
