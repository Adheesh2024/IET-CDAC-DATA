package lab23_sports_club;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ============================================================================
 * LAB 23: XYZ SPORTS CLUB EMPLOYEE & MEMBER MANAGEMENT SYSTEM
 * ============================================================================
 * Add-on Relationship:
 *  - CULMINATION OF EMPLOYEE INHERITANCE HIERARCHY CONCEPTS.
 *  - Extends Employee/Person hierarchy into an enterprise-style OOP design:
 *      Person (Abstract Base Class)
 *        ├── Member (Membership Type, Amount Paid)
 *        └── Employee (Abstract Class with Department, Designation, Joining Date)
 *             ├── SalariedEmployee (Basic + DA + HRA - PF)
 *             ├── ContractEmployee (Hrs Worked * Hourly Rate)
 *             └── Vendor (Base Amount + 18% GST)
 *
 * Eclipse Run Command: Right-click -> Run As -> Java Application
 * Command Line Run: java -cp bin lab23_sports_club.SportsClubManagement
 * ============================================================================
 */

abstract class Person {
    protected String id;
    protected String name;
    protected String mobileNo;
    protected String emailId;

    public Person(String id, String name, String mobileNo, String emailId) {
        this.id = id;
        this.name = name;
        this.mobileNo = mobileNo;
        this.emailId = emailId;
    }

    public String getId() { return id; }
    public String getName() { return name; }

    public abstract void displayDetails();
}

class Member extends Person {
    private static int memberCounter = 300;
    private String typeOfMembership;
    private double amountPaid;

    public Member(String name, String mobileNo, String emailId, String typeOfMembership, double amountPaid) {
        super("MEM" + (++memberCounter), name, mobileNo, emailId);
        this.typeOfMembership = typeOfMembership;
        this.amountPaid = amountPaid;
    }

    @Override
    public void displayDetails() {
        System.out.printf("[MEMBER]   ID: %-7s | Name: %-14s | Mob: %-11s | Type: %-8s | Paid: $%.2f\n",
                id, name, mobileNo, typeOfMembership, amountPaid);
    }
}

abstract class Employee extends Person {
    protected String department;
    protected String designation;
    protected String dateOfJoining;

    public Employee(String id, String name, String mobileNo, String emailId, String department, String designation, String dateOfJoining) {
        super(id, name, mobileNo, emailId);
        this.department = department;
        this.designation = designation;
        this.dateOfJoining = dateOfJoining;
    }

    public String getDepartment() { return department; }
    public String getDesignation() { return designation; }

    public abstract double calculateNetSalary();
}

class SalariedEmployee extends Employee {
    private static int empCounter = 100;
    private double basicSalary;

    public SalariedEmployee(String name, String mobileNo, String emailId, String department, String designation, String dateOfJoining, double basicSalary) {
        super("EMP" + (++empCounter), name, mobileNo, emailId, department, designation, dateOfJoining);
        this.basicSalary = basicSalary;
    }

    @Override
    public double calculateNetSalary() {
        double da = 0.10 * basicSalary;
        double hra = 0.15 * basicSalary;
        double pf = 0.12 * basicSalary;
        return basicSalary + da + hra - pf;
    }

    @Override
    public void displayDetails() {
        System.out.printf("[SALARIED] ID: %-7s | Name: %-14s | Dept: %-10s | Desig: %-10s | Net Salary: $%.2f\n",
                id, name, department, designation, calculateNetSalary());
    }
}

class ContractEmployee extends Employee {
    private static int empCounter = 150;
    private int hrsWorked;
    private double ratePerHour;

    public ContractEmployee(String name, String mobileNo, String emailId, String department, String designation, String dateOfJoining, int hrsWorked, double ratePerHour) {
        super("EMP" + (++empCounter), name, mobileNo, emailId, department, designation, dateOfJoining);
        this.hrsWorked = hrsWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    public double calculateNetSalary() {
        return hrsWorked * ratePerHour;
    }

    @Override
    public void displayDetails() {
        System.out.printf("[CONTRACT] ID: %-7s | Name: %-14s | Dept: %-10s | Desig: %-10s | Net Salary: $%.2f\n",
                id, name, department, designation, calculateNetSalary());
    }
}

class Vendor extends Employee {
    private static int vendorCounter = 200;
    private int noOfEmployees;
    private double amount;

    public Vendor(String name, String mobileNo, String emailId, String department, String designation, String dateOfJoining, int noOfEmployees, double amount) {
        super("VEN" + (++vendorCounter), name, mobileNo, emailId, department, designation, dateOfJoining);
        this.noOfEmployees = noOfEmployees;
        this.amount = amount;
    }

    @Override
    public double calculateNetSalary() {
        return amount + (amount * 0.18);
    }

