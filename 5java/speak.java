class Person{
    void speak(){
        System.out.println("Person is speaking");
    }
}
class Teacher extends Person{
    void teach(){
        System.out.println("Teacher is teaching");
    }
}
class Student extends Person{
    void learn(){
        System.out.println("Student is learning");
    }
}
public class speak {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Student s = new Student();

        t.speak();
        t.teach();

        s.speak();
        s.learn();
    }
}
