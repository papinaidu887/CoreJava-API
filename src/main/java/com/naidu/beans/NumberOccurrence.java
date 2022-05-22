package com.naidu.beans;

import java.util.HashMap;
import java.util.Map;

public class NumberOccurrence {
	
	
	
	public static void main(String[] args) {
		
		String str = "879899899";
		
		int [] array = convertStringToIntArray(str);
		
		System.out.println(str);
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(" " +array[i]);
		}
		
		
		
	}

	private static int[] convertStringToIntArray(String str) {
		
	
		int [] array = new int[str.length()];
		
		for(int i=0;i<array.length;i++)
		{
				array[i]=array[i];
				
		}
		return array;
	}

}
