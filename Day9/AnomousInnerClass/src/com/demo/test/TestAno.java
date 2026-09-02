package com.demo.test;

import com.demo.util.MyInterface;

public class TestAno {

	public static void main(String[] args) {
		
		MyInterface m ; //		
		m =  new MyInterface() {	
			@Override
			public void display() {				
				System.out.println("in display of Interface ");
			}
		};
		m.display();
		
		
		System.out.println(Math.floor(Math.random()*104));

	}

	

}
