package com.qa.Objects;

public class Games {
	public boolean gore;
	public int ageRating;
	public float price;
	public String genre;
	public Games(boolean gore, int ageRating, float price, String genre) {
		super();
		this.gore = gore;
		this.ageRating = ageRating;
		this.price = price;
		this.genre = genre;
	}
	
	@Override
	public String toString() {
		return "Games [gore=" + gore + ", ageRating=" + ageRating + ", price=" + price + ", genre=" + genre + "]";
	}
	



}
