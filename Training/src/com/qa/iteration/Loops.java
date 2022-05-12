package com.qa.iteration;

public class Loops {
//public static String flowChart() {
//	int a = 100;
//	while (a > 200) {
//		a++;
//		System.out.println("A");
//	} 
//	return "End";
//}
//public static String flowChart2() {
//	int A = 100;
//	while (A <= 200) {
//		A++;
//		if( A % 2 == 0) {
//			System.out.println("-");
//		} else {
//			System.out.println("+");
//		}
//		
//	}
//	return "End2";
//  }
//public static String flowchartReece2() {
//	for (int i = 1; i <= 10; i++) {
//		for(int j = 1; j <= 10; j++) {
//			System.out.println(j);
//		}
//		System.out.println("Internal loop is finished");
//	}
//	return "After loop";
//}
//public static String flowChart3() {
//	for(int c = 1; c <= 10; c++) {
//		int b = 0;
//		while (b <10) {
//			b++;
//			System.out.println("Number: " + b + "|| Counter: " + c);
//		}
//	}
//	return "End3";
//}
//public static String flowChart5() {
//	for(int d = 1; d <= 10; d++) {
//		for(int x = 1; x <= d; x++) {
//			System.out.println(d);
//		}
//	}
//	return "End5";
//	}
	
public static String coin(float cost, float moneySpent) {
	int fifty = 0;
	int twenty = 0;
	int ten = 0;
	int five = 0;
	int two = 0;
	int one = 0;
	int fiftyPence = 0;
	int twentyPence = 0;
	int tenPence = 0;
	int fivePence = 0;
	int twoPence = 0;
	int onePence = 0;
	{
	float change = moneySpent - cost;
	
	
	while (change >= 50) {
		fifty++;
		change -= 50;
	}
	
	while (change >= 20) {
		twenty++;
		change -= 20;
	}
	
	while (change >= 10) {
		ten++;
		change -= 10;
	}
	
	while (change >= 5) {
		five++;
		change -= 5;
	}
	
	while (change >= 2) {
		two++;
		change -= 2;
	}
	
	while (change >= 1) {
		one++;
		change -= 1;
	}
	
	while (change >= 0.5f) {
		fiftyPence++;
		change -= 0.5;
	}
	
	while (change >= 0.2f) {
		twentyPence++;
		change -= 0.2;
	}
	
	while (change >= 0.1f) {
		tenPence++;
		change -= 0.1f;
	}
	
	while (change >= 0.05f) {
		fivePence++;
		change -= 0.05f;
	}
	
	while (change >= 0.02f) {
		twoPence++;
		change -= 0.02f;
	}
	
	while (change >= 0.01f) {
		onePence++;
		change -= 0.01f;
	}
	System.out.println("Fifty: " + fifty);
	System.out.println("Twenty: " + twenty);
	System.out.println("Ten: " + ten);
	System.out.println("Five: " + five);
	System.out.println("Two: " + two);
	System.out.println("One: " + one);
	System.out.println("FiftyPence: " + fiftyPence);
	System.out.println("TwentyPence: " + twentyPence);
	System.out.println("TenPence: " + tenPence);
	System.out.println("FivePence: " + fivePence);
	System.out.println("TwoPence: " + twoPence);
	System.out.println("OnePence: " + onePence);
}
return "That's all";
}
}
