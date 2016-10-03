package com.bayamp.practice.arrays;

public class LeastPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smallPositive();
		highnegative();
	}
	
	public static void smallPositive()
	{
		System.out.println("Smallest positive number in the array is: ");
		int numbers[]={2,3,6,8,-1,-2,-3,10};
		int smallest = 0;
		
/**To find the first number in the array which is greater than 0*/
		for(int index=0; index<numbers.length; index++)
		{
			if(numbers[index]>0 && smallest<numbers[index]) 
			{
				smallest=numbers[index];
				break;				
				//System.out.println("Smallest number in the area is: "+smallest);
			}
		}
		System.out.println(smallest);
	}
	
	public static void highnegative()
	{
		System.out.println("Highest negative number in the array is: ");
		int numbers[]={2,3,6,8,-1,-2,-3,10};
		int highest = 0;
		
/**To find the first number in the array which is greater than 0*/
		for(int index=0; index<numbers.length; index++)
		{
			if(numbers[index]<0 && highest>numbers[index]) 
			{
				highest=numbers[index];
				break;				
				//System.out.println("Smallest number in the area is: "+smallest);
			}
		}
		System.out.println(highest);
	}
}
