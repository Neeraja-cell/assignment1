package com.meritamerica.assignment1;

public class CheckingAccount  {
	private double balance;
	private double interestRate = 0.0001;
	private double futureVal;
	
	public CheckingAccount(double checkingAccountOpeningBalance) {
		// TODO Auto-generated constructor stub
		balance = checkingAccountOpeningBalance;
		
	}
//	public CheckingAccount(double balance, double interestRate, double futureVal) {
//		//super();
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
	// this is the method for with draw for fonds
	//the amount withdraw has to be less than the balance in the account
	public boolean withdraw(double amount)

	 {
		if (amount < this.balance && amount > 0) {
			balance -= amount;
			return true;
		}  
		return false;
		
	}
	//this is method is fo depositing funds.If amount is >0 retn True
	//balance is less than 0 it will print you cant deposit
	
	public boolean deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		}else {
			System.out.println(" You canot deposit a negative amount");
		}
		
		return false;
	}
	
	public double futureValue(int years) {
		
		futureVal = Math.pow(1 + 0.0001, years)* this.balance;
		return futureVal;
		
	}

	//the to string method will print the hidden values
	@Override
	public String toString() {
		return "CheckingAccount [balance=" + balance + ", interestRate=" + interestRate + ", futureVal=" + futureVal
				+ "]";
	}
	public static void main(String[]args) {
	
		AccountHolder neeraja = new  AccountHolder("Neeraja",  "_", "Paladugu", "12345",100.0 ,1000.0);
		//CheckingAccount  paladugu = new  CheckingAccount(100.0, 0.0001, 100.03);
		//AccountHolder angela = new AccountHolder("Angela", "_", "Smith", "67891", 2000, 200);
		System.out.println( neeraja  );
		
	}
}