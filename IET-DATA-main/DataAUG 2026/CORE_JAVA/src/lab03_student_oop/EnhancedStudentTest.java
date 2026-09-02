package lab03_student_oop;

/**
 * ============================================================================
 * LAB 03: BASE STUDENT CLASS (ENCAPSULATION, AUTO-ID, GETTERS/SETTERS)
 * ============================================================================
 * Relationship: Base Student Model Class (foundation for Lab 05, Lab 11, and Lab 12)
 *
 * Concepts Covered:
 *  1. Private member variables for Encapsulation (studentId, name, mks1, mks2, mks3).
 *  2. Programmatically auto-generated unique student IDs using static counter.
 *  3. Default and Parameterized Constructors.
 *  4. Accessor (Getters) and Mutator (Setters) methods.
 *  5. Overriding Object.toString() for formatted object printing.
 *
 * Eclipse Run Command: Right-click -> Run As -> Java Application
 * Command Line Run: java -cp bin lab03_student_oop.EnhancedStudentTest
 * ============================================================================
 */
class EnhancedStudent {
    // Static counter shared across all instances for automatic ID assignment
    private static int idCounter = 1000;

    // Private Member Variables (Encapsulation Principle)
    private int studentId;
    private String name;
    private int mks1;
    private int mks2;
    private int mks3;

    /**
     * Default Constructor: Initialises default values and auto-assigns next studentId.
     */
    public EnhancedStudent() {
        this.studentId = ++idCounter;
        this.name = "Unknown";
        this.mks1 = 0;
        this.mks2 = 0;
        this.mks3 = 0;
    }

    /**
     * Parameterized Constructor: Initialises student attributes and auto-assigns next studentId.
     */
    public EnhancedStudent(String name, int mks1, int mks2, int mks3) {
        this.studentId = ++idCounter;
        this.name = name;
        this.mks1 = mks1;
        this.mks2 = mks2;
        this.mks3 = mks3;
    }

    // Accessor (Getter) Methods
    public int getStudentId() { return studentId; }
    public String getName() { return name; }
    public int getMks1() { return mks1; }
    public int getMks2() { return mks2; }
    public int getMks3() { return mks3; }

    // Mutator (Setter) Methods
    public void setName(String name) { this.name = name; }
    public void setMks1(int mks1) { this.mks1 = mks1; }
    public void setMks2(int mks2) { this.mks2 = mks2; }
    public void setMks3(int mks3) { this.mks3 = mks3; }

    /**
     * Calculates the average of marks 1, 2, and 3.
     * @return double precision average
     */
    public double calculateAverage() {
        return (mks1 + mks2 + mks3) / 3.0;
    }

    /**
     * Overrides java.lang.Object.toString() to provide formatted object output.
     */
    @Override
    public String toString() {
        return String.format("Student [ID: %d | Name: %-14s | Marks: (%3d, %3d, %3d) | Avg: %6.2f]",
                studentId, name, mks1, mks2, mks3, calculateAverage());
    }
}

public class EnhancedStudentTest {
    public static void main(String[] args) {
        System.out.println("=== Creating Students (Programmatic Auto-ID) ===");
        EnhancedStudent s1 = new EnhancedStudent();
        EnhancedStudent s2 = new EnhancedStudent("Emma Watson", 88, 92, 95);
        EnhancedStudent s3 = new EnhancedStudent("Liam Neeson", 75, 80, 85);

        // Standard System.out.println automatically calls toString()
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
