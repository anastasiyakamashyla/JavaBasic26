package by.cdptr.les03.main;

import java.util.Scanner;

public class LastDigit {
	public static void main(String[] args) {
		int number = readNumberFromConsole();
		int poslZifra = findLastDigit(number);
		int poslZifraKv = findLastDigitOfKv(poslZifra);
		printResult(number, poslZifraKv);
	}
	
	public static int readNumberFromConsole() {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.print("Введите число: ");
		if (sc.hasNextInt()) {
			number = sc.nextInt();
		}		
		return number;
	}
	
	public static void printResult(int number, int poslZifraKv) {
		if(poslZifraKv == -1){
			System.out.println("Что-то не то с программой.");			
		} else {
		System.out.println("Последння цифра квадрата числа " + number + " равняется "
				+ poslZifraKv);
		}
	}
	
	public static int findLastDigit(int number){
		int poslZifra = number % 10;
		return poslZifra;
	}
	
	public static int findLastDigitOfKv(int poslZifra){
		int poslZifraKv;

		switch (poslZifra) {
		case 0:
			poslZifraKv = 0;
			break;
		case 1:
			poslZifraKv = 1;
			break;
		case 2:
			poslZifraKv = 4;
			break;
		case 3:
			poslZifraKv = 9;
			break;
		case 4:
			poslZifraKv = 6;
			break;
		case 5:
			poslZifraKv = 5;
			break;
		case 6:
			poslZifraKv = 6;
			break;
		case 7:
			poslZifraKv = 9;
			break;
		case 8:
			poslZifraKv = 4;
			break;
		case 9:
			poslZifraKv = 1;
			break;
		default:
			return -1;		
		}
		
		return poslZifraKv;
		
	}
}