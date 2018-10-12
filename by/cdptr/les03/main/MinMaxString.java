package by.cdptr.les03.main;

import java.util.Scanner;

public class MinMaxString {
	
	
	public static void main(String[] args) {
		findAndPrintMinMax(3);		
	}
	
	public static void findAndPrintMinMax(int n){
		Scanner sc = new Scanner(System.in);
		String max = "", min = "", str = "";
		for (int i = 0; i < n; i++) {
			str = readLineFromConsole(sc);
			if (i == 0) {
				min = str;
			}
			if (str.length() > max.length()) {
				max = str;
			} else if (str.length() < min.length()) {
				min = str;
			}
		}
		
		printResult(min, max);
		
	}
	
	
	public static String readLineFromConsole(Scanner sc) {
		String str = "";
		System.out.print("> ");
		if (sc.hasNextLine()) {
			str = sc.nextLine();
		}	
		return str;
	}
	
	public static void printResult(String min, String max) {
		System.out.println("max string = " + max + " length=" + max.length());
		System.out.println("min string = " + min + " length=" + min.length());
	}
	
		
	}
	

