class Student{
    String name;
    int rn;
    int marks;

    // Constructor to initialize student details
    Student(String name, int rn, int marks){
        this.name=name;
        this.rn=rn;
        this.marks=marks;
    }

    // Method to display student details
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+rn);
        System.out.println("Marks: "+marks);
    }

    // Method to calculate total marks (single subject)
    void total(){
        System.out.println("Total marks: "+marks);
    }

    // Overloaded method to calculate total marks (multiple subjects)
    int total(int... subjectMarks) {
        int sum = 0;
        for (int m : subjectMarks) {
            sum += m;
        }
        return sum;
    }
}

public class college {
    public static void main(String[] args) {
        // Initialize student details using constructor
        Student s1 = new Student("Amit", 101, 85);
        s1.display();
        s1.total();

        // Calculate total marks using method overloading
        int totalMarks = s1.total(80, 90, 85, 75, 88); // Example marks for 5 subjects
        System.out.println("Total marks (5 subjects): " + totalMarks);
    }
}