    @Override
    public void displayDetails() {
        System.out.printf("[VENDOR]   ID: %-7s | Name: %-14s | Dept: %-10s | Employees: %-2d | Total Payout (inc GST): $%.2f\n",
                id, name, department, noOfEmployees, calculateNetSalary());
    }
}

public class SportsClubManagement {
    private static List<Person> clubRecords = new ArrayList<>();

    private static void seedData() {
        clubRecords.add(new SalariedEmployee("Alice Vance", "9876543210", "alice@xyz.com", "Sports", "Manager", "01-01-2023", 6000.0));
        clubRecords.add(new SalariedEmployee("Bob Carter", "9876543211", "bob@xyz.com", "Fitness", "Trainer", "15-03-2023", 4500.0));
        clubRecords.add(new ContractEmployee("Charlie Day", "9876543212", "charlie@xyz.com", "Fitness", "Trainer", "10-05-2023", 160, 25.0));
        clubRecords.add(new Vendor("Apex Security", "9876543213", "vendor@apex.com", "Security", "Vendor", "01-06-2023", 10, 10000.0));
        clubRecords.add(new Member("David Miller", "9876543214", "david@gmail.com", "Gold", 1200.0));
        clubRecords.add(new Member("Eve Adams", "9876543215", "eve@gmail.com", "Platinum", 2500.0));
    }

    public static void main(String[] args) {
        seedData();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n========= XYZ SPORTS CLUB MANAGEMENT SYSTEM =========");
            System.out.println("1. Display Employees (Filter by Type)");
            System.out.println("2. Search Record by ID");
            System.out.println("3. Search Record by Name");
            System.out.println("4. Display All Club Records (Employees & Members)");
            System.out.println("5. Calculate & Display Salary by Designation");
            System.out.println("6. Display Employees of a Particular Department");
            System.out.println("7. Exit");
            System.out.print("Enter choice (1-7): ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Select Employee Type to Display:");
                    System.out.println(" 1. Salaried Employees");
                    System.out.println(" 2. Contract Employees");
                    System.out.println(" 3. Vendors");
                    System.out.println(" 4. All Employees");
                    System.out.print("Choice: ");
                    int typeChoice = Integer.parseInt(scanner.nextLine());
                    
                    System.out.println("\n--- Filtered Employee List ---");
                    for (Person p : clubRecords) {
                        if (p instanceof Employee) {
                            if (typeChoice == 1 && p instanceof SalariedEmployee) p.displayDetails();
                            else if (typeChoice == 2 && p instanceof ContractEmployee) p.displayDetails();
                            else if (typeChoice == 3 && p instanceof Vendor) p.displayDetails();
                            else if (typeChoice == 4) p.displayDetails();
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter Search ID: ");
                    String searchId = scanner.nextLine();
                    boolean foundId = false;
                    for (Person p : clubRecords) {
                        if (p.getId().equalsIgnoreCase(searchId)) {
                            System.out.println("--> Record Found:");
                            p.displayDetails();
                            foundId = true;
                            break;
                        }
                    }
                    if (!foundId) System.out.println("--> Record with ID '" + searchId + "' not found.");
                    break;

                case 3:
                    System.out.print("Enter Search Name: ");
                    String searchName = scanner.nextLine();
                    boolean foundName = false;
                    for (Person p : clubRecords) {
                        if (p.getName().equalsIgnoreCase(searchName)) {
                            p.displayDetails();
                            foundName = true;
                        }
                    }
                    if (!foundName) System.out.println("--> Record with Name '" + searchName + "' not found.");
                    break;

                case 4:
                    System.out.println("\n--- ALL CLUB RECORDS ---");
                    for (Person p : clubRecords) {
                        p.displayDetails();
                    }
                    break;

                case 5:
                    System.out.print("Enter Designation: ");
                    String desig = scanner.nextLine();
                    System.out.println("\n--- Employees with Designation '" + desig + "' ---");
                    for (Person p : clubRecords) {
                        if (p instanceof Employee) {
                            Employee emp = (Employee) p;
                            if (emp.getDesignation().equalsIgnoreCase(desig)) {
                                System.out.printf("Name: %-15s | Net Salary/Payout: $%.2f\n", emp.getName(), emp.calculateNetSalary());
                            }
                        }
                    }
                    break;

                case 6:
                    System.out.print("Enter Department: ");
                    String dept = scanner.nextLine();
                    System.out.println("\n--- Employees in Department '" + dept + "' ---");
                    int count = 0;
                    for (Person p : clubRecords) {
                        if (p instanceof Employee) {
                            Employee emp = (Employee) p;
                            if (emp.getDepartment().equalsIgnoreCase(dept)) {
                                emp.displayDetails();
                                count++;
                                if (count == 5) break;
                            }
                        }
                    }
                    if (count == 0) System.out.println("No employees found in department '" + dept + "'.");
                    break;

                case 7:
                    System.out.println("Exiting XYZ Sports Club Management. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }

        } while (choice != 7);

        scanner.close();
    }
}
