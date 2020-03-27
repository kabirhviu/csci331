package design.pattern.strategy.test;

import org.junit.Assert;
import org.junit.Test;

import design.pattern.strategy.RationalNumber;

public class RationalNumberTests {
	
	@Test
	public void testReduce() {
		RationalNumber rationalNumber = new RationalNumber(12, 16);
		rationalNumber.reduce();
		Assert.assertEquals(rationalNumber.getNumerator(), 3);
		Assert.assertEquals(rationalNumber.getDenominator(), 4);
	}
}
