class DemoClass
	{

		// static Method  ------- Non Static Methods
		//static     global in java 
		//  access speci    return type   method name 
		public  static void display()
		{
			System.out.println("in Display Method ");
		}
		
		// non static   ---- instance method 
		public  void printData()
		{
			System.out.println("in Display printData ");
		}

		public  void printData1(String s)
		{
			System.out.println("in Display printData ");
		}
 
		public static void main(String[]   a)	
		{
			// \n   new line 
			System.out.println("Hello World   DemoClass");
			display(); //  static Method
			
			// non static  /  Instance 
			// Object 
			
			DemoClass    dc = new DemoClass() ; /// Object 
			dc.printData();  // non static 
			// object.methodName();

			dc.printData1("abc");
			
			

		}

	}


