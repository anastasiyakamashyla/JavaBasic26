package by.cdptr.les02.main;

import java.util.Scanner;
public class Formula {
	public static void main (String [] arg) {
		double a=0, b=0, c=0, d;
	    Scanner sc = new Scanner (System.in);
		System.out.println ("Введите а:");
		if (sc.hasNextDouble()) {
			a = sc.nextDouble ();
		}
		System.out.println ("Введите b:");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble ();
		}
		System.out.println ("Введите c:");
		if (sc.hasNextDouble()) {
			c = sc.nextDouble ();
		}
		double b2= Math.pow(b, 2);
		double a3= Math.pow(a, 3);
		double root = b2 + 4*a*c;
		
		if (a != 0) { 
			if (root>0) {
		    d = (b +  Math.sqrt(root))/2*a - a3 * c + b;
			}
				
		    else {
		    System.out.println("Нельзя извлечь корень из отрицательного числа");
			d = Double.NaN;
			}
		}
		
	    else {
	    System.out.println("Знаменатель равен нулю");
		d = Double.NaN;
		}	
		
		System.out.println("d=" + d);
	
	
}}
