package com.qa.iteration;

public class Array {
	public static void colourArray() {
	String [] colour = {"Red", "Blue", "Green", "Purple", "Orange"}; { 
		colour[1] = "Navy";
		colour[2] = "Teal";
		for (int i = 0; i < colour.length; i++) {
			if (colour[i] == "Purple") {
				System.out.println("Favourite colour is: " + colour[i]);
			} else {
				System.out.println(colour[i]);
			}
	}
		
}

}
}