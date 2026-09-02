import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {		
		
		
		Scanner sc = new Scanner(System.in);
		int arr[];
		
		arr = new int[5];  /// 0
		
		ArrayService.acceptData(arr);
		
		ArrayService.printArray(arr);
		
		int max = ArrayService.findMax(arr);
		
		// findMin 
		
		System.out.println("Max : " + max);
		
		System.out.print("Enter a number to search : " );
		
		int data  = sc.nextInt();
		
		ArrayService.ocuurance(arr, data);
		
		//System.out.println(arr);		
		
		// index 
		
		
		/*
		 * for(int a : arr) { System.out.println(a); }
		 */
		// accept data 
		// search element
		// min 
		// max
		// remove duplicate  
		// no of occurance   10 20 30 48 59 
		
		
		
		
		
		
		

	}

}
