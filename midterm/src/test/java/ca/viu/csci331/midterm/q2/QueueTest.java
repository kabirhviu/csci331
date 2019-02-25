package ca.viu.csci331.midterm.q2;

import org.junit.Assert;
import org.junit.Test;

public class QueueTest {
	
	@Test
	public void testEnqueue() {
		int[] dataArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		Queue queue = new Queue();
		for(int data : dataArray) {
			queue.enqueue(data);
		}
		
		int[] actualDataArray = queue.asArray();
		
		Assert.assertArrayEquals(dataArray, actualDataArray);
	}
	
	
	@Test
	public void testDequeue() {
		int[] dataArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		Queue queue = new Queue();
		for(int data: dataArray) {
			queue.enqueue(data);
		}
		
		for(int i=0; i<dataArray.length; i++) {
			Assert.assertEquals(dataArray[i], queue.dequeue());
		}
	}

}
