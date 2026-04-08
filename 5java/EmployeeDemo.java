// Abstract class Employee and subclasses for abstraction demonstration
abstract class Employee {
    String name;
    int id;
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    double monthlySalary;
    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }
    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;
    PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee fte = new FullTimeEmployee("Amit", 1, 40000);
        Employee pte = new PartTimeEmployee("Priya", 2, 500, 20);
        System.out.println("Full Time Employee Salary: Rs. " + fte.calculateSalary());
        System.out.println("Part Time Employee Salary: Rs. " + pte.calculateSalary());
    }
}
