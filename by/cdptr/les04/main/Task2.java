package by.cdptr.les04.main;

import java.util.Random;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		int mas [] = new int [10]; 
		enterArrayWithRandom(mas);
		int k = 2;
		int sum = calculateSumOfModK(mas, k);
		printSum (sum);
		}
	
	

	public static void enterArrayWithRandom(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(10);
		}
	}
	
	private static int calculateSumOfModK(int mas[], int k){
		int result = 0;
		for(int el : mas){
			if(el % k == 0){
				result+=el;
			}
		}
		return result;
	}
	
	private static void printSum(int sum) {
		System.out.println("the sum: " + sum);
		
	}
	
}
