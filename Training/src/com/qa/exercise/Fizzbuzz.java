package com.qa.exercise;

public class Fizzbuzz {
public static String game(int x) {
	if (x % 3 == 0 && x % 5 == 0) {
		return "FizzBuzz";
	} else if (x % 3 == 0 && x % 5 != 0) {
		return "Fizz";
	} else if (x % 3 != 0 && x % 5 == 0) {
		return "Buzz";
	} else {
		return "Number: " + x;
	}
}
}

//normal numbers
//multiples of 3 are fizz
//multiples of 5 are buzz
//multiples of 3 and 5 are fizzbuzz
/* 
if( x % == 0) {
	if(x % 5 == 0) {
		return "fizzbuzz: " + x;
	} else {
		return "fizz: " + x;
	}
} else if (x % 5 == 0) {
	return "buzz: " + x;
} else {
	return Integer.toString(x);
}
}
*/