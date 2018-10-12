package by.cdptr.les05.main;

public class Fraction {
	
	private int m;
	private int n;
	
	public Fraction(int m, int n) {
		this.m = m;
		this.n = n;
	}

	public double getFractionValue(){
		double result = (double)this.m/(double)this.n;
		return result;
	}

	public int getM() {
		return m;
	}

	public int getN() {
		return n;
	}

	
}
