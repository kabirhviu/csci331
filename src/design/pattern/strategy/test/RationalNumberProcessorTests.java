package design.pattern.strategy.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import design.pattern.strategy.ComparatorFactory;
import design.pattern.strategy.ComparatorFactory.ComparatorType;
import design.pattern.strategy.RationalNumber;
import design.pattern.strategy.RationalNumberProcessor;
import design.pattern.strategy.SortingStrategy;
import design.pattern.strategy.SortingStrategyFactory;
import design.pattern.strategy.SortingStrategyFactory.SortingStrategyType;

public class RationalNumberProcessorTests {
	
	private List<RationalNumber> getTestInput() {
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
	
	private List<RationalNumber> getTestReducedOutput() {
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
	
	private List<RationalNumber> getTestSortedOutput() {
		List<RationalNumber> list = new ArrayList<RationalNumber>();
		list.add(new RationalNumber(1,8));
		list.add(new RationalNumber(1,4));
		list.add(new RationalNumber(1,3));
		list.add(new RationalNumber(3,8));
		list.add(new RationalNumber(1,2));
		list.add(new RationalNumber(5,8));
		list.add(new RationalNumber(2,3));
		list.add(new RationalNumber(3,4));
		list.add(new RationalNumber(5,6));
		return list;
	}
	
	@Test
	public void testReduce() {
		List<RationalNumber> testInput = getTestInput();
		List<RationalNumber> testOutput = getTestReducedOutput();
		RationalNumberProcessor.reduce(testInput);
		for(int i=0; i<testInput.size(); i++) {
			Assert.assertEquals(testInput.get(i).getNumerator(), testOutput.get(i).getNumerator());
			Assert.assertEquals(testInput.get(i).getDenominator(), testOutput.get(i).getDenominator());
		}
	}
	
	
	@Test
	public void testReducedCopy() {
		List<RationalNumber> testInput = getTestInput();
		List<RationalNumber> originalInput = new ArrayList<RationalNumber>(testInput);
		List<RationalNumber> testOutput = getTestReducedOutput();
		List<RationalNumber> reducedOutput = RationalNumberProcessor.reducedCopy(testInput);
		for(int i=0; i<testInput.size(); i++) {
			Assert.assertEquals(originalInput.get(i).getNumerator(), testInput.get(i).getNumerator());
			Assert.assertEquals(originalInput.get(i).getDenominator(), testInput.get(i).getDenominator());
		}
		
		for(int i=0; i<testOutput.size(); i++) {
			Assert.assertEquals(reducedOutput.get(i).getNumerator(), testOutput.get(i).getNumerator());
			Assert.assertEquals(reducedOutput.get(i).getDenominator(), testOutput.get(i).getDenominator());
		}
	}
	
	@Test
	public void testSort() {
		
		SortingStrategy sortingStrategy = SortingStrategyFactory.createSortingStrategy(SortingStrategyType.BUBBLE);
		Comparator<RationalNumber> comparator = ComparatorFactory.createComparator(ComparatorType.ASCENDING);
		RationalNumberProcessor rationalNumberProcessor = new RationalNumberProcessor();
		rationalNumberProcessor.setStrategy(sortingStrategy);
		List<RationalNumber> testInput = getTestReducedOutput();
		List<RationalNumber> testOutput = getTestSortedOutput();
		rationalNumberProcessor.sort(testInput, comparator);
		
		for(int i=0; i<testInput.size(); i++) {
			Assert.assertEquals(testInput.get(i).getNumerator(), testOutput.get(i).getNumerator());
			Assert.assertEquals(testInput.get(i).getDenominator(), testOutput.get(i).getDenominator());
		}
		
		comparator = ComparatorFactory.createComparator(ComparatorType.DESCENDING);
		testInput = getTestReducedOutput();
		rationalNumberProcessor.sort(testInput, comparator);
		
		for(int i=0, j =testOutput.size()-1; i<testInput.size(); i++, j--) {
			Assert.assertEquals(testInput.get(i).getNumerator(), testOutput.get(j).getNumerator());
			Assert.assertEquals(testInput.get(i).getDenominator(), testOutput.get(j).getDenominator());
		}
		
		sortingStrategy = SortingStrategyFactory.createSortingStrategy(SortingStrategyType.QUICK);
		comparator = ComparatorFactory.createComparator(ComparatorType.ASCENDING);
		rationalNumberProcessor.setStrategy(sortingStrategy);
		testInput = getTestReducedOutput();
		
		rationalNumberProcessor.sort(testInput, comparator);
		
		for(int i=0; i<testInput.size(); i++) {
			Assert.assertEquals(testInput.get(i).getNumerator(), testOutput.get(i).getNumerator());
			Assert.assertEquals(testInput.get(i).getDenominator(), testOutput.get(i).getDenominator());
		}
		
		comparator = ComparatorFactory.createComparator(ComparatorType.DESCENDING);
		testInput = getTestReducedOutput();
		rationalNumberProcessor.sort(testInput, comparator);
		
		for(int i=0, j =testOutput.size()-1; i<testInput.size(); i++, j--) {
			Assert.assertEquals(testInput.get(i).getNumerator(), testOutput.get(j).getNumerator());
			Assert.assertEquals(testInput.get(i).getDenominator(), testOutput.get(j).getDenominator());
		}
		
	}
	
	@Test
	public void testSortedCopy() {
		SortingStrategy sortingStrategy = SortingStrategyFactory.createSortingStrategy(SortingStrategyType.BUBBLE);
		Comparator<RationalNumber> comparator = ComparatorFactory.createComparator(ComparatorType.ASCENDING);
		RationalNumberProcessor rationalNumberProcessor = new RationalNumberProcessor();
		rationalNumberProcessor.setStrategy(sortingStrategy);
		List<RationalNumber> testInput = getTestReducedOutput();
		List<RationalNumber> testOutput = getTestSortedOutput();
		List<RationalNumber> sortedCopy = rationalNumberProcessor.getSortedCopy(testInput, comparator);
		
		for(int i=0; i<sortedCopy.size(); i++) {
			Assert.assertEquals(sortedCopy.get(i).getNumerator(), testOutput.get(i).getNumerator());
			Assert.assertEquals(sortedCopy.get(i).getDenominator(), testOutput.get(i).getDenominator());
		}
		
		comparator = ComparatorFactory.createComparator(ComparatorType.DESCENDING);
		testInput = getTestReducedOutput();
		sortedCopy = rationalNumberProcessor.getSortedCopy(testInput, comparator);
		
		for(int i=0, j =testOutput.size()-1; i<sortedCopy.size(); i++, j--) {
			Assert.assertEquals(sortedCopy.get(i).getNumerator(), testOutput.get(j).getNumerator());
			Assert.assertEquals(sortedCopy.get(i).getDenominator(), testOutput.get(j).getDenominator());
		}
		
		sortingStrategy = SortingStrategyFactory.createSortingStrategy(SortingStrategyType.QUICK);
		comparator = ComparatorFactory.createComparator(ComparatorType.ASCENDING);
		rationalNumberProcessor.setStrategy(sortingStrategy);
		testInput = getTestReducedOutput();
		
		sortedCopy = rationalNumberProcessor.getSortedCopy(testInput, comparator);
		
		for(int i=0; i<sortedCopy.size(); i++) {
			Assert.assertEquals(sortedCopy.get(i).getNumerator(), testOutput.get(i).getNumerator());
			Assert.assertEquals(sortedCopy.get(i).getDenominator(), testOutput.get(i).getDenominator());
		}
		
		comparator = ComparatorFactory.createComparator(ComparatorType.DESCENDING);
		testInput = getTestReducedOutput();
		sortedCopy = rationalNumberProcessor.getSortedCopy(testInput, comparator);
		
		for(int i=0, j =testOutput.size()-1; i<sortedCopy.size(); i++, j--) {
			Assert.assertEquals(sortedCopy.get(i).getNumerator(), testOutput.get(j).getNumerator());
			Assert.assertEquals(sortedCopy.get(i).getDenominator(), testOutput.get(j).getDenominator());
		}
	}

}
