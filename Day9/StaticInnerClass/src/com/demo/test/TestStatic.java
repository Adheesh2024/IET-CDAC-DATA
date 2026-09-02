package com.demo.test;

import com.demo.model.Outer;
import com.demo.model.OuterStatic;

public class TestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Simple Inner Class
		Outer o = new Outer();
		Outer.Inner o1 = o.new Inner();
		
		
		// Static Inner Class 
		//OuterStatic os = new OuterStatic();		
		OuterStatic.Inner oi ;
		oi = new OuterStatic.Inner();

	}

}
