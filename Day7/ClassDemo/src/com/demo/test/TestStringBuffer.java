package com.demo.test;

public class TestStringBuffer {

	public static void main(String[] args) {
		String s = "hello";// char array 
		StringBuffer sb = new StringBuffer(s);
		//  5 + 16
		// 16 characters buffer 
		System.out.println(sb + "  " + sb.hashCode());
		sb.append(" user");  // 10 + 16
		System.out.println(sb + "  " + sb.hashCode());

	}

}
