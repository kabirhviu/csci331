package design.pattern.strategy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import design.pattern.strategy.ComparatorFactory.ComparatorType;
import design.pattern.strategy.SortingStrategyFactory.SortingStrategyType;

public class RationalNumberProcessorClient {
	
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
		
		
		input = getCanonicalInput();
		System.out.println("Canonical input rational numbers:");
		System.out.println(RationalNumberProcessor.toString(input));
		
		
		RationalNumberProcessor rationalNumberProcessor = new RationalNumberProcessor();
		
		//Uses factory method design pattern to create desired sorting strategy.
		ISortingStrategy sortingStrategy = SortingStrategyFactory.createSortingStrategy(SortingStrategyType.BUBBLE);
		
		//Uses strategy design pattern to set desired sorting strategy (algorithm).
		rationalNumberProcessor.setSortingStrategy(sortingStrategy);
		
		//Uses factory method design pattern to create desired comparator.
		Comparator<RationalNumber> comparator = ComparatorFactory.createComparator(ComparatorType.ASCENDING);
		
		rationalNumberProcessor.setComparatorStrategy(comparator);
				
		//Uses template method pattern to pass desired comparator.
		rationalNumberProcessor.sort(input);
		System.out.println("BUBBLE Sorted (ascending) rational numbers:");
		System.out.println(RationalNumberProcessor.toString(input));
		
		
		input = getCanonicalInput();
		System.out.println("Canonical input rational numbers:");
		System.out.println(RationalNumberProcessor.toString(input));
		
		//Uses factory method design pattern to create desired comparator.
		comparator = ComparatorFactory.createComparator(ComparatorType.DESCENDING);
		rationalNumberProcessor.setComparatorStrategy(comparator);
		
		//Uses template method pattern to pass desired comparator.
		rationalNumberProcessor.sort(input);
		System.out.println("BUBBLE Sorted (descending) rational numbers:");
		System.out.println(RationalNumberProcessor.toString(input));
		
		input = getCanonicalInput();
		System.out.println("Canonical input rational numbers:");
		System.out.println(RationalNumberProcessor.toString(input));
		
		//Uses factory method design pattern to create desired sorting strategy.
		sortingStrategy = SortingStrategyFactory.createSortingStrategy(SortingStrategyType.QUICK);
		
		//Uses strategy design pattern to set desired sorting strategy (algorithm).
		rationalNumberProcessor.setSortingStrategy(sortingStrategy);
		
		//Uses factory method design pattern to create desired comparator.
		comparator = ComparatorFactory.createComparator(ComparatorType.ASCENDING);
		rationalNumberProcessor.setComparatorStrategy(comparator);
		//Uses template method pattern to pass desired comparator.
		rationalNumberProcessor.sort(input);
		System.out.println("QUICK Sorted (aescending) rational numbers:");
		System.out.println(RationalNumberProcessor.toString(input));
			
		input = getCanonicalInput();
		System.out.println("Canonical input rational numbers:");
		System.out.println(RationalNumberProcessor.toString(input));
		
		//Uses factory method design pattern to create desired comparator.
		comparator = ComparatorFactory.createComparator(ComparatorType.DESCENDING);
		rationalNumberProcessor.setComparatorStrategy(comparator);
		//Uses template method pattern to pass desired comparator.
		rationalNumberProcessor.sort(input);
		System.out.println("QUICK Sorted (descending) rational numbers:");
		System.out.println(RationalNumberProcessor.toString(input));
		
	}
}
