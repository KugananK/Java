package com.qa.exercise;

public class Blackjack {
	public static int play(int x, int y) {
		if (x == y && x <= 21 && y <= 21) {
			System.out.println("Draw");
			return x;
		} else if (x > 21 && y > 21) {
			System.out.println("Both bust");
			return 0;
		} else if (x > 21 && y <= 21) {
			System.out.println("Player 2 wins, Player 1 is bust");
			return y;
		} else if (y > 21 && x <= 21) {
			System.out.println("Player 1 wins, Player 2 is bust");
			return x;
		} else if (x <= 21 && y <= 21 && x > y) {
			System.out.println("Player 1 wins");
			return x;
		} else if (x <= 21 && y <= 21 && y > x) {
			System.out.println("Player 2 wins");
			return y;
		} else {
			System.out.println("Error");
			return 0;
		}
		
	}
}
// different out comes
// x is closer than y
// y is closer than x
//x is bust - not working
//y is bust - not working
//both are bust - done
//both are equal - done