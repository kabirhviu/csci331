package design.pattern.adapter.test;

import org.junit.Assert;
import org.junit.Test;

import design.pattern.adapter.Stack;

public class StackTest {
	
	@Test
	public void test() {
		Stack stack = new Stack();
		
		int datas[] = {10, 20, 30, 40, 50};
		for (int i=0; i<5; i++) {
			stack.push(datas[i]);
			Assert.assertEquals(datas[i], stack.peek());
		}
		
		for(int i=0; i<5; i++) {
			Assert.assertEquals(datas[5-i-1], stack.pop());
		}
	}

}
