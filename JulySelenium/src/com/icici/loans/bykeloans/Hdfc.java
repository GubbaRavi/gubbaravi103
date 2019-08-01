package com.icici.loans.bykeloans;

public class Hdfc implements Rbi{

	@Override
	public void withdrwal() {
		
		System.out.println("I'm With drwal methos from HDFC class");
	}

	@Override
	public void deposit() {
		
		System.out.println("I'm With Deposit from HDFC child class");
		
	}
	
	

}
