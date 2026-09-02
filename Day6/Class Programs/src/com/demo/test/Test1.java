package com.demo.test;

import com.demo.model.Address;
import com.demo.model.Person;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i  = 100 ; 		
		int j  = 100;
		
		if(i == j)
			System.out.println("Equal");
		else
			System.out.println("Not Equal ");
		// non primitive 
		Person p1 = new Person("a", "a", "1234567890");
		
		Person p2 = new Person("a", "a1", "1234567890");	
		
		System.out.println("Person Objects  with ref");
		
		System.out.println("p1 : " + p1.hashCode());
		System.out.println("p2 : " + p2.hashCode());
		
		if(p1 == p2)  //  hashcode 
			System.out.println("Equal");
		else
			System.out.println("Not Equal ");
		
		//this == p1 
		
		System.out.println("Person Objects  with equals ");
		if(p1.equals(p2))  //  hashcode 
			System.out.println("Equal");
		else
			System.out.println("Not Equal ");
		
		Address add = new Address();
		
		if(p1.equals(add)) 
			System.out.println("Equal");
		else
			System.out.println("Not Equal ");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
