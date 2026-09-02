package com.demo.test;  //  declaration  small case 

import static java.lang.System.*;  // public static members 
//  out.println();

import java.util.Date;

import com.demo.model.Address;
import com.demo.model.Student;  //  static non static 

// all public static variables and methods 
import static com.demo.model.Student.*;
// System.out.println(count);  ///  Student.count



import com.demo.service.StudentService;  /// specific class 
import com.demo.service.*;  //  all public classes 
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// package.subp.subpa.classname 
//com.demo.service.StudentService ss = new com.demo.service.StudentService();
		StudentService ss = new StudentService();
		
		Student s = new Student();
		
		out.println(s.getData());
		
		//System.out.println(s.count);//100
		System.out.println(Student.count);
		
		Student s1 = new Student();
		//System.out.println(s1.count);// 100
		
		System.out.println(count);
		
		int a = 7;
		float b = 2;
		System.out.println(a / b);
		
		
		
		Address add = new Address();
		Date bDate = new Date();
		Student s2 = new Student(101, bDate ,  add);
		
		
		
	}

}






