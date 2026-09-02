package com.demo.test;

import com.demo.model.Demo;

public class Test {
	
	public static void swap(Demo d ,  Demo d1) {		
		Demo temp = null;
		temp = d;
		d = d1;
		d1 = temp;		
		System.out.println("in  swap ");
		System.out.println("d1 : " + d);
		System.out.println("d2 : " + d1);
		
	}
	
	public static void swapByRef(Demo d []) {		
		Demo temp = null;
		temp = d[0];
		d[0] = d[1];
		d[1] = temp;		
		System.out.println("in  swap ");
		System.out.println("d[0] : " + d[0]);
		System.out.println("d[1] : " + d[1]);
		
	}

	public static void main(String[] args) {
		//primitive
		int i  = 10  ,  j  = 20;		
		//System.out.println("i = " + i + " j = " + j);
		int temp = i ;
		i = j;
		j = temp ;		
	//	System.out.println("i = " + i + " j = " + j);
		
		Demo d1 = new Demo(11);
		Demo d2 = new Demo(22);
		System.out.println("in main ");
		System.out.println("d1 : " + d1);
		System.out.println("d2 : " + d2);
		
		//swap d1  d2
		Test.swap(d1 , d2);//  pass by value 
		
		System.out.println("in main  after swap ");
		System.out.println("d1 : " + d1);
		System.out.println("d2 : " + d2);
		
		
		// pass by ref  --- Pointers  ///  Array 
		
		// stack   heap 
		
		Demo demo[] = new Demo[2];
		demo[0] = new Demo(11);
		demo[1] = new Demo(22);
		
		System.out.println("in main Befor Swap");
		System.out.println("demo[0] : " + demo[0]);
		System.out.println("demo[1] : " + demo[1]);
		
		Test.swapByRef(demo);
		
		System.out.println("in main After  Swap");
		System.out.println("demo[0] : " + demo[0]);
		System.out.println("demo[1] : " + demo[1]);
		 

	}
	

}
