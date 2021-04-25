package com.meritamerica.assignment1;

public class SavingsAccount {
	private double balance;
	private double interestRate = 0.01;
	private double futureVal;
	
	public SavingsAccount(double savingsAccountOpeningBalance) {
		// TODO Auto-generated constructor stub
		balance = savingsAccountOpeningBalance;
	}
	
//	public SavingsAccount(double balance, double interestRate, double futureVal) {
//		super();
//		this.balance = balance;
//		this.interestRate = interestRate;
//		this.futureVal = futureVal;
//	}

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double getFutureVal() {
		return futureVal;
	}
	public void setFutureVal(double futureVal) {
		this.futureVal = futureVal;
	}
	public boolean withdraw(double amount) {
		if (amount < this.balance) {
			balance -= amount;
			return true;
		}  
		return false;
		
	}
	public boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		}
		return false;
	}
	
	public double futureValue(int years) {
		futureVal = Math.pow(1 + 0.01, years)* this.balance;
		return futureVal;
		
	}
	@Override
	public String toString() {
		return "SavingsAccount [balance=" + balance + ", interestRate=" + interestRate + ", futureVal=" + futureVal
				+ "]";
	}
public static void main(String[]args) {
	
		
		//SavingsAccount  np = new  SavingsAccount(1000.0, 0.01, 1030.03);
		//AccountHolder angela = new AccountHolder("Angela", "_", "Smith", "67891", 2000, 200);
		
	//System.out.println(np);
		
		
	}
	

	
}