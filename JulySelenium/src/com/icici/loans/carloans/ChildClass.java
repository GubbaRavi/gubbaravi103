package com.icici.loans.carloans;

public class ChildClass extends FirstAbstractClass{

	@Override
	public void m1() {
		
		System.out.println("M1 methos overriden in child class");
		
	}
	
	
	  public void m2() {
	  
	  System.out.println("M2 renovated in child calss"); 
	  }
	 
	
	public static void main(String[] args) {
		
		ChildClass cc = new ChildClass();
		
		cc.m1();
		cc.m2();
		
	}

}
