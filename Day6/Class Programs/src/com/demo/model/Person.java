package com.demo.model;
//super Object  
public class Person {

	private String name ;
	private String occupation ;
	private String mob;
	
	
	public Person() {
		// TODO Auto-generated constructor stub
		
		System.out.println("person default Constructor ");
	}


	public Person(String name, String occupation, String mob) {
		super();
		this.name = name;
		this.occupation = occupation;
		this.mob = mob;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getOccupation() {
		return occupation;
	}


	public void setOccupation(String occupation) {
		occupation = occupation;
	}


	public String getMob() {
		return mob;
	}


	public void setMob(String mob) {
		this.mob = mob;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", occupation=" + occupation + ", mob=" + mob + "]";
	}
	
	//Object   name    Person 
	@Override
	public boolean equals(Object obj) {		// obj Person 
		//RTTI
		if(obj instanceof Person)
		{
			Person temp = (Person) obj;
			if(this.name.equals(temp.name) &&
					this.occupation.equals(temp.occupation) && 
					this.mob.equals(temp.mob))		
				return true ;		
			else 				
				return false ;
		}
		else   return false ;
	}
	
	
	
	
	
	
	
	
	
	
	

}
