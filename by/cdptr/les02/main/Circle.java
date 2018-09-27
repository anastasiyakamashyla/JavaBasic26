package by.cdptr.les02.main;
 import java.util.Scanner;
 public class Circle {
public static void main (String [] arg) {
    double r = 0;
    double circumference; //длина окружности
    double area; //площадь круга
	Scanner sc = new Scanner (System.in);
    System.out.println("Введите r: ");
    if (sc.hasNextDouble()) {
		r = sc.nextDouble();
	}
    double r2 = Math.pow(r, 2);
    circumference = 2 * Math.PI*r;
    area = Math.PI*r2;
    System.out.println("длина:" + circumference + "; площадь:"+ area);
}
 
}