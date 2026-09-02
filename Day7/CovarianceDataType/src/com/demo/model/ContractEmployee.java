package com.demo.model;

public class ContractEmployee extends Employee {

	private int hrs  , rate ; 
	
	public ContractEmployee() {
		// TODO Auto-generated constructor stub
	}

	public ContractEmployee(int empId, int basicSal) {
		super(empId, basicSal);
		// TODO Auto-generated constructor stub
	}

	public ContractEmployee(String name, String occupation, String mob, int empId, int basicSal) {
		super(name, occupation, mob, empId, basicSal);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int calcSal() {
		// TODO Auto-generated method stub
		System.out.println("ContractEmployee calcSal");
		return super.calcSal() + (rate*hrs);
	}
	
	
	
	
	
	
	
	
	
	

}
