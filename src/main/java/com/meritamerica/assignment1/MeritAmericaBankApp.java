package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	
	public static void main(String[]args) {
		
		//Instantiate an account holder with a checkings balance of $100 and a savings balance of $1000
		AccountHolder neeraja = new  AccountHolder("Neeraja",  "_", "Paladugu", "12345",100.0 ,1000.0);
		//Display the account holder’s toString() output
		System.out.println(neeraja);
		//Deposit $500 into the checking account
		neeraja.getCheckingAccount().deposit(500);
		//Withdraw $800 from the savings account
		neeraja.getSavingsAccount().withdraw(800);
		//Display the checking account toString() output

		System.out.println(neeraja.getCheckingAccount());
		//Display the savings account toString() output

		System.out.println(neeraja.getSavingsAccount());
		//Instantiate another account holder with a checkings balance of $200 and a savings balance of $500
		AccountHolder angela = new AccountHolder("Angela", "_", "Smith", "67891", 200.0, 500.0);
		//Display the account holder’s toString() output
		System.out.println(angela);
		//Deposit -$500 into the checking account
        //it will print the message
		angela.getCheckingAccount().deposit(-500);
		//Withdraw $600 from the savings account

		angela.getSavingsAccount().withdraw(600);
		//Display the second account holder’s toString() output

		System.out.println(angela.getCheckingAccount());
		System.out.println(angela.getSavingsAccount());
		   
	}

	

}

