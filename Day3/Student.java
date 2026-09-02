
public class Student {
	
	// instance variables  - non static 
	// inside class 
	private String name;
	private int studentId;// automatic 
	private int mks1 , mks2 , mks3;
	
	
	// Single Copy 
	static int count = 1;
	
	public Student() {	
		name="default";
		studentId = count ;
		count ++ ;
	}	
	
	// local variables   as a parameter  / inside method or constructor 
	public Student(String name , int mks1 , int mks2 , int mks3) {
		// instance variable = local variable 
		// current instance   s2
		studentId = count;
		this.name = name;
		this.mks1 = mks1; 
		this.mks2 = mks2;
		this.mks3 = mks3;	
		
		count++;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		
		return "Student Name : " + name + "\n Student ID  " + studentId ;
	}
	
	public void calcAvg() {
		
		
	}
	
	
	
	
	

}







