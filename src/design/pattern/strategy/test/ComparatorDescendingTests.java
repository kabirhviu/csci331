package design.pattern.strategy.test;

import java.util.Comparator;

import org.junit.Assert;
import org.junit.Test;

import design.pattern.strategy.ComparatorDescending;
import design.pattern.strategy.RationalNumber;


public class ComparatorDescendingTests {
	
	
	@Test
	public void testCompare() {
		RationalNumber rationalNumber1 = new RationalNumber(3,4);
		RationalNumber rationalNumber2 = new RationalNumber(12,16);
		Comparator<RationalNumber> comparator = new ComparatorDescending();
		Assert.assertTrue(comparator.compare(rationalNumber1, rationalNumber2)==0);
		rationalNumber1 = new RationalNumber(1,3);
		rationalNumber2 = new RationalNumber(1,2);
		Assert.assertTrue(comparator.compare(rationalNumber1, rationalNumber2)>0);
		Assert.assertTrue(comparator.compare(rationalNumber2, rationalNumber1)<0);
	}

}
