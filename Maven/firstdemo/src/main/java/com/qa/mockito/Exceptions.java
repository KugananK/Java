package com.qa.mockito;

public class Exceptions {

	public int divisionExceptions() {
		try {
//			int[] numbers = {1,2,3,4};
//			System.out.println(numbers[3]);
			int sum = 2/0;
			return sum;
		} catch(ArithmeticException dividezero) {
			dividezero.printStackTrace();
			return 0;
		}
	}
	
	public int divTenException() {
		try {
			if ()
			}
		}
	}
}
