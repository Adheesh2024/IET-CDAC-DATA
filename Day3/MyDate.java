

//  date -   day month year 
public class MyDate {
	
	// structure    focused on required things   Abstraction 
	// non static / instance 
	
	static int count = 0;// single copy 
	
	static float iRate ;// default value 0.0
	private int day , month , year; //  0  important in that scenario  = 0
	// to access and modify   public interface  / methods
	// setter   getter 
	// accessor  and mutator methods 
	public void setYear(int y) {		
		year = y;		
	}
	
	public int getYear() {		
		return year;
	}
	
	
	// block 
	//method 
	static 
	{		
		iRate = 3.5f;
		System.out.println("in side Static Block ");	
	}
	
	// constructor 
	/*
	 * 	Constructor name and class name should be same 
	 *  return type not required not even void 
	 *  it get calls when Object created 
	 * 
	 */
	
	// default Constructor Java 
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
	
	// instance   Object 
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
	void validate() {	// year    mon 2 days 	
		//  validation 
		
	}	
	public void printDate() {		
			System.out.println(day + " / " + month + " / " + year);
			System.out.println("Static Data " + count);
	}
	//
	public String toString() {
		return ( day + " / " + month + " / " + year); 
	}
	// day non static 
	// static methods can not access non static data members but reverse id possible
	static void demo() {
		System.out.println("Demo Static " );
	}
	
	
	
	
	
	
	
	
	
	

}
