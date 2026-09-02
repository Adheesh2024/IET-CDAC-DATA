import java.util.Scanner;

public class StudentService {
	
	Student sarr [] ; // declaration
	//sarr = new Student[5];
	public StudentService() {
		
		sarr = new Student[5]; // length   array of Student Ref
		
		//sarr[0] = new Student();// Student Object
	}
	
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < sarr.length; i++) {
			
			System.out.println("Enter a Data for " + (i+1) + "Student ");
			
			System.out.print("Enter a name : " );
			String n  =  sc.next();
			System.out.print("Enter a Marks  : " );
			int  m1  =  sc.nextInt();
			System.out.print("Enter a Marks : " );
			int  m2  =  sc.nextInt();
			System.out.print("Enter a Marks : " );
			int  m3  =  sc.nextInt();			
			
			sarr[i] =  new Student (n , m1 , m2 , m3);			
		}	
		
	}
	
	
	public void displayData() {
		
		for (int i = 0; i < sarr.length; i++) {
			System.out.println(sarr[i]);
		}
		
	}

}











