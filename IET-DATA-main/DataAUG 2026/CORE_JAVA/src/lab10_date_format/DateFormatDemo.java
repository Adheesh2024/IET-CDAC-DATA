package lab10_date_format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Lab 10: Date and SimpleDateFormat exploration based on JavaDocs API standards.
 * Run command: java -cp bin lab10_date_format.DateFormatDemo
 */
public class DateFormatDemo {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   EXPLORING Date AND SimpleDateFormat CLASS API   ");
        System.out.println("==================================================");

        Date currentDate = new Date();
        System.out.println("\nDefault Date.toString() Output: " + currentDate);

        System.out.println("\n--- Part 1: Formatting Date to Custom Pattern Strings ---");

        SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Pattern 'dd/MM/yyyy'           : " + fmt1.format(currentDate));

        SimpleDateFormat fmt2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Pattern 'yyyy-MM-dd HH:mm:ss'   : " + fmt2.format(currentDate));

        SimpleDateFormat fmt3 = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        System.out.println("Pattern 'EEEE, MMMM dd, yyyy'  : " + fmt3.format(currentDate));

        SimpleDateFormat fmt4 = new SimpleDateFormat("dd-MMM-yyyy hh:mm a");
        System.out.println("Pattern 'dd-MMM-yyyy hh:mm a'  : " + fmt4.format(currentDate));

        System.out.println("\n--- Part 2: Parsing a String Input into a Date Object ---");
        String inputDateStr = "15/08/1947";
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date parsedDate = inputFormat.parse(inputDateStr);
            System.out.println("Input String Date              : " + inputDateStr);
            System.out.println("Parsed java.util.Date Object  : " + parsedDate);
            System.out.println("Reformatted Full Date String   : " + fmt3.format(parsedDate));
        } catch (ParseException e) {
            System.out.println("Error: Failed to parse date string.");
        }

        System.out.println("==================================================");
    }
}
