package com.icici.loans.bykeloans;

public interface Rbi 
{
    public  void withdrwal();
	public  void deposit();
	
	public static void main(String[] args) {
		Rbi r = new Icici(); 
		r.deposit();
		
		Rbi r1 = new Hdfc();
		
		r1.withdrwal();
		
		Rbi s;
		s = new Icici();
		s.deposit();
		s= new Hdfc();
		s.withdrwal();
		
	}
}
