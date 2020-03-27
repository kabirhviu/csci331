package design.pattern.adapter.test;

import org.junit.Assert;
import org.junit.Test;

import design.pattern.adapter.Queue;

public class QueueTest {
	
	@Test
	public void test() {
		Queue queue = new Queue();
		int datas[] = {10, 20, 30, 40, 50};
		for (int i=0; i<5; i++) {
			queue.enqueue(datas[i]);
		}
		
		for(int i=0; i<5; i++) {
			Assert.assertEquals(datas[i], queue.peek());
			Assert.assertEquals(datas[i], queue.dequeue());
		}
	}

}
