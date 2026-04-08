import java.util.Scanner;

class Student{
    String name;
    int rn;
    Double m1,m2,m3;
    Student(String name, int rn, Double m1, Double m2, Double m3){
        this.name=name;
        this.rn=rn;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    double ComputeAvg(){
        return (m1+m2+m3)/3;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+rn);
        System.out.println("Marks: "+m1+", "+m2+", "+m3);
        System.out.println("Average Marks: "+ComputeAvg());
    }
}

public class stu {
        public static void main (String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter roll number: ");
            int rn = sc.nextInt();
            System.out.print("Enter marks for 3 subjects: ");
            Double m1 = sc.nextDouble();
            Double m2 = sc.nextDouble();
            Double m3 = sc.nextDouble();

            Student s1 = new Student(name, rn, m1, m2, m3);
            s1.display();
        }
}
