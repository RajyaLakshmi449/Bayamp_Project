package com.bayamp.practice.one;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		primeNumber(50);
				
	}
	
	public static int primeNumber (int n)
	{
		for(int i=2; i<n; i++)
		{
			if(n%i == 0)
			{
				System.out.println("Is not prime");
				return 0;
				}
							
		}
		System.out.println("Is prime");
		return 1;
	}
}
	
	
