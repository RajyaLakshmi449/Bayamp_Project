package com.bayamp.practice.strings;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String input = "Abdul Kalam is a great scientist";
		
		System.out.println("Result: '" + ReverseParts(input, " +", ""));

	}
	
	public static String reverseString(String input, String splitBy, String joinBy)
	{
		StringBuilder built = new StringBuilder();
		String[] list = input.split(splitBy);
		//Rejoin all the characters into StringBuilder
		for(String part: list) {
			built.insert(0, part);
			built.insert(0,  joinBy);
		}
		//Remove the unnecessary joinBy bit
		built.delete(0, 1);
		//Geback to the final string
	    return built.toString();
	}

}
