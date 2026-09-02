import java.util.Scanner;

public class ArrayService {
	
	 public static void acceptData(int[] arr) 
	 {
	    	Scanner sc=new Scanner(System.in);
	    	//accept data in the array
	    		 for(int i=0;i<arr.length;i++) {
	    				System.out.print ("enter number  " + i + "  " );
	    				arr[i]=sc.nextInt();
	    			}
    }
	 
	 
	 public static void printArray(int[]  arr) {
		 
		 for (int i = 0; i < arr.length; i++) {
				System.out.print (arr[i] + "  " );
			}
		 
	 }
	 
	 public static int findMax(int[] a) {
		 
		 int max = a[0] ;// 1st 		 
		 for (int i = 1; i < a.length; i++) {
				if(a[i] > max)
					max = a[i];
			}
		 
		 return max;
	 }
	 
	 public static int search(int[] a , int val) {	 
		 		 
		 for (int i = 0; i < a.length; i++) {
				if(a[i]  ==  val)
					return i; // index 
			}
		 
		 return -1;
	 }
	 
	 //  search number of occurance 
	 // 20 20 25 36 98 25
	 // 25 
	 
	 public static int ocuurance(int[] a , int val) {	 
 		 
		 int count = 0 ;
		 for (int i = 0; i < a.length; i++) {
				if(a[i]  ==  val)
					count++;
			}
		 
		 return count;
	 }
	 
	 
	 

}













