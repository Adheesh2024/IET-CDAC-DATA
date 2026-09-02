package com.demo.test;

import com.demo.model.Employee;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();//default
		
		//System.out.println(e.empId); // private 
		
		System.out.println(e.getEmpId());// public 
		
		//Employee e1 = new Employee(101, 35000, "A");

	}
	
	
	

}
