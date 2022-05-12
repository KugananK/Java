package com.qa.Objects;

public class Eagles extends Bird {
	private int eyesight;
	public String screech() {
		return "Cacaw";
	}
	public Eagles(String colour, String diet, int wingSpan, int eyesight) {
		super(colour, diet, wingSpan);
		this.eyesight = eyesight;
	}
	public int getEyesight() {
		return eyesight;
	}
	public void setEyesight(int eyesight) {
		this.eyesight = eyesight;
	}
	
}
