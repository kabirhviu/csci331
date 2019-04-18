package ca.viu.csci331.lab6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ca.viu.csci331.lab6.ComparatorFactory.ComparatorType;
import ca.viu.csci331.lab6.SortingStrategyFactory.SortingStrategyType;

public class Main {
	
	private static List<RationalNumber> getInput() {
		List<RationalNumber> list = new ArrayList<RationalNumber>();
		list.add(new RationalNumber(8,24));
		list.add(new RationalNumber(12,24));
		list.add(new RationalNumber(16,24));
		list.add(new RationalNumber(3,24));
		list.add(new RationalNumber(20,24));
		list.add(new RationalNumber(9,24));
		list.add(new RationalNumber(15,24));
		list.add(new RationalNumber(18,24));
		list.add(new RationalNumber(6,24));
		return list;
	}
	
	
	private static List<RationalNumber> getCanonicalInput() {
		List<RationalNumber> list = new ArrayList<RationalNumber>();
		list.add(new RationalNumber(1,3));
		list.add(new RationalNumber(1,2));
		list.add(new RationalNumber(2,3));
		list.add(new RationalNumber(1,8));
		list.add(new RationalNumber(5,6));
		list.add(new RationalNumber(3,8));
		list.add(new RationalNumber(5,8));
		list.add(new RationalNumber(3,4));
		list.add(new RationalNumber(1,4));
		return list;
	}

	public static void main(String[] args) {
		
		List<RationalNumber> input = getInput();
		System.out.println("Input rational numbers:");
		System.out.println(RationalNumberProcessor.toString(input));
		RationalNumberProcessor.reduce(input);
		System.out.println("Reduced rational numbers:");
		System.out.println(RationalNumberProcessor.toString(input));
		
		//Uses factory method design pattern to create desired sorting strategy.
		SortingStrategy sortingStrategy = SortingStrategyFactory.createSortingStrategy(SortingStrategyType.QUICK);
		//Uses factory method design pattern to create desired comparator.
		Comparator<RationalNumber> comparator = ComparatorFactory.createComparator(ComparatorType.ASCENDING);
		RationalNumberProcessor rationalNumberProcessor = new RationalNumberProcessor();
		//Uses strategy design pattern to set desired sorting strategy (algorithm).
		rationalNumberProcessor.setStrategy(sortingStrategy);
		
		input = getCanonicalInput();
		System.out.println("Canonical input rational numbers:");
		System.out.println(RationalNumberProcessor.toString(input));
		
		//Uses template method pattern to pass desired comparator.
		rationalNumberProcessor.sort(input, comparator);
		System.out.println("Sorted (ascending) rational numbers:");
		System.out.println(RationalNumberProcessor.toString(input));
		
		//Uses factory method design pattern to create desired comparator.
		comparator = ComparatorFactory.createComparator(ComparatorType.DESCENDING);
		
		input = getCanonicalInput();
		System.out.println("Canonical input rational numbers:");
		System.out.println(RationalNumberProcessor.toString(input));
		//Uses template method pattern to pass desired comparator.
		rationalNumberProcessor.sort(input, comparator);
		System.out.println("Sorted (descending) rational numbers:");
		System.out.println(RationalNumberProcessor.toString(input));
		
		
	}
}
