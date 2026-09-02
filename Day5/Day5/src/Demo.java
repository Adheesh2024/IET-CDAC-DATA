
public class Demo {
	
	int i ; //   zero 

	public Demo() {
		System.out.println("Demo Default Constructor ");
	}
	
	public Demo(int i) {
		System.out.println("Demo Parametrised Constructor "  + i );
		this.i = i ;
	}
	
	// GARBAGE COLLECTOR  
	
	//Object toString()
	protected void finalize() throws Throwable {
		
		System.out.println( " in finliaze  " + i);
		
	}

}






