package design.pattern.strategy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RationalNumberProcessor {
	
	private  SortingStrategy strategy;
	
	
	public static String toString(List<RationalNumber> rationalNumbers) {
		StringBuilder builder = new StringBuilder();
		for(RationalNumber number: rationalNumbers) {
			builder.append(new String(number.getNumerator() +"/" +number.getDenominator()+ " "));
		}
		return builder.toString();
	}
	
	public static void reduce(List<RationalNumber> rationaNumbers) {
		for(RationalNumber rationalNumber: rationaNumbers) {
			rationalNumber.reduce();
		}
	}
	
	public static List<RationalNumber> reducedCopy(List<RationalNumber> rationalNumbers) {
		
		List<RationalNumber> reducedRationalNumbers = new ArrayList<RationalNumber>(rationalNumbers);
		for(RationalNumber rationalNumber: reducedRationalNumbers) {
			rationalNumber.reduce();
		}
		return reducedRationalNumbers;
	}
	
	public void sort(List<RationalNumber> rationalNumbers, Comparator<RationalNumber> comparator) {
		strategy.sort(rationalNumbers, comparator);
	}
	
	public List<RationalNumber> getSortedCopy(List<RationalNumber> rationalNumbers, Comparator<RationalNumber> comparator) {
		List<RationalNumber> copy = new ArrayList<RationalNumber>(rationalNumbers);
		strategy.sort(copy, comparator);
		return copy;
	}

	public SortingStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(SortingStrategy newStrategy) {
		strategy = newStrategy;
	}

}
