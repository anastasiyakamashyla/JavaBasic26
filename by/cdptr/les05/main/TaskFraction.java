package by.cdptr.les05.main;

import java.util.Scanner;

public class TaskFraction {
	
	

	public static void main(String[] args) {
		int k = readNumberFromConsole("insert k: ");
		Fraction[] allFractions = fillFraction(k);
		printFractions(allFractions);
	}
	
	public static Fraction[] fillFraction(int k){
		Fraction[] allFractions = new Fraction[k];
		for(int i = 0; i < k; i++){
			int m = readNumberFromConsole("insert m: ");
			int n = readNumberFromConsole("insert n: ");
			Fraction fraction = new Fraction(m, n);
			allFractions[i] = fraction;
		}		
		return allFractions;
	}
	
	public static int readNumberFromConsole(String printLine) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.print(printLine);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("(Wrong format) - " + printLine);
		}
		number = sc.nextInt();
		return number;
	}
	
	public static void printFractions(Fraction[] allFractions){
		int size = allFractions.length;
		for(int i = 0; i < size; i++){
			Fraction fraction = allFractions[i];
			double result = fraction.getFractionValue();
			System.out.println("m=" + fraction.getM() + " n=" + fraction.getN() + " m/n=" + result);
		}
	}

}
