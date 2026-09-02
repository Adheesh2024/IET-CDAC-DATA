package com.demo.model;

public class SalariedEmployee extends Employee {
	
	//Person -> Employee -> SalariedEmployee
	// 6 parameters 
	double  hra ; //  Salaried basicSal 

	public SalariedEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public SalariedEmployee
	( String name ,String occupation ,  String mob ,  
							int id , int basicsal) {
		
		
		super(name , occupation , mob , id , basicsal);
		this.hra = basicsal * 0.3;
		
		
	
	}
	
	
	// re write 
	// Override     is-a  
	// same function with same  signature but
	// implementation different   --- is-a 
	public int calcSal() {
		// TODO Auto-generated method stub		
		System.out.println("SalariedEmployee calcSal");
		return (int) (super.getBasicSal() + hra );
	}
	
	// basicSal + hra
	
	
	
	
	
	
	
	

}
