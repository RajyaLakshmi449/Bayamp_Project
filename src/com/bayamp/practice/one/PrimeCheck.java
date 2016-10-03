package com.bayamp.practice.one;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPrime(50);
			
	}	
		
		
		
		
		
		
		
	public static boolean checkPrime(int n)
	{
	
		for(int i=2; i<n; i++)
		{
			if(n%i == 0)
			{
				//System.out.println(n + " is not prime");
				return false;
			}
		}
		return true;

	}

}
