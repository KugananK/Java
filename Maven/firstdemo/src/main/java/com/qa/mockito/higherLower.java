package com.qa.mockito;

import java.util.Random;

public class higherLower {
	Random rng = new Random();
	
	public String highLow(int x) {
		// Make a random number from 0 - 50
		int randNum = rng.nextInt(51);
		
		if(x > randNum) {
			return "Higher!";
		} else if (x < randNum) {
			return "Lower!";
		} else {
			return "Same Number..";
		}
	}
}