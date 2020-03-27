package design.pattern.strategy.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import design.pattern.strategy.ComparatorAscending;
import design.pattern.strategy.ComparatorDescending;
import design.pattern.strategy.QuickSort;
import design.pattern.strategy.RationalNumber;

public class QuickSortTests {
	
	private List<RationalNumber> getTestInput() {
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
	
	private List<RationalNumber> getTestOutput() {
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
	public void testSort() {
		List<RationalNumber> testInput = getTestInput();
		List<RationalNumber> testOutput = getTestOutput();
		
		QuickSort quickSort = new QuickSort();
		Comparator<RationalNumber> comparator = new ComparatorAscending();
		quickSort.sort(testInput, comparator);

		for(int i=0; i<testInput.size(); i++) {
			Assert.assertEquals(testInput.get(i).getNumerator(), testOutput.get(i).getNumerator());
			Assert.assertEquals(testInput.get(i).getDenominator(), testOutput.get(i).getDenominator());
		}
		
		testInput = getTestInput();
		comparator = new ComparatorDescending();
		quickSort.sort(testInput, comparator);
		
		for(int i=0, j =testOutput.size()-1; i<testInput.size(); i++, j--) {
			Assert.assertEquals(testInput.get(i).getNumerator(), testOutput.get(j).getNumerator());
			Assert.assertEquals(testInput.get(i).getDenominator(), testOutput.get(j).getDenominator());
		}
				
	}

}
