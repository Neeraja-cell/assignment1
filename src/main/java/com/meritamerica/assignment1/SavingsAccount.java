package com.meritamerica.assignment1;

public class SavingsAccount {
	private double balance;
	private double interestRate;
	private double futureVal;
	
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
	public boolean withdraw(double amount) {
		if (amount < this.balance) {
			balance -= amount;
			return true;
		}  
		return false;
		
	}
	public boolean deposit(double amount) {
		if (amount > this.balance) {
			balance += amount;
			return true;
		}
		return false;
	}
	
	public double futureValue(int years) {
		futureVal = Math.pow(1 + 0.01, years);
		return futureVal;
		
	}
	@Override
	public String toString() {
		return "SavingsAccount [balance=" + balance + ", interestRate=" + interestRate + ", futureVal=" + futureVal
				+ ", getBalance()=" + getBalance() + ", getInterestRate()=" + getInterestRate() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}