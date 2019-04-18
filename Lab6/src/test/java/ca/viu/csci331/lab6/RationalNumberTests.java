package ca.viu.csci331.lab6;

import org.junit.Assert;
import org.junit.Test;

public class RationalNumberTests {
	
	@Test
	public void testReduce() {
		RationalNumber rationalNumber = new RationalNumber(12, 16);
		rationalNumber.reduce();
		Assert.assertEquals(rationalNumber.getNumerator(), 3);
		Assert.assertEquals(rationalNumber.getDenominator(), 4);
	}
}
