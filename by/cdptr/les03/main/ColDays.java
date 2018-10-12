package by.cdptr.les03.main;

import java.util.Scanner;

public class ColDays {
	public static void main(String[] args) {
		int year = readNumberFromConsole("Введите год: ");
		int month = readNumberFromConsole("Введите номер месяца: ");
		int col_day = findCountOfDays(year, month);
		printResult(col_day);
		
	}
	
	public static int readNumberFromConsole(String printLine) {	
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.print(printLine);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Ошибка формата) - " + printLine);
		}
		number = sc.nextInt();
		return number;
	}
	
	public static void printResult(int col_day) {
		System.out.println("Количество дней равно - " + col_day);
	}
	
	public static int findCountOfDays(int year, int month){
		int col_day = 0;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			col_day = 31;
			break;
		case 2:
			if (year % 4 == 0) {
				col_day = 29;
			} else {
				col_day = 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			col_day = 30;
			break;
		}
		
		return col_day;
	}
	
}

