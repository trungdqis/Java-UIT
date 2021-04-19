package buoi1;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int nume, int deno) {
		numerator = nume;
		denominator = deno;
		reduce();
	}
	
	public int calculateGCD(int nume, int deno) {
		if (nume % deno == 0) {
			return deno;
		} 
		return calculateGCD(deno, nume % deno);
	}
	
	private void reduce() {
		int gcd = calculateGCD(numerator, denominator);
		numerator /= gcd;
		denominator /= gcd;
	}
	
	public Fraction add(Fraction secondFraction) {
		int nume = numerator * secondFraction.getDenominator() + denominator * secondFraction.getNumerator();
		int deno = denominator * secondFraction.getDenominator();
		return new Fraction(nume, deno);
	}
	
	public Fraction subtract(Fraction secondFraction) {
		int nume = numerator * secondFraction.getDenominator() - denominator * secondFraction.getNumerator();
		int deno = denominator * secondFraction.getDenominator();
		return new Fraction(nume, deno);
	}
	
	public Fraction multiply(Fraction secondFraction) {
		int nume = numerator * secondFraction.getNumerator();
		int deno = denominator * secondFraction.getDenominator();
		return new Fraction(nume, deno);
	}
	
	public Fraction devide(Fraction secondFraction) {
		int nume = numerator * secondFraction.getDenominator();
		int deno = denominator * secondFraction.getNumerator();
		return new Fraction(nume, deno);
	}
	
	@Override
	public String toString () {
		if (this.denominator < 0) {
			this.numerator *= -1;
			this.denominator *= -1;
			return this.numerator + "/" + this.denominator;
		} else if (this.denominator == 1) {
			return this.numerator + "";
		} else if (this.numerator % this.denominator == 0) {
			return "1";
		} else {
			return this.numerator + "/" + this.denominator;
		}
	}
	
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
}
