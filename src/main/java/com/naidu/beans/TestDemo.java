package com.naidu.beans;

public class TestDemo {
	
	
	public static void main(String[] args) {
		
		
		String s = "java springboot jpa";
		
		String s1 = new String("papinaidu");
		String s2 = "naidu";
		String s3 = s1;
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	    System.out.println(s1==s2);
	    System.out.println(s1.equals(s2));
	    System.out.println(s2==s3);

		String [] words = s.split(" ");

		String output ="";
	
		for(String word: words)
		{
			String rev="";
			for(int i=word.length()-1;i>=0;i--)
			{
				rev+=word.charAt(i);
			}
			output+= rev+ " ";
		}
		System.out.println(output);
		
		
		String str1 = "hello";
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		
		char [] arry = str1.toCharArray();
		
		for(int i=arry.length-1;i>=0;i--)
		{
			System.out.print(arry[i]);
		}
		
	}

}
