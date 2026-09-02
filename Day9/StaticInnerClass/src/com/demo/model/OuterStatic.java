package com.demo.model;

public class OuterStatic {
	int i = 100;
	static int c = 154;
	public OuterStatic() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static class Inner {
		
		int a ;  
		static int u ;
		
		public Inner() { } 
		
		public Inner(int a) {
			this.a = a;
			
		}
		
		public void showInner() {
			System.out.println("show Inner instance variable " + a );
			
			System.out.println(u);// static variable inside static inner class
			System.out.println(c);//  static Outer 
			
			//System.out.println(i); //  Outer instance
		}
		
	}
	
	

}
