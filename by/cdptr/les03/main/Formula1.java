package by.cdptr.les03.main;

import java.text.DecimalFormat;

public class Formula1 {
	public static void main(String[] args) {
		int a = 0;
		int b = 10;
		int h = 2;
		int x;
		double fx; // функция от x
		DecimalFormat df = new DecimalFormat("###.####");
		for (x = a; x <= b; x += h) {

			fx = 2 * Math.tanh(x / 2) + 1;
			System.out.println(" _____" + "  ______");
			System.out.println("|" + x + "    |" + "|" + df.format(fx) + "|");
			System.out.println(" _____" + "  ______");
            
		}

	}
}
