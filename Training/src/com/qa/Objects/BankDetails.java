package com.qa.Objects;

public class BankDetails {

	private float balance;
	private String accNum;
	private String userName;
	private String password;
	
	
	public BankDetails(float balance, String accNum, String userName, String password) {
		super();
		this.balance = balance;
		this.accNum = accNum;
		this.userName = userName;
		this.password = password;
	}


	public float getBalance() {
		return balance;
	}


	public void setBalance(float balance) {
		if (balance > 150) {
			System.out.println("too much");
			return;
		} else {
		this.balance = balance;
		}
	}


	public String getAccNum() {
		return accNum;
	}


	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword(String pin) {
		if (pin == "1234") {
		return pin;
		} else {
			System.out.println("Incorrect pin");
			return "Incorrect Pin";
		}
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
}
