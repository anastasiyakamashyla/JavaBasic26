package by.cdptr.les04.main;

import java.util.Random;

public class Task3 {
	public static void main(String[] args) {
		
		int mas [] = new int [10]; 
		enterArrayWithRandom(mas);
		boolean isIncreasing = isIncreasing(mas);
		printResult (isIncreasing, mas);
				}
	public static void enterArrayWithRandom(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(10);
		}
	}
	
	
	private static boolean isIncreasing(int mas[]){
		int len = mas.length;
		for(int i = 1; i < len; i++){
			if(mas[i] < mas[i-1]){
				return false;
			}
		}
		return true;
	}
	private static void printResult(boolean result, int mas []) {
		printArray(mas);
		String answer = result ? "isIncreasing" : "isDecreasing";
		System.out.println(answer);
	}
	public static void printArray(int[] mas) {
		System.out.println("--------------------------------------------");
		for (int i = 0; i < mas.length; i++) {
			System.out.print("mas[" + i + "]=" + mas[i] + "; ");
		}
		System.out.println();
		System.out.println("--------------------------------------------");
	}
}
