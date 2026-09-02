package com.demo.test;



public class TestEnum {
	
	//public   static  final   // array 
	enum month {  JAN , FEB , MAR , APR    } ;//objects 
	enum days { MON , TUES , WED } 

	public static void main(String[] args) {	
		month m = month.FEB;
		System.out.println(m + " " + m.ordinal());		
		int i  = 3 ;
		if( i== 3) {
			m = month.APR;
		}		
		System.out.println(m);

	}

}
