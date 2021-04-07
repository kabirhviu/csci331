package design.pattern.strategy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RationalNumberProcessor {
	
	private  ISortingStrategy sortingStrategy;
	private Comparator<RationalNumber> comparatorStrategy;
	
	
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
	
	public void sort(List<RationalNumber> rationalNumbers) {
		sortingStrategy.sort(rationalNumbers, comparatorStrategy);
	}
	
	public List<RationalNumber> getSortedCopy(List<RationalNumber> rationalNumbers) {
		List<RationalNumber> copy = new ArrayList<RationalNumber>(rationalNumbers);
		sortingStrategy.sort(copy, comparatorStrategy);
		return copy;
	}

	public ISortingStrategy getSortingStrategy() {
		return sortingStrategy;
	}

	public void setSortingStrategy(ISortingStrategy newStrategy) {
		sortingStrategy = newStrategy;
	}

	public Comparator<RationalNumber> getComparatorStrategy() {
		return comparatorStrategy;
	}

	public void setComparatorStrategy(Comparator<RationalNumber> comparator) {
		this.comparatorStrategy = comparator;
	}

}
