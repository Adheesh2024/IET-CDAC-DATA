package com.demo.model;

import java.util.Date;

// Composition 
// HAS-A 

// Inheritance   IS-A 
public class Student {
	//default 
	private int data ; // instance   non static   copy create per instance 
	
	private Date bDate;
	
	private Address localAddress; 
	
	public static  int count = 100;// static    single copy 

	
	public Student() {
		
	}

	public Student(int data) {
		super();
		this.data = data;
	}
	
	

	public Student(int data, 
			Date bDate,
			Address localAddress) 
	
	{
		super();
		this.data = data;
		this.bDate = bDate;
		this.localAddress = localAddress;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
	
	

}
