package com.bayamp.practice.one;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber = 10;
		int secondNumber = 50;
		//int thirdNumber = 100;
		int sum =  sumOfTwo (firstNumber, secondNumber);
		System.out.println("Sum of two numbers is:" +sum);

	}
	
	public static int sumOfTwo (int x, int y)
	{
		return x+y;
	}

}
