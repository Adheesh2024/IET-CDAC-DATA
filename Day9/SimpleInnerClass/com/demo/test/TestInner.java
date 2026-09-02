package com.demo.test;

import com.demo.model.Outer;

public class TestInner {

	public static void main(String[] args) {
		// Outer$Inner.class 
		//Outer.class 
		Outer o = new Outer();
		o.showOuter();
		
		Outer o1 = new Outer(152);
		o1.showOuter(); // Outer class
		
		
		Outer.Inner oi ;		
		oi = o1.new Inner();// constructor   method		
		oi.showInner();// Inner class 
		// Outer class 
		o1.demo();
		//System.out.println(o1.d);   d local variable of demo method
		

	}

}






