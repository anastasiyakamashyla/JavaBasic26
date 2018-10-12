package by.cdptr.les04.main;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		int[] mas = new int[10];
		enterArrayWithRandom(mas);
		printArray(mas);
		int counter = findZeroIndex (mas);
		int[] arrayZeroIndex = createArrayZeroIndex (mas, counter);
		printArray(arrayZeroIndex);	

	}

	public static void enterArrayWithRandom(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(2);
		}
	}

	public static int findZeroIndex(int[] mas) {
		int counter = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				counter++;
			}
		}
	   return counter;
	}
	
	public static int[] createArrayZeroIndex(int[] mas, int counter) {
		
		int[] arrayZeroIndex = new int[counter];
		int k = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				arrayZeroIndex [k] = i;	
				k++;
			}
		}
		return arrayZeroIndex;
	}

	public static void printArray(int[] mas) {
		System.out.println("--------------------------------------------");
		for (int i = 0; i < mas.length; i++) {
			System.out.print("mas[" + i + "]=" + mas[i] + "; ");
		}
		System.out.println();
		System.out.println("--------------------------------------------");
	}

	public static void findMaxElementAndIndex(int[] mas) {
		if (mas.length == 0) {
			return;
		}
		int max;
		int index;
		max = mas[0];
		index = 0;
		for (int i = 1; i < mas.length; i++) {
			if (max < mas[i]) {
				max = mas[i];
				index = i;
			}
		}
		System.out.println("Максимальный элемент " + max + " расположен на позиции " + index + ".");
	}

	public static void sortArray(int[] mas) {
		int minValueIndex = 0;
		for (int i = 0; i < mas.length; i++) {
			minValueIndex = i;
			for (int j = i + 1; j < mas.length; j++) {
				if (mas[j] < mas[minValueIndex]) {
					minValueIndex = j;
				}
			}
			int temp = mas[i];
			mas[i] = mas[minValueIndex];
			mas[minValueIndex] = temp;
		}
	}
}