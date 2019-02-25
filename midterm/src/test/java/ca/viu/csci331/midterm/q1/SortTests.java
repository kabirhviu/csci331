package ca.viu.csci331.midterm.q1;

import org.junit.Assert;
import org.junit.Test;

public class SortTests {
	
	@Test
	public void testQuick() {
		
		int arrayInt[] = {200, 150, 180, 100, 120, 300, 250, 160, 190, 130}; 
		
		int[] actualSubArrayInt = Sort.quick(arrayInt, 2, 7);
		int[] expectedSubArrayInt1 = {100, 120, 180, 250, 300};
		Assert.assertArrayEquals(expectedSubArrayInt1, actualSubArrayInt);
		
		actualSubArrayInt = Sort.quick(arrayInt, 1, 8);
		int[] expectedSubArrayInt2 = {100, 120, 150, 160, 180, 250, 300};
		Assert.assertArrayEquals(expectedSubArrayInt2, actualSubArrayInt);
		
		actualSubArrayInt = Sort.quick(arrayInt);
		int[] expectedSubArrayInt3 = {100, 120, 130, 150, 160, 180, 190, 200, 250, 300};
		Assert.assertArrayEquals(expectedSubArrayInt3, actualSubArrayInt);
		
		double arrayDouble[] = {200.2, 150.15, 180.18, 100.1, 120.12, 300.3, 250.25, 160.16, 190.19, 130.13}; 
		
		double[] actualSubArrayDouble = Sort.quick(arrayDouble, 2, 7);
		double[] expectedSubArrayDouble1 = {100.1, 120.12, 180.18, 250.25, 300.3};	
		Assert.assertArrayEquals(expectedSubArrayDouble1, actualSubArrayDouble, 0.01);
		
		actualSubArrayDouble = Sort.quick(arrayDouble, 1, 8);
		double[] expectedSubArrayDouble2 = {100.1, 120.12, 150.15, 160.16, 180.18, 250.25, 300.3};	
		Assert.assertArrayEquals(expectedSubArrayDouble2, actualSubArrayDouble, 0.01);
		
		
		actualSubArrayDouble = Sort.quick(arrayDouble);
		double[] expectedSubArrayDouble3 = {100.1, 120.12, 130.13, 150.15, 160.16, 180.18, 190.19, 200.2, 250.25, 300.3};
		Assert.assertArrayEquals(expectedSubArrayDouble3, actualSubArrayDouble, 0.01);
		
	}
	
	
}
