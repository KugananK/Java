package com.qa.main;

import com.qa.exercise.*;
import com.qa.iteration.*;
import com.qa.Objects.BankDetails;
import com.qa.Objects.Games;
import com.qa.QAffe.*;

public class Main {
	public static void main(String[] args) {
//		System.out.println(BasicCalculator.addSum(8, 90, 3));
//		System.out.println(BasicCalculator.subSum(15, 7));
//		System.out.println(BasicCalculator.mulSum(2, 7));
//		System.out.println(BasicCalculator.divSum(9, 3));
//		System.out.println(BasicCalculator.stretch(4, 3));
//		System.out.println(BasicCalculator.forceReturn(15.0f, 4.5f));
//		System.out.println(Conditionals.sub(5, 6));
//		System.out.println(Conditionals.div(15.6f, 0f));
//		System.out.println(Conditionals.mulTen(30, 10));
//		System.out.println(Conditionals.mulFive(15f));
//		System.out.println(Blackjack.play(1, 0));
//		System.out.println(Blackjack.play(1, 2));
//		System.out.println(Blackjack.play(2, 2));
//		System.out.println(Blackjack.play(22, 20));
//		System.out.println(Blackjack.play(21, 22));
//		System.out.println(Blackjack.play(10, 10));
//		System.out.println(Uniquesum.input(1, 2, 3));
//		System.out.println(Uniquesum.input(1, 2, 2));
//		System.out.println(Uniquesum.input(3, 5, 3));
//		System.out.println(Uniquesum.input(6, 6, 7));
//		System.out.println(Uniquesum.input(2, 2, 2));
//		System.out.println(Fizzbuzz.game(9));
//		System.out.println(Fizzbuzz.game(15));
//		System.out.println(Fizzbuzz.game(10));
//		System.out.println(Fizzbuzz.game(7));
//	    System.out.println(Iteration.moneySpend(300f, 23.5f, 40f));
//		System.out.println(Loops.flowChart());
//		System.out.println(Loops.flowChart2());
//		System.out.println(Loops.flowchartReece2());
//		System.out.println(Loops.flowChart3());
//		System.out.println(Loops.flowChart5());
//		System.out.println(Loops.coin(54.23f, 153.16f));
//		Array.colourArray();
//		Qaffe.addOrder();
//		Qaffe.returnOrder();
//		Qaffe.modifyOrder();
//		Qaffe.removeOrder();
//		Qaffe.printOrder();
//		Qaffe.clearOrder();
//		QASandwich.addSando("BLT");
//		QASandwich.addSando("Club");
//		QASandwich.addSando("Tuna");
//		QASandwich.addSando("Nutella");
//		QASandwich.returnSando(1);
//		QASandwich.modifySando(2, "Cheese");
//		QASandwich.removeSando(3);
//		QASandwich.printSando();
//		QASandwich.clearSando();
//		Games Borderlands = new Games(true, 18, 2.56f, "RPG, Loot and Shoot");
//		Games Forza = new Games(false, 3, 39.99f, "Racing");
//		System.out.println(Borderlands.genre);
//		System.out.println(Borderlands.ageRating);
//		Borderlands.ageRating = 17;
//		System.out.println(Borderlands.ageRating);
//		System.out.println(Borderlands);
//		System.out.println(Forza);
//		BasicCalculator calc = new BasicCalculator(19.99f);
//		System.out.println(calc.addSum(2, 60, 4));
//		System.out.println(calc.subSum(7, 2));
//		System.out.println(calc.price);
//		System.out.println(BasicCalculator.calcColour);
		BankDetails user1 = new BankDetails(93.5f, "07089650", "EMEB32", "32BEME!");
		System.out.println(user1.getBalance());
		user1.setBalance(190f);
		System.out.println(user1.getBalance());
	}
	}

