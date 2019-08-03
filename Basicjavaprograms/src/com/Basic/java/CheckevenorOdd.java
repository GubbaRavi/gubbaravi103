package com.Basic.java;

import java.util.Scanner;

public class CheckevenorOdd {

	public static void main(String[] args) {
		int num;
		System.out.println("enter the integer no");
		Scanner input =new Scanner(System.in);
		num=input.nextInt();
		if(num % 2==0)
		System.out.println("entered no is even");
		else
	    System.out.println("enter no is odd");
			
	}

}
