package lab11_student_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * ============================================================================
 * LAB 11: STUDENT CLASS WITH DATE BIRTHDATE FIELD
 * ============================================================================
 * Add-on Relationship:
 *  - BUILDS UPON LAB 03 (Student Class concept) AND LAB 10 (SimpleDateFormat).
 *  - Adds a 'Date birthDate' instance variable to Student.
 *  - Prompts date input as String (dd/MM/yyyy) and parses it into java.util.Date.
 *
 * Eclipse Run Command: Right-click -> Run As -> Java Application
 * Command Line Run: java -cp bin lab11_student_date.StudentWithBirthDate
 * ============================================================================
 */
class Student {
    private static int idCounter = 100;

    private int studentId;
    private String name;
    private int mks1;
    private int mks2;
    private int mks3;
    private Date birthDate; // Add-on Date field

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Student(String name, int mks1, int mks2, int mks3, Date birthDate) {
        this.studentId = ++idCounter;
        this.name = name;
        this.mks1 = mks1;
        this.mks2 = mks2;
        this.mks3 = mks3;
        this.birthDate = birthDate;
    }

    public double calculateAverage() {
        return (mks1 + mks2 + mks3) / 3.0;
    }

    public void displayStudentDetails() {
        String formattedBirthDate = (birthDate != null) ? dateFormat.format(birthDate) : "N/A";
        System.out.println("+------------------------------------------------------+");
        System.out.printf("| Student ID    : %-36d |\n", studentId);
        System.out.printf("| Student Name  : %-36s |\n", name);
        System.out.printf("| Birth Date    : %-36s |\n", formattedBirthDate);
        System.out.printf("| Marks         : [%d, %d, %d] %-21s |\n", mks1, mks2, mks3, "");
        System.out.printf("| Average Marks : %-36.2f |\n", calculateAverage());
        System.out.println("+------------------------------------------------------+");
    }
}

public class StudentWithBirthDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        System.out.println("=== CREATE STUDENT OBJECT WITH BIRTH DATE ===");
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Marks 1: ");
        int mks1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Marks 2: ");
        int mks2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Marks 3: ");
        int mks3 = Integer.parseInt(scanner.nextLine());

        Date birthDate = null;
        boolean validDate = false;

        // Input validation loop for Date String parsing
        while (!validDate) {
            System.out.print("Enter Birth Date (dd/MM/yyyy): ");
            String dateInput = scanner.nextLine();

            try {
                birthDate = sdf.parse(dateInput);
                validDate = true;
            } catch (ParseException e) {
                System.out.println("Invalid Date Format! Please use 'dd/MM/yyyy' (e.g. 15/08/2002).");
            }
        }

        Student s = new Student(name, mks1, mks2, mks3, birthDate);

        System.out.println("\n--> Student Object Created Successfully!");
        s.displayStudentDetails();

        scanner.close();
    }
}
