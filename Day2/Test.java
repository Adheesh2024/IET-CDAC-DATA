
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyDate d ;  //  ref 
		d = new MyDate(); // Object Default Const
		d.printDate();// default value 
		
		d.initDate(); //  hardcoded 
		d.printDate();
		
		
		// scanner 
		d.initDate(32, 7, 2025);
		
		// validate data 
		// object.methodName 
		d.printDate();
		
		
		// object.variable name 
		System.out.println("Year : " + d.year);
		
		
		
		
		
		MyDate d1 = new MyDate(1,1,1);//Object    Parameterised Cons 
		//d1.initDate(); // method   need to call 
		d1.printDate(); // 0/0/0  // non static  object  	
		
		
		// static method   class name 
		//d1.demo();
		MyDate.demo();
		
		
		
		

	}

}
