package lab24_exam_system;

import java.util.Scanner;

/**
 * Lab 24: Interactive Online Examination System (Exam & Question classes).
 * Run command: java -cp bin lab24_exam_system.ExamSystemDemo
 */
class Question {
    private int qno;
    private String question;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
    private int ans;
    private int marks;

    public Question(int qno, String question, String opt1, String opt2, String opt3, String opt4, int ans, int marks) {
        this.qno = qno;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.ans = ans;
        this.marks = marks;
    }

    public int getAns() { return ans; }
    public int getMarks() { return marks; }

    public void displayQuestion() {
        System.out.println("\nQ" + qno + ". " + question);
        System.out.println("  1. " + opt1);
        System.out.println("  2. " + opt2);
        System.out.println("  3. " + opt3);
        System.out.println("  4. " + opt4);
    }
}

class Exam {
    private String examId;
    private String name;
    private String topic;
    private String dateOfExam;
    private Question[] questions;

    public Exam(String examId, String name, String topic, String dateOfExam, Question[] questions) {
        this.examId = examId;
        this.name = name;
        this.topic = topic;
        this.dateOfExam = dateOfExam;
        this.questions = questions;
    }

    public String getName() { return name; }

    public int conductExam(Scanner scanner) {
        System.out.println("\n==================================================");
        System.out.println("   EXAM STARTED: " + name.toUpperCase() + " (" + topic + ")");
        System.out.println("   Date: " + dateOfExam + " | Total Questions: " + questions.length);
        System.out.println("==================================================");

        int totalScore = 0;
        int maxPossible = 0;

        for (int i = 0; i < questions.length; i++) {
            Question q = questions[i];
            maxPossible += q.getMarks();
            q.displayQuestion();

            System.out.print("Your Answer (1-4): ");
            int userChoice = scanner.nextInt();

            if (userChoice == q.getAns()) {
                totalScore += q.getMarks();
                System.out.println("--> Correct! (+" + q.getMarks() + " mark)");
            } else {
                System.out.println("--> Incorrect. (Correct Answer: Option " + q.getAns() + ")");
            }
        }

        System.out.println("\n--------------------------------------------------");
        System.out.println("EXAM COMPLETED! Score: " + totalScore + " / " + maxPossible);
        System.out.println("--------------------------------------------------");

        if (totalScore >= 3) {
            System.out.println("🎉 CONGRATULATIONS! You passed the test.");
        } else {
            System.out.println(" Better luck next time.");
        }

        return totalScore;
    }
}

public class ExamSystemDemo {

    public static Exam createJavaExam() {
        Question[] javaQs = new Question[5];
        javaQs[0] = new Question(1, "Which keyword is used to define a subclass in Java?", "implements", "extends", "inherits", "super", 2, 1);
        javaQs[1] = new Question(2, "Which method signature is valid for main in Java?", "public static void main(String[] args)", "public void main(String[] args)", "static void main(String args)", "public static int main(String[] args)", 1, 1);
        javaQs[2] = new Question(3, "What is the default value of an uninitialized int array element?", "null", "0", "-1", "undefined", 2, 1);
        javaQs[3] = new Question(4, "Which package is automatically imported in every Java program?", "java.util", "java.io", "java.lang", "java.net", 3, 1);
        javaQs[4] = new Question(5, "What is the superclass of all classes in Java?", "Class", "Object", "System", "Main", 2, 1);

        return new Exam("EXAM_JAVA_101", "Java Assessment Test", "Java Fundamentals", "02-09-2026", javaQs);
    }

    public static Exam createHtmlExam() {
        Question[] htmlQs = new Question[5];
        htmlQs[0] = new Question(1, "What does HTML stand for?", "Hyper Text Markup Language", "High Text Machine Language", "Hyper Tabular Markup Level", "None of these", 1, 1);
        htmlQs[1] = new Question(2, "Which HTML tag is used for the largest heading?", "<h6>", "<heading>", "<h1>", "<head>", 3, 1);
        htmlQs[2] = new Question(3, "Which tag is used to create a hyperlink in HTML?", "<link>", "<a>", "<href>", "<url>", 2, 1);
        htmlQs[3] = new Question(4, "Which HTML element is used to display an image?", "<pic>", "<image>", "<img>", "<src>", 3, 1);
        htmlQs[4] = new Question(5, "Which HTML tag creates an unordered bulleted list?", "<ol>", "<list>", "<ul>", "<li>", 3, 1);

        return new Exam("EXAM_HTML_201", "HTML Assessment Test", "Web Development", "02-09-2026", htmlQs);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exam javaExam = createJavaExam();
        Exam htmlExam = createHtmlExam();

        char continueChoice;

        do {
            System.out.println("\n========= ONLINE EXAMINATION SYSTEM =========");
            System.out.println("Select the exam you wish to appear for:");
            System.out.println("1. Java Test");
            System.out.println("2. HTML Test");
            System.out.print("Enter choice (1-2): ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                javaExam.conductExam(scanner);
            } else if (choice == 2) {
                htmlExam.conductExam(scanner);
            } else {
                System.out.println("Invalid choice! Please select 1 or 2.");
            }

            System.out.print("\nDo you want to take another test? (Y/N): ");
            continueChoice = scanner.next().charAt(0);

        } while (continueChoice == 'Y' || continueChoice == 'y');

        System.out.println("Thank you for using the Online Examination System. Goodbye!");
        scanner.close();
    }
}
