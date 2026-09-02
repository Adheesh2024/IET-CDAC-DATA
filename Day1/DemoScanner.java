import java.util.Scanner ;

// java.lang default import package 


class DemoScanner
	{	 
		public static void main(String[]   a)	
		{
			
			System.out.println("Hello World   DemoScanner");

			Scanner sc = new Scanner(System.in);
			
			System.out.print ("Enter a Number : " );
	
			int data = sc.nextInt();

			System.out.print ("Enter a Name : " );
	
			String name  = sc.next();// till  space 

			System.out.print ("Number Entered  " + name);
		

		}

	}


