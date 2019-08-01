package com.icici.loans.bykeloans;

public class Icici implements Rbi {

	public static void main(String[] args) {
		Icici i =new Icici();
		i.withdrwal();
		i.deposit();
	}
	@Override
	public void withdrwal() {
		System.out.println("I'm With drwal methos from child class");
	}
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
		System.out.println("I'm deposit method from child class");
	}

}
