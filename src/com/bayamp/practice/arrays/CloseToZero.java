package com.bayamp.practice.arrays;

public class CloseToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The number closest to zero in the array is: ");
		
		int numbers[] = {6,-3,-1,7};
		int[] positive = new int[4];
		int ref=0;
		int smallest=numbers[0];
		
		for(int i=0; i<numbers.length; i++){
			if(numbers[i]>=0)
			{
				positive[i] = numbers[i];
			}
			else
			{
				positive[i] = numbers[i]*(-1);
			}
			//System.out.println(positive[i]);
		}
	//Checking for 0
		for(int i=0; i<positive.length; i++)
		{
			if(positive[i]<smallest )
			{
				//smallest = positive[i];
				ref = i;
				
			}
		}
		System.out.println(numbers[ref]);

	}

}
