package com.demo.test;

import com.demo.model.*;

public class Test {
	//  Object 
	public static void  print(Person   obj ) {		
		System.out.println(obj);// person toString
		// obj is Person Type 
		//obj.calcSal(); // Employee			
		// type casting   explicit 
		//Employee e = (Employee) obj;
		//e.calcSal();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p =  new Person();		
		print(p);
		
		p = new Employee();// is-a 
		print(p);		
		
		SalariedEmployee se = new SalariedEmployee();
		
		se.calcSal();// // basicSal 
		
		
		Address a  = new Address();
		//print(a);
		
		// compile 
		
		// runtime 
		
		Employee emp1 = new Employee();
		
		emp1.calcSal(); // Employee
		
		emp1 = new SalariedEmployee();
		
		emp1.calcSal();/// salaried
		
		emp1 = new ContractEmployee();
		
		emp1.calcSal();  //  Contract 
		
		
		
		
		
		
		
		
	}

}



