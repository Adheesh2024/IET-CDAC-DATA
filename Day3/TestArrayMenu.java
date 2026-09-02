import java.util.Scanner;

public class TestArrayMenu {

	public static void main(String[] args) {
		
		Scanner  sc =  new Scanner(System.in);
		System.out.print("Enter a length of An Array ");
		int length = sc.nextInt();
		int arr[] ; 		
		arr = new int[length]; 
		
		ArrayService.acceptData(arr);
		ArrayService.printArray(arr);
		int choice = 0;
		System.out.println("\n\n");
		// Menu 
		do {System.out.println("\n\n");
				System.out.println("1. FindMax \n 2. FindMin \n 3.search \n 4.Occurance");
				System.out.print("Enter your Choice ");
		
					choice = sc.nextInt();
		
		switch(choice) {
		
		case 1 -> {
			int max  = ArrayService.findMax(arr);
			System.out.print("Max : " + max);
		}
		//case 2 -> ArrayService.findMin(arr);
		case 3 -> {
			System.out.print("Enter a number to search : " );
			
			int data  = sc.nextInt();
			
			int index = ArrayService.search(arr, data);
			if(index == -1) {
				System.out.println(data  + " is not found ");
			} else {
			System.out.println( data + " is present on index " + index);
			}
		}
		
		}
		
		}while(choice != 0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
