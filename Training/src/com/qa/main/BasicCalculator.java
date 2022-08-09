package com.qa.main;

public class BasicCalculator {
	public static String calcColour = "Black";
	public float price;
	public BasicCalculator(float price) {
		super();
		this.price = price;
	}
	
	public int add(int x, int y, int z) {
		int result = 0;
				result = x + y + z;
				return result;
	}
	public int subSum(int x, int y) {
		int result = 0;
		result = x - y;
		return result;
	}
	public int mulSum(int x, int y) {
		int result = 0;
		result = x * y;
		return result;
	}
	public int divSum(int x, int y) {
		int result = 0;
		result = x / y;
		return result;
	}
	public String stretch(int x, int y) {
		int result = 0;
		result = x + y;
		return x + " + " + y + " = " + result;
	}

	public int forceReturn(float x, float y) {
		int result = 0;
		result = (int) (x / y);
		return (int) result;
	}
	public int square(int x) {
		int result = 0;
		result = x * x;
		return result;
	}

}
