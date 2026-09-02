package com.demo.test;

import com.demo.model.ContractEmployee;
import com.demo.model.Employee;
import com.demo.model.Person;
import com.demo.model.SalariedEmployee;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p =  new Person();// Constructor 
		// object   memory allocation 
		
		System.out.println("\n\n\n");
		Employee e = new Employee();
		
		// Child   ------ Super class Construtor Super 
		
		
		//  ref   --  compile time  , run time 
		// Person p1 ; 
		// p1 = new Employee(); 
		Person  p1  = new Person();
		//super 		
		p1 = new Employee();//Employee 
		Employee e1 = new Employee();//Employee
		//p1.calcSal();  // Compile  Syntax   linking  
		// Person 
		
		
		p1 = new SalariedEmployee();
		p1 = new ContractEmployee();
		
		Object o = new Person();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
