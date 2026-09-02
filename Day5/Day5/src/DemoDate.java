import java.util.*;
//import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
public class DemoDate {
	public static void main(String[] args) {		
		Date d = new Date();		
		System.out.println(d);//  toString  Fri Aug 28 10:14:42 IST 2026
		
		// format that date 		
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String s = sdf.format(d);
		System.out.println(s);			
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter date (dd/MM/yyyy)");
		String dt=sc.next();		
		// String    ----- java.util.Date   33/48/2029			
		SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
		Date jdt = null;
		
			// java.util.Date === String 
			try {
				jdt=sdf1.parse(dt);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(sdf1.format(jdt) + " " + jdt.getMonth());
		
			
			/*
			 * LocalDate date = LocalDate.now(); DateTimeFormatter formatter =
			 * DateTimeFormatter.ofPattern ("EEE yyyy MM dd"); String text =
			 * date.format(formatter); LocalDate parsedDate = LocalDate.parse(text,
			 * formatter);
			 */
			
			
			
			
			
			
			
			
			

	}

}
