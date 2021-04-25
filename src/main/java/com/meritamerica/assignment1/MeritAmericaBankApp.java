package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	
	public static void main(String[]args) {
		
		AccountHolder neeraja = new  AccountHolder("Neeraja",  "_", "Paladugu", "12345",100.0 ,1000.0);
				
		//CheckingAccount  paladugu  = new  CheckingAccount(100.0, 0.0001, 100.03);
		//AccountHolder angela = new AccountHolder("Angela", "_", "Smith", "67891", 100.0, 1000.0);
		// CheckingAccount checking = new CheckingAccount(19.32, neeraja);
		 // SavingsAccount savings = new SavingsAccount(200.50, smith);
		//SavingsAccount  np = new  SavingsAccount(1000.0, 0.01, 1030.0);
		 neeraja.toString();
		 neeraja.getSavingsAccount();

	//System.out.println(neeraja + " " + toString());
		System.out.println(neeraja);
		
		
	   
	}


}

