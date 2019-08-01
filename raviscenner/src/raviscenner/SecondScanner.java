package raviscenner;

import java.util.Scanner;

public class SecondScanner {

	public static void main(String[] args) {
	  int x,y, sub;
	  Scanner sc = new Scanner(System.in);
       System.out.println( "enter first number");
        x=sc.nextInt();
       System.out.println("enter second number");
       	y=sc.nextInt();
       	sc.close();
       	sub=x-y;
       	System.out.println("display sub number" +sub);
	
	}

}
