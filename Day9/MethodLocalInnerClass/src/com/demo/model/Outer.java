package com.demo.model;

public class Outer {
	
	int iOuter = 100;
	
	static int count; 

	public Outer() {
		System.out.println("Outer Default Constructor");
	}

	public Outer(int iOuter) {
		super();
		System.out.println("Outer parameterised Constructor");
		this.iOuter = iOuter;
	}
	
	public void showOuter() {
		System.out.println("showOuter Method");
		//System.out.println("Demo  Method " + d);
		System.out.println("showOuter Method static " + count);
		
	}
	//Outer Class 
	public void demo() {		
		int d = 458; //local 
		System.out.println(d);		
		// class 
			class InSideMethod{
				int m ; 				
				public InSideMethod() { }				
				public InSideMethod(int m ) {
					this.m =  m ;
				}				
				public void display () {
					System.out.println("local variable of method "  + d);
					System.out.println("in method local class ");
					//System.out.println("showInner Method staic " + count);
					//System.out.println("showInner Method  " + iOuter);
				}				
			}// end of class			
			InSideMethod im = new InSideMethod();
			im.display();
			
		
	} //  end of demo method
	
	
	// InnerClass 
	public class Inner {
		
		int j = 20;
		
		public Inner() {
			
		}
		
		public Inner(int j ) {
				this.j = j;
		}
		
		public void showInner() {
			System.out.println("showInner Method");
			System.out.println("showInner Method staic " + count);
			System.out.println("showInner Method  " + iOuter);
			
		}
		
		
	}//  end of inner class 

}  //  end of Outer Class 






