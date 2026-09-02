package com.student.app;

// Import statement accessing Student class from package 'com.student.model'
import com.student.model.Student;

/**
 * ============================================================================
 * LAB 12 (PART B): TESTSTUDENT DRIVER IN PACKAGE 'com.student.app'
 * ============================================================================
 * Add-on Relationship:
 *  - BUILDS UPON LAB 12 PART A (com.student.model.Student).
 *  - Demonstrates cross-package access using 'import com.student.model.Student;'.
 *
 * Eclipse Run Command: Right-click -> Run As -> Java Application
 * Command Line Run: java -cp bin com.student.app.TestStudent
 * ============================================================================
 */
public class TestStudent {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("    CROSS-PACKAGE ACCESS DEMONSTRATION IN JAVA    ");
        System.out.println("==================================================");
        System.out.println("Current Package : com.student.app");
        System.out.println("Imported Class  : com.student.model.Student\n");

        Student s1 = new Student("Sophia Turner", 92, 88, 95);
        Student s2 = new Student("Lucas Scott", 78, 84, 80);

        System.out.println("--- Displaying Student 1 Details ---");
        s1.displayStudentInfo();

        System.out.println("\n--- Displaying Student 2 Details ---");
        s2.displayStudentInfo();

        System.out.println("==================================================");
    }
}
