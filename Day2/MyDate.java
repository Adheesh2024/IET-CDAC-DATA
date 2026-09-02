

//  date -   day month year 
public class MyDate {
	
	// structure    focused on required things   Abstraction 
	// non static / instance 
	int day , month , year; // important in that scenario  = 0
	static int count = 0;
	
	
	// constructor 
	/*
	 * 	Constructor name and class name should be same 
	 *  return type not required not even void 
	 *  it get calls when Object created 
	 * 
	 */
	 MyDate() {		
		System.out.println("in default Constructor");
	}
	public  MyDate(int d , int m , int y) {		
		System.out.println("in parameterised Constructor");
		day = d ;
		month = m;
		year = y;
		
	}	
	public  MyDate(int d , int m ) {		
		System.out.println("in parameterised Constructor");
		day = d ;
		month = m;		
	}	
	
	
	void initDate() {		
		day = 25 ;
		month = 8;
		year = 2026;
		
	}	
	void initDate(int d , int m , int y) {		
		day = d ;
		month = m;
		year = y;
		
	}	
	//non static 
	void validate() {		
		//  validation 
		
	}	
	void printDate() {		
			System.out.println(day + " / " + month + " / " + year);
			System.out.println("Static Data " + count);
	}
	// day non static 
	// static methods can not access non static data members but reverse id possible
	static void demo() {
		System.out.println("Demo Static " );
	}
	
	
	
	
	
	
	
	
	
	

}
