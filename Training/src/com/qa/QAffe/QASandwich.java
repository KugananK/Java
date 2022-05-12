package com.qa.QAffe;

import java.util.ArrayList;

public class QASandwich {
	public static ArrayList<String> Sandwich = new ArrayList<>();
	
	public static boolean addSando(String order) {
		return Sandwich.add(order);
	}
	public static String returnSando(int index) {
		System.out.println(Sandwich.get(index));
		return Sandwich.get(index);
	}
	public static String modifySando(int index, String order) {
		return Sandwich.set(index, order);
	}
	public static String removeSando(int index) {
		return Sandwich.remove(index);
	}
	public static void printSando() {
		for(String Sando : Sandwich) {
		System.out.println(Sando);
		}
	}
	public static void clearSando() {
		Sandwich.clear();
	}
}