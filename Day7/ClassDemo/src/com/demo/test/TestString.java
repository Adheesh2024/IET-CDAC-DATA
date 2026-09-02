package com.demo.test;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Hello");  // memory heap 
		String sn = new String("Hello");
		String s1  = "Hello"; // First Class Object 
		//new operator is not required 
		System.out.println(s == s1); //  false 
		System.out.println(s.equals(s1)); // true		
		
		String s2  = "Hello";//no new memory   String Pool 
		System.out.println(("s1   s2"));
		System.out.println(s1  + "  "+ s2);
		System.out.println(s1.hashCode()  + "  "+ s2.hashCode());
		System.out.println(s1 == s2); //  true  memory location   hashcode 
		System.out.println(s1.equals(s2)); // true
		
		// array   
		// String Objects are immutable (can not change)
		s2 = s2 + " user";// reallocate Memory
		
			// concat   Opertor Overload 
		
		s2 = s2.concat(" user");
		System.out.println(s1  + "  "+ s2);
		System.out.println(s1.hashCode()  + "  "+ s2.hashCode());
		
				
		
		System.out.println(s2);
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		char c []  =  s2.toCharArray();
		
		
		// count --  count ++  int 
// generate empId <firstletter firstname><f letter of lastname> number
		//AX1
		String empName = "ABC XYZ";
		System.out.println(empName.substring(2));// start index 
		System.out.println(empName.substring(2 , 5));
		System.out.println(empName.charAt(0));
		System.out.println(empName.indexOf(" "));
System.out.println(empName.charAt(empName.indexOf(" ")+1));
		
String id =  empName.charAt(0)  + "" 
			+ (empName.charAt(empName.indexOf(" ")+1)) + "1";
		System.out.println(empName);
		System.out.println("emp id " + id);
		
		String username="iet01";
		
		System.out.println(username.startsWith("iet"));
		username.endsWith("");
		
		
		StringBuffer sb ;  
		
		
		
		
		
		
		
		
	}

}
