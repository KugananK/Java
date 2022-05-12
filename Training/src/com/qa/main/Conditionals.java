package com.qa.main;

public class Conditionals {
	public static String sub(int x, int y) {
		if (y > x) {
			return " you can't subtract that, negative error";
		} else {
			int result = x - y;
			return x + " - " + y + " = " + result;
		}
	}
	
	public static float div( float x, float y) {
		if (y == 0) {
			System.out.println("You can't divide by 0!");
			return 0f;
		} else {
		float result = x / y;
		return result;
	}
	}
	
	public static int mulTen(int x, int y) {
		if (y == 10) {
			System.out.println("That's too easy for a calculator");
		return 0;	
		} else {
		int result = x * y;
		return result;
	}
	}
	public static void oddEven(int x) {
		if (x % 2 == 0) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is Odd");
		}
	}
	public static String mulFive(float x) {
		if (x % 5 == 0f) {
			return "Multiple of 5!";
		} else {
			return "Not a multiple of 5!";
		}
	}
}
