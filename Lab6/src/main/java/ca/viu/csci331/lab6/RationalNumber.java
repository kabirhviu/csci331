package ca.viu.csci331.lab6;


/**
 * 
 * @author mhkabir
 * RationalNumber will need to be sorted.
 * What is the pitfall to override equals() method of RationalNumber?
 *
 */
public class RationalNumber {
	
	private int numerator;
	private int denominator;
	
	public RationalNumber(int numerator, int denominator) {
		this.setNumerator(numerator);
		this.setDenominator(denominator);
	}
	
	public RationalNumber(RationalNumber copyNumber) {
		this.numerator = copyNumber.getNumerator();
		this.denominator = copyNumber.getDenominator();
	}
	
	/**
	 * Reduce this rational number into its canonical form.
	 */
	public void reduce() {
		int gcd = getGcd(numerator, denominator);
		this.numerator =numerator/gcd;
		this.denominator =denominator/gcd;
	}
	
	@Override
	public String toString() {
		return new String(numerator + "/" +denominator);
	}
	
	
	private int getGcd(int first, int second) {
		if(first == 0) {
			return second;
		}
		else {
			return getGcd(second%first, first);
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
		if(denominator==0) {
			throw new IllegalArgumentException("Denominator cannot be zero.");
		}
		this.denominator = denominator;
	}

}
