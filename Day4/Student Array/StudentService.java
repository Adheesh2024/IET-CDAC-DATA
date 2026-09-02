import java.util.Scanner;

public class StudentService {
	
	Student sarr [] ; // declaration
	//sarr = new Student[5];
	public StudentService() {
		
		sarr = new Student[10]; //DataSet 
		
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
	
	
	// search by id 
	
	public Student searchById(int id ) {
		
		for (int i = 0; i < sarr.length; i++) {
			if(sarr[i].getStudentId() == id ) // int 
				return sarr[i];			
		}		
		return null;		
	}
	// search by name 
	// String is NonPrimitve Data type  --- equals 
	public Student findByName(String val ) // array  
	{		
		for (int i = 0; i < sarr.length; i++) {
			if(sarr[i].getName().equals(val) )              
				return sarr[i];			
		}		
		return null;		
	}
	
	public int findIndex(int id ) {
		
		for (int i = 0; i < sarr.length; i++) {
			if(sarr[i].getStudentId() == id ) // int 0
				return i;			
		}		
		return -1;		
	}
	// delete by id   Array 
	
	//   search  index  -   findIndex()    delete 
	
	//	sarr[index] = null;
	
	// swapping 
	
	public void deleteById(int id) {		
		// search 
		int index =  findIndex(id);		
		if(index != -1) {			
			sarr[index] = null;			
			for (int i = index; i < (sarr.length-1); i++) {
				//shifting data 
				sarr[index] =  sarr[index+1];				
			}			
		} else {
			System.out.println("Data Not Found ");
		}
		
		
		
	}
	
	
	
	
	
	//  avg of mks 
	//sarr[i].findAvg();
	
	//  Student Object // getmarks //   avg 
	
	

}











