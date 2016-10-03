package com.bayamp.practice.arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayIndex();
		sumArray();
		evenElement();
		
	}
	
/** Method for displaying the indices and their values in the given array*/
	
	private static void arrayIndex()
	{
		System.out.println("Index \t value");
		int numbers[]= {5,10,15,20,25,30,35,40};
		
		for(int index=0; index<numbers.length; index++)
		{
			System.out.println(+index + "\t "+numbers[index]);
						
		}
		System.out.println(+numbers[5]);
	}
	
/** Method for displaying the sum of elements in an array*/
	
	private static void sumArray()
	{
		int numbers[] = {5,10,15,20,25,30,35,40};
		int sum=0;
		
		for(int index=0; index<numbers.length; index++)
		{
			sum +=numbers[index];
		}
		System.out.println("The sum of elements in the given array is: " +sum);
	}
	
/** Method to display even numbers in an array. */	
	
	public static void evenElement()
	{
		System.out.print("Even numbers in the array are ");
		int numbers[] = {5,10,15,20,25,30,35,40,45,50};
		
		for(int index=0; index<numbers.length; index++)
		{
			if(numbers[index]%2 == 0)
			{
				 System.out.print( " "+numbers[index]);
			}
					
	    }
			
	}

/** Methods to find the least positive number in an array*/

}
