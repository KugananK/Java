package com.qa.Objects;

public class Penguins extends Bird{
	private int fishEaten;
	public String swim() {
		return "just keep swimming";
	}
	public Penguins(String colour, String diet, int wingSpan, int fishEaten) {
		super(colour, diet, wingSpan);
		this.fishEaten = fishEaten;
	}
	public int getFishEaten() {
		return fishEaten;
	}
	public void setFishEaten(int fishEaten) {
		this.fishEaten = fishEaten;
	}
	
}
