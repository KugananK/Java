package com.qa.Objects;

public class Eagles extends Bird {
	private int eyesight;
	public String screech() {
		return "Caw";
	}
	public Eagles(String colour, String diet, int wingSpan, int eyesight) {
		super(colour, diet, wingSpan);
		this.eyesight = eyesight;
	}
	@Override
	public String layEgg() {
		// TODO Auto-generated method stub
		return "Nests on trees";
	}
	@Override
	public String walk() {
		// TODO Auto-generated method stub
		return "Prefers to fly";
	}
	public int getEyesight() {
		return eyesight;
	}
	public void setEyesight(int eyesight) {
		this.eyesight = eyesight;
	}
	
//	private int eyesight;
//	public String screech() {
//		return "Cacaw";
//	}
//	public Eagles(String colour, String diet, int wingSpan, int eyesight) {
//		super(colour, diet, wingSpan);
//		this.eyesight = eyesight;
//	}
//	public int getEyesight() {
//		return eyesight;
//	}
//	public void setEyesight(int eyesight) {
//		this.eyesight = eyesight;
//	}
	
}
