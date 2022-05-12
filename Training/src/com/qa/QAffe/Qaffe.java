package com.qa.QAffe;

import java.util.ArrayList;
import java.util.Collections;

public class Qaffe {
		public static ArrayList<String> Orders = new ArrayList<>();
	
		public static void addOrder() {
			Orders.add("Flat white");
			Orders.add("Mocha");
			Orders.add("Americano");
			Orders.add("Tea");
			Orders.add("Latte");
			Orders.add("Hot chocolate");
		}
		public static void returnOrder() {
			Orders.get(0);
		}
		public static void modifyOrder() {
			Orders.set(0, "Cappachino");
		}
		public static void removeOrder() {
			Orders.remove(4);
		}
		public static void printOrder() {
//			for (int i = 0; i < Orders.size(); i++)
//				System.out.println(Orders);
			Collections.sort(Orders);
			for (String Ord : Orders) {
				System.out.println(Ord);
			}
		}
			
		
		public static void clearOrder() {
			Orders.clear();
		}
	}





