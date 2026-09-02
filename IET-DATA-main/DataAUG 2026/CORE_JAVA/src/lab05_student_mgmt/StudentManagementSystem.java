package lab05_student_mgmt;

import java.util.Scanner;

/**
 * ============================================================================
 * LAB 05: STUDENT MANAGEMENT SYSTEM (ARRAY CRUD OPERATIONS)
 * ============================================================================
 * Add-on Relationship:
 *  - BUILDS UPON LAB 03 (Student Class concept).
 *  - Extends Lab 03 by managing an array of 5 Student objects with CRUD operations:
 *    1) Search Student by ID
 *    2) Search Student by Name (Case-insensitive)
 *    3) Delete Student by ID (Left-shifting array elements)
 *    4) Display All Active Records
 *
 * Eclipse Run Command: Right-click -> Run As -> Java Application
 * Command Line Run: java -cp bin lab05_student_mgmt.StudentManagementSystem
 * ============================================================================
 */
class StudentModel {
    private static int idGenerator = 100;

    private int studentId;
    private String name;
    private int mks1;
    private int mks2;
    private int mks3;

    public StudentModel(String name, int mks1, int mks2, int mks3) {
        this.studentId = ++idGenerator;
        this.name = name;
        this.mks1 = mks1;
        this.mks2 = mks2;
        this.mks3 = mks3;
    }

    public int getStudentId() { return studentId; }
    public String getName() { return name; }

    public double calculateAverage() {
        return (mks1 + mks2 + mks3) / 3.0;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %-12s | Marks: (%d, %d, %d) | Avg: %.2f", 
                studentId, name, mks1, mks2, mks3, calculateAverage());
    }
}

public class StudentManagementSystem {
    private static final int CAPACITY = 5;
    private static StudentModel[] students = new StudentModel[CAPACITY];
    private static int currentCount = 0;

    /**
     * Displays all active non-null student records in the database.
     */
    public static void displayAllStudents() {
        if (currentCount == 0) {
            System.out.println("No student records available.");
            return;
        }
        System.out.println("\n---------------- ACTIVE STUDENT RECORDS ----------------");
        for (int i = 0; i < currentCount; i++) {
            System.out.println("[" + (i + 1) + "] " + students[i]);
        }
        System.out.println("-------------------------------------------------------");
    }

    /**
     * Searches for a student by unique ID.
     */
    public static void findById(int searchId) {
        for (int i = 0; i < currentCount; i++) {
            if (students[i].getStudentId() == searchId) {
                System.out.println("\n--> Student Found by ID " + searchId + ":");
                System.out.println(students[i]);
                return;
            }
        }
        System.out.println("\n--> Student with ID " + searchId + " not found.");
    }

    /**
     * Searches for student(s) by name using case-insensitive matching.
     */
    public static void findByName(String searchName) {
        boolean found = false;
        System.out.println("\n--> Search Results for Name '" + searchName + "':");
        for (int i = 0; i < currentCount; i++) {
            if (students[i].getName().equalsIgnoreCase(searchName)) {
                System.out.println(students[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No student found with name '" + searchName + "'.");
        }
    }

    /**
     * Deletes a student by ID by shifting subsequent elements left to maintain array continuity.
     */
    public static void deleteById(int targetId) {
        int indexToDelete = -1;
        for (int i = 0; i < currentCount; i++) {
            if (students[i].getStudentId() == targetId) {
                indexToDelete = i;
                break;
            }
        }

        if (indexToDelete == -1) {
            System.out.println("\n--> Cannot delete: Student ID " + targetId + " not found.");
            return;
        }

        String deletedName = students[indexToDelete].getName();

        // Element Shifting Logic
        for (int i = indexToDelete; i < currentCount - 1; i++) {
            students[i] = students[i + 1];
        }
        students[currentCount - 1] = null;
        currentCount--;

        System.out.println("\n--> Success: Deleted Student [ID: " + targetId + ", Name: " + deletedName + "]");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Initializing Student Database (" + CAPACITY + " Records) ===");
        for (int i = 0; i < CAPACITY; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Marks 1: ");
            int mks1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Marks 2: ");
            int mks2 = Integer.parseInt(scanner.nextLine());
            System.out.print("Marks 3: ");
            int mks3 = Integer.parseInt(scanner.nextLine());

            students[currentCount++] = new StudentModel(name, mks1, mks2, mks3);
        }

        displayAllStudents();

        int choice;
        do {
            System.out.println("\n========= STUDENT MANAGEMENT MENU =========");
            System.out.println("1. Find Student by ID");
            System.out.println("2. Find Student by Name");
            System.out.println("3. Delete Student by ID");
            System.out.println("4. Display All Active Students");
            System.out.println("5. Exit");
            System.out.print("Enter choice (1-5): ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter ID to search: ");
                    findById(Integer.parseInt(scanner.nextLine()));
                    break;
                case 2:
                    System.out.print("Enter Name to search: ");
                    findByName(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Enter ID to delete: ");
                    deleteById(Integer.parseInt(scanner.nextLine()));
                    break;
                case 4:
                    displayAllStudents();
                    break;
                case 5:
                    System.out.println("Exiting System.");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

        } while (choice != 5);

        scanner.close();
    }
}
