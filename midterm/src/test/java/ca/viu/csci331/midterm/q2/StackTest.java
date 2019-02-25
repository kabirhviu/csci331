package ca.viu.csci331.midterm.q2;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {
	
	@Test
	public void testPush() {
		int[] dataArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		Stack stack = new Stack();
		for(int i= dataArray.length -1; i>=0; i--) {
			stack.push(dataArray[i]);
		}
		
		int[] actualDataArray = stack.asArray();
		
		Assert.assertArrayEquals(dataArray, actualDataArray);
	}
	
	
	@Test
	public void testPop() {
		int[] dataArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		Stack stack = new Stack();
		for(int i= dataArray.length -1; i>=0; i--) {
			stack.push(dataArray[i]);
			Assert.assertEquals(dataArray[i], stack.pop());
		}
	}

}
