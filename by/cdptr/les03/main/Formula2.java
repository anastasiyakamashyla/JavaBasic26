 package by.cdptr.les03.main;

import java.util.Scanner;

public class Formula2 {
	public static void main(String[] args) {
		double x = 0, fx = 0;
		

		x = readFromConsole();
		fx = calcFx(x);
		printResult (x, fx);
		
	}
     
	public static double calcFx(double x) {
		double fx;
		if (x <= -3) {
			fx = 9;
		} else if (x > 3) {
			fx = 1 / (Math.pow(x, 2) + 1);
		} else {
			fx = Double.NaN;
				
		}
		return fx;
	}
	  public static double readFromConsole () {
	    	Scanner sc = new Scanner(System.in);
	    	double x=0;
	    	
			System.out.println("Введите x: ");
			while (!sc.hasNextDouble ()) {
				sc.next ();
				System.out.println("Введите x: ");
			}
			x = sc.nextDouble();
			return x;
	  }
	public static void printResult (double x, double fx) {
		System.out.println("F("+ x + ")=" + fx);
	}
	
	
}

