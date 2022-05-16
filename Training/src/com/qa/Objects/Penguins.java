package com.qa.Objects;

public class Penguins extends Bird{
	public String swim() {
		return "flys through the water";
	}
	private int fishEaten;
	
	public Penguins(String colour, String diet, int wingSpan, int fishEaten) {
		super(colour, diet, wingSpan);
		this.fishEaten = fishEaten;
	}

	@Override
	public String layEgg() {
		// TODO Auto-generated method stub
		return "Lays eggs";
	}

	@Override
	public String walk() {
		// TODO Auto-generated method stub
		return "Waddle waddle";
	}

	public int getFishEaten() {
		return fishEaten;
	}

	public void setFishEaten(int fishEaten) {
		this.fishEaten = fishEaten;
	}
	
	
//	private int fishEaten;
//	public String swim() {
//		return "just keep swimming";
//	}
//	public Penguins(String colour, String diet, int wingSpan, int fishEaten) {
//		super(colour, diet, wingSpan);
//		this.fishEaten = fishEaten;
//	}
//	public int getFishEaten() {
//		return fishEaten;
//	}
//	public void setFishEaten(int fishEaten) {
//		this.fishEaten = fishEaten;
//	}
	
}
