package lab02_mydate;

/**
 * Lab 02: MyDate Class with Constructors, Print, and Validation Logic
 * Run command: java -cp bin lab02_mydate.MyDateTest
 */
class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void printDate() {
        System.out.println("Date: " + String.format("%02d/%02d/%04d", day, month, year));
    }

    public boolean validateDate() {
        if (year <= 0) {
            System.out.println(" InvalidDate: Year must be greater than 0.");
            return false;
        }

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (month < 1 || month > 12) {
            System.out.println(" InvalidDate: Month must be between 1 and 12.");
            return false;
        }

        int maxDays;
        switch (month) {
            case 2:
                maxDays = isLeapYear ? 29 : 28;
                break;
            case 4: case 6: case 9: case 11:
                maxDays = 30;
                break;
            default:
                maxDays = 31;
                break;
        }

        if (day < 1 || day > maxDays) {
            System.out.println(" InvalidDate: Day " + day + " is out of range for month " + month 
                               + " (Max allowed: " + maxDays + ").");
            return false;
        }

        System.out.println(" ValidDate: " + String.format("%02d/%02d/%04d", day, month, year) + " is a valid date.");
        return true;
    }
}

public class MyDateTest {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("         MYDATE VALIDATION TEST           ");
        System.out.println("==========================================");

        System.out.println("\n--- 1. Testing Default Constructor ---");
        MyDate d1 = new MyDate();
        d1.printDate();
        d1.validateDate();

        System.out.println("\n--- 2. Testing Valid Leap Year Date ---");
        MyDate d2 = new MyDate(29, 2, 2024);
        d2.printDate();
        d2.validateDate();

        System.out.println("\n--- 3. Testing Invalid Leap Year Date ---");
        MyDate d3 = new MyDate(29, 2, 2023);
        d3.printDate();
        d3.validateDate();

        System.out.println("\n--- 4. Testing Invalid Month Boundary ---");
        MyDate d4 = new MyDate(31, 4, 2022);
        d4.printDate();
        d4.validateDate();
    }
}
