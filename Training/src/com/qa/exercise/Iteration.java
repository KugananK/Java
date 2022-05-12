package com.qa.exercise;

public class Iteration {
public static String moneySpend(float startingMoney, float expenses, float limit) {
	while(startingMoney > limit) {
		startingMoney -= expenses;
		System.out.println("Money left: " + startingMoney);		
	}
	return "STOP SPENDING MONEY!";
}
}
