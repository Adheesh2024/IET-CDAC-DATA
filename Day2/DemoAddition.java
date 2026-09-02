// 2 to 4  int 

// Same Method Name - Signature Differ  no of parameters 

// Method Overload 
public class DemoAddition {
	
	/*
	 * public void add(int i , int j ) { System.out.println("Addition of 2 numbers "
	 * + (i+j)); }
	 * 
	 * public void add(int i , int j , int k ) {
	 * System.out.println("Addition of 3 numbers " + (i+j +k)); }
	 * 
	 * public void add(int i , int j , int k , int l ) {
	 * System.out.println("Addition of 4 numbers " + (i+j+k+l)); }
	 */
	
	
	// ... ellipse --- array   0  to n 
	public void add(int...arr ) {
		System.out.println("in ellipses add function ");
		int sum = 0;
		for (int j = 0; j < arr.length; j++) {
				sum += arr[j];
		}	
		for(int h : arr) {
			sum += h;
		}
		System.out.println("Addition of   " + arr.length +" numbers " + sum);
	}
	
	public void show( String  i   , int ... mks  ) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		DemoAddition da = new DemoAddition();		
		da.add();
		da.add(1);
		da.add(1,2,3,4,5);
		da.add(1,2,5);
	}

}




