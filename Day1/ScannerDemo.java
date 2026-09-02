import java.util.Scanner; 

class ScannerDemo{
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in); //uses keyboard file
				 System.out.println("Enter number");
         int a=sc.nextInt();
				 System.out.println("Enter number");
         double b=sc.nextDouble();
         System.out.println("a: "+a+"b: "+b);
					//accept string without spaces
         System.out.println("Enter name");
         String s=sc.next();
				 sc.nextLine();
				// accept string with spaces  
				 System.out.println("Enter address ");
         String addr=sc.nextLine();
				 System.out.println("Name: "+s+", address : "+addr);
				 sc.close();

    }

} 