package lab18_emp_code;

/**
 * Lab 18: Employee POJO Class with Automatic ID Generation (generateCode).
 * Run command: java -cp bin lab18_emp_code.EmployeeIdGeneratorDemo
 */
class Employee {
    private static int counter = 100;

    private String empId;
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empId = generateCode();
    }

    private String generateCode() {
        String firstPart = (firstName != null && firstName.length() >= 2) 
                ? firstName.substring(0, 2).toUpperCase() 
                : (firstName != null ? firstName.toUpperCase() : "XX");

        String lastPart = (lastName != null && lastName.length() >= 2) 
                ? lastName.substring(lastName.length() - 2).toUpperCase() 
                : (lastName != null ? lastName.toUpperCase() : "YY");

        int currentCount = ++counter;

        return firstPart + lastPart + currentCount;
    }

    public String getEmpId() { return empId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    public void displayDetails() {
        System.out.println("+--------------------------------------------------+");
        System.out.printf("| Employee ID   : %-32s |\n", empId);
        System.out.printf("| First Name    : %-32s |\n", firstName);
        System.out.printf("| Last Name     : %-32s |\n", lastName);
        System.out.println("+--------------------------------------------------+");
    }
}

public class EmployeeIdGeneratorDemo {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("     EMPLOYEE POJO & CODE GENERATOR DEMO         ");
        System.out.println("==================================================");

        Employee e1 = new Employee("John", "Smith");
        Employee e2 = new Employee("Dilip", "Kumar");
        Employee e3 = new Employee("Alice", "Johnson");

        System.out.println("\n--- Displaying Generated Employee Records ---");
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();

        System.out.println("==================================================");
    }
}
