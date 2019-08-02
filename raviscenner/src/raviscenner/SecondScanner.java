package raviscenner;

import java.util.Scanner;

public class SecondScanner {

	public static void main(String[] args) {
	  int a,b, add;
	  Scanner sc = new Scanner(System.in);
       System.out.println( "enter first number");
        a=sc.nextInt();
       System.out.println("enter second number");
       	b=sc.nextInt();
       	sc.close();
       	add=a+b;
       	System.out.println("display sub number" +add);
	
	}

}
