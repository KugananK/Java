package com.qa.Objects;

public abstract class Bird {
	private String colour;
	private String diet;
	private int wingSpan;
	
	public Bird(String colour, String diet, int wingSpan) {
		super();
		this.colour = colour;
		this.diet = diet;
		this.wingSpan = wingSpan;
	}
	public abstract String layEgg();
	public abstract String walk();
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getDiet() {
		return diet;
	}
	public void setDiet(String diet) {
		this.diet = diet;
	}
	public int getWingSpan() {
		return wingSpan;
	}
	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}
	

}
