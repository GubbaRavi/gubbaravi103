package raviscenner;

import java.util.Scanner;

public class FirstScanner {

	public static void main(String[] args) {
	    int x,y,z, add; 
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("enter first number");
        x=sc.nextInt();
       
        System.out.println("enter second number");
        y=sc.nextInt();
      
        System.out.println("enter third number");
        z=sc.nextInt();
        sc.close();
        add=x+y+z;
        System.out.println("Display sum of numbers" + add);
	}

}
