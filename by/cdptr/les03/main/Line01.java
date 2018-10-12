package by.cdptr.les03.main;

import java.util.Scanner;

public class Line01 {

	public static void main(String[] args) {
		int number = readFromConsole();
		boolean result = containsEvenDigit(number);
		printResult(result);
	}

	public static int readFromConsole() {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.print("Введите число: ");
		if (sc.hasNextInt())
			number = sc.nextInt();
		return number;
	}

	public static boolean containsEvenDigit(int number) {
		int digit = 0;
		boolean result = false;
		while (number != 0) {
			digit = number % 10;
			number = number / 10;
			if (digit % 2 == 0) {
				result = true;
				break;
			} 
		}

		return result;
	}

	public static void printResult(boolean result) {

		if (result) {
			System.out.println("В числе есть четная цифра.");
		} else {
			System.out.println("В числе нет четных цифр.");
		}
	}

}
