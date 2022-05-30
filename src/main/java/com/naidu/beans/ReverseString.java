package com.naidu.beans;

public class ReverseString {

	public static void main(String[] args) {

		String str = "krishna";
		String input = "hello java spring boot";
		System.out.println("Original String :: "+input);

		ReverseString.eachWordReverseString(input);

		// Approach-1
		char[] charArray = str.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
		System.out.println("");

		// Approach-2
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println("");

		// Approach-3
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());

		// Approach-4
		StringBuilder sbuilder = new StringBuilder(str);
		System.out.println(sbuilder.reverse());

	}

	private static void eachWordReverseString(String input) {
		
		String output = "";
		
		String [] words = input.split(" ");
		
		for(String word: words)
		{
			String revWord ="";
			for(int i=word.length()-1;i>=0;i--)
			{
				revWord+=word.charAt(i);
			}
			output  = output + revWord+ " "; 
			
		}
		System.out.println(output);
	}


}
