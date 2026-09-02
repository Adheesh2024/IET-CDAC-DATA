package com.student.model;

/**
 * ============================================================================
 * LAB 12 (PART A): STUDENT MODEL CLASS IN PACKAGE 'com.student.model'
 * ============================================================================
 * Add-on Relationship:
 *  - BUILDS UPON LAB 03 (Student Class concept).
 *  - Demonstrates packaging OOP classes: places Student inside 'com.student.model'.
 *  - Declared 'public' so classes in external packages (e.g. com.student.app) can access it.
 * ============================================================================
 */
public class Student {
    private static int idCounter = 500;

    private int studentId;
    private String name;
    private int mks1;
    private int mks2;
    private int mks3;

    public Student() {
        this.studentId = ++idCounter;
        this.name = "Default Student";
        this.mks1 = 50;
        this.mks2 = 50;
        this.mks3 = 50;
    }

    public Student(String name, int mks1, int mks2, int mks3) {
        this.studentId = ++idCounter;
        this.name = name;
        this.mks1 = mks1;
        this.mks2 = mks2;
        this.mks3 = mks3;
    }

    public int getStudentId() { return studentId; }
    public String getName() { return name; }
    public int getMks1() { return mks1; }
    public int getMks2() { return mks2; }
    public int getMks3() { return mks3; }

    public double calculateAverage() {
        return (mks1 + mks2 + mks3) / 3.0;
    }

    public void displayStudentInfo() {
        System.out.println("+------------------------------------------------------+");
        System.out.printf("| Package: com.student.model.Student                    |\n");
        System.out.printf("| ID: %-5d | Name: %-15s | Avg: %-6.2f |\n", 
                          studentId, name, calculateAverage());
        System.out.println("+------------------------------------------------------+");
    }
}
