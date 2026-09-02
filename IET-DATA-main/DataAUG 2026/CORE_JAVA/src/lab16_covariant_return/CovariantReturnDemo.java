package lab16_covariant_return;

/**
 * Lab 16: Demonstrating Covariant Return Type in Java Inheritance.
 * Run command: java -cp bin lab16_covariant_return.CovariantReturnDemo
 */
class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public Employee getObject() {
        System.out.println("--> Base Class Employee.getObject() invoked");
        return this;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
    }
}

class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public SalariedEmployee getObject() {
        System.out.println("--> Subclass SalariedEmployee.getObject() invoked (Covariant Return Type)");
        return this;
    }

    public void displaySalaryDetails() {
        System.out.printf("Salaried Employee: %-15s | Monthly Salary: $%.2f\n", name, monthlySalary);
    }
}

public class CovariantReturnDemo {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("    COVARIANT RETURN TYPE DEMONSTRATION IN JAVA   ");
        System.out.println("==================================================");

        Employee emp = new Employee("John Doe");
        Employee empRef = emp.getObject();
        empRef.displayDetails();

        System.out.println("\n--------------------------------------------------");

        SalariedEmployee salariedEmp = new SalariedEmployee("Alice Smith", 8500.00);
        SalariedEmployee salariedRef = salariedEmp.getObject();
        salariedRef.displaySalaryDetails();

        System.out.println("==================================================");
    }
}
