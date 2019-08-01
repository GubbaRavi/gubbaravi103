package com.icici.loans.eduloans;

public class Hdfc2 implements rbi2 {

	public static void main(String[] args) {
	Hdfc2 h = new Hdfc2();
	h.onlinebanking();
	h.onlineshoping();
}

	

	@Override
	public void onlinebanking() {
		
		System.out.println("I am doing onlinebanking in HDFC");
	}

	@Override
	public void onlineshoping() {
		System.out.println("I am purchasing through online HDFC");
		
	}
	
}

