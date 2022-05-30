package com.naidu.beans;

public class StringTest {

	// package
	// import
	// class
	// instance variables
	// constructor
	// method

	public static void main(String[] args) {

		String s1 = new String("santosh");
		String s2 = "santosh";

		s1.concat(s2);
		System.out.println(s1);
		String s3 = s1.concat(s2);
		System.out.println(s3);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));

		StringBuffer sb1 = new StringBuffer("papinaidu");
		StringBuffer sb2 = new StringBuffer("papinaidu");
		sb2.append("medhansh");
		System.out.println(sb2);
		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		
		
		
		
		
		

	}

}
