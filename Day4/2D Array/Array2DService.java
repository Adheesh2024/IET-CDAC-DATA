
import java.util.Scanner;

public class Array2DService {

	//accept data in 2D array   3 rows  4 cols 
	public static void acceptData(int[][] arr) {
		Scanner sc=new Scanner(System.in);
		//arr.length will give number of rows
		for(int i=0;i<arr.length;i++) {
			//arr[i].length ---> will give number of columns
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter data for row "+i +" and col : "+j);
				arr[i][j]=sc.nextInt();
				
				//System.out.println(arr[i][]);
			}
		}
		
	}
	
	
	
	
	
	

	//display 2D array
	public static void displayData(int[][] arr) {
		//MyDate m = new MyDate();
		int sum = 0 ;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				//System.out.print(arr[i][j]+"\t");
				
				sum += arr[i][j];
			}
			System.out.println();
		}
		
	}
	//find maximum number from entire array
	public static int findMax(int[][] arr) {
		int max=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					  max=arr[i][j];
				}
			}
		}
		return max;
	}
	
	//find minimum number from entire array
	public static int findMin(int[][] arr) {
		int min=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]<min) {
					  min=arr[i][j];
				}
			}
		}
		return min;
	}

	//find sum of  entire array
		public static int findSum(int[][] arr) {
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					sum+=arr[i][j];
				}
			}
			return sum;
		}
	
	
	//to find row wise sum
	public static int[] findSumRowWise(int[][] arr) {
		//arraylength is same as number of rows
		int[] sum=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				   sum[i]=sum[i]+arr[i][j];
			}
		}
		return sum;
	}

	
	
	
	//arr.length ===  no of rows 
	//arr[0].length == no of cols 		
	public static int[] findSumColumnWise(int[][] arr) {
		//array length is same as number of columns
		int[] sumarr=new int[arr[0].length];
		for(int i=0;i<arr[0].length;i++) {
			for(int j=0;j<arr.length;j++) {
				  sumarr[i]=sumarr[i]+arr[j][i];
			}
		}
		return sumarr;
	}
	
	
	
}
