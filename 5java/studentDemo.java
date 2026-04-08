import java.util.Scanner;

class student {
    String name;
    int rollno;
    String dob;

    void Inputdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        rollno = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter date of birth (dd/mm/yyyy): ");
        dob = sc.nextLine();
    }
}

class marks extends student {
    int m1, m2, m3;
    int total;
    float percentage;
    char grade;

    void readdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for subject 1 (out of 100): ");
        m1 = sc.nextInt();
        System.out.print("Enter marks for subject 2 (out of 100): ");
        m2 = sc.nextInt();
        System.out.print("Enter marks for subject 3 (out of 100): ");
        m3 = sc.nextInt();
    }

    void compute() {
        total = m1 + m2 + m3;
        percentage = total / 3.0f;
        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 80)
            grade = 'B';
        else if (percentage >= 70)
            grade = 'C';
        else if (percentage >= 60)
            grade = 'D';
        else
            grade = 'F';
    }

    void show() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Marks in Subject 1: " + m1);
        System.out.println("Marks in Subject 2: " + m2);
        System.out.println("Marks in Subject 3: " + m3);
        System.out.println("Total Marks: " + total);
        System.out.printf("Percentage: %.2f\n", percentage);
        System.out.println("Grade: " + grade);
    }
}

public class studentDemo {
    public static void main(String[] args) {
        marks m = new marks();
        m.Inputdata();
        m.readdata();
        m.compute();
        m.show();
    }
}
