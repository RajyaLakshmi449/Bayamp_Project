package com.bayamp.practice.one;

public class AddPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeAdd(5,7);
			}
	
	public static void primeAdd(int x, int y)
	{
		int result1 = com.bayamp.practice.one.CheckPrime.primeNumber(x);
		int result2 = com.bayamp.practice.one.CheckPrime.primeNumber(y);
		
		if(result1==1 && result2==1)
		{
			int total =  com.bayamp.practice.one.Sum.sumOfTwo(x,y);
			System.out.println("Sum of prime numbers is:" +total);
						
		}
		//System.out.println("Sum of prime numbers is:" +total);
	}

}
