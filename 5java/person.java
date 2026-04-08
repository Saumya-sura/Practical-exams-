class p{
    String name;
    int age;
    p(String name, int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Emp extends p{
    int empid;
    String dept;
    Emp(String name, int age, int empid, String dept){
        super(name, age);
        this.empid=empid;
        this.dept=dept;
    }
    void display_emp(){
        super.display();
        System.out.println("Employee ID: "+empid);
        System.out.println("Department: "+dept);
    }
}
class Manager extends Emp{
    int sal;
    Manager(String name, int age, int empid, String dept, int sal){
        super(name, age, empid, dept);
        this.sal=sal;
    }
    void display_man(){
        super.display_emp();
        System.out.println("Salary: "+sal);
    }


}
public class person {
        public static void main(String[] args) {
            Manager m = new Manager("Alice", 35, 101, "HR", 75000);
            m.display();
            m.display_emp();
            m.display_man();
        }
}
