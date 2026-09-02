package com.demo.model;
// 
public class Employee  extends Person  {	
	
	//  
	private  int empId , basicSal;	
	
	public int getEmpId()
	{		
		return empId;
	}
	
	

	
	public int getBasicSal() {
		return basicSal;
	}




	public void setBasicSal(int basicSal) {
		this.basicSal = basicSal;
	}




	public void setEmpId(int empId) {
		this.empId = empId;
	}




	//constructor   object   instance 
	public Employee() {
		System.out.println("in Employee Default Constructor");
		
	}

	public Employee(int empId, int basicSal) {			
		System.out.println("Employee Parametrised Constructor ");
		this.empId = empId;
		this.basicSal = basicSal;
		
	}
	
	
	// Object Constructor 
	public Employee
	(String name , String occupation  , String  mob  ,
			int empId, int basicSal) {	
		
		//super();// default 
		//super    parent  
		super(name , occupation , mob);//constructor 
		System.out.println("Employee Parametrised Constructor ");
		this.empId = empId;
		this.basicSal = basicSal;
		//this.name = name;
		//setName(name);
		//setOccupation(occupation);;
		//setMob(mob);
		
	}
	
	public int calcSal() {	
		
		System.out.println("Employee calcSal");
		return basicSal;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
