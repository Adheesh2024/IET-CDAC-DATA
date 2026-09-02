package com.demo.test;

import java.util.Scanner;

public class TestCoffee {
	// java.lang.Enum 
	enum size { SMALL (50) , MEDIUM  , LARGE (100);
		
		int price ;
		//parameterise constructor
		size(){
			this.price = 0;
		}
		size(int  p){
			this.price = p;
		}
		public int getPrice() {
			return price;
		}
	
	
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your coffee size 0 - small , 1 - medium , 2 - large");
		int s = sc.nextInt();
		size c = null; 
		if(s == 0 )
		{	
			c = size.SMALL;
		}
		
		if(s == 1 )
		{	
			c = size.MEDIUM;
		}
		
		if(s == 2 )
		{	
			c = size.LARGE;
		}
		System.out.println("Price for "  + c + " " + c.getPrice() );

	}

}
