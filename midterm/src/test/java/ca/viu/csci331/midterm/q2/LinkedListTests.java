package ca.viu.csci331.midterm.q2;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTests {
	
	@Test
	public void testGetSize() {
		LinkedList linkedList = new LinkedList();
		Assert.assertEquals(0, linkedList.getSize());
		linkedList.insertAtEnd(new ListNode(10));
		Assert.assertEquals(1, linkedList.getSize());
		linkedList.insertAtEnd(new ListNode(20));
		Assert.assertEquals(2, linkedList.getSize());
		linkedList.removeFromEnd();
		Assert.assertEquals(1, linkedList.getSize());
		linkedList.removeFromEnd();
		Assert.assertEquals(0, linkedList.getSize());
		
	}
	
	@Test
	public void testIsEmpty() {
		LinkedList linkedList = new LinkedList();
		Assert.assertEquals(true, linkedList.isEmpty());
		linkedList.insertAtEnd(new ListNode(10));
		Assert.assertEquals(false, linkedList.isEmpty());
		linkedList.insertAtEnd(new ListNode(20));
		Assert.assertEquals(false, linkedList.isEmpty());
		linkedList.removeFromEnd();
		Assert.assertEquals(false, linkedList.isEmpty());
		linkedList.removeFromEnd();
		Assert.assertEquals(true, linkedList.isEmpty());
		
	}
	
	
	@Test
	public void testAsArray() {
		int[] dataArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		LinkedList linkedList = new LinkedList();
		for(int data: dataArray) {
			ListNode node = new ListNode(data);
			linkedList.insertAtEnd(node);
		}
		
		int[] actualDataArray = linkedList.asArray();
		
		Assert.assertArrayEquals(dataArray, actualDataArray);
	}
	
	
	
	@Test
	public void testInsertAtFront() {
		int[] dataArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		LinkedList linkedList = new LinkedList();
		for(int i= dataArray.length -1; i>=0; i--) {
			ListNode node = new ListNode(dataArray[i]);
			linkedList.insertAtFront(node);
		}
		
		int[] actualDataArray = linkedList.asArray();
		
		Assert.assertArrayEquals(dataArray, actualDataArray);
	}

	@Test
	public void testInsertAtEnd() {
		int[] dataArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		LinkedList linkedList = new LinkedList();
		for(int data: dataArray) {
			ListNode node = new ListNode(data);
			linkedList.insertAtEnd(node);
		}
		
		int[] actualDataArray = linkedList.asArray();
		
		Assert.assertArrayEquals(dataArray, actualDataArray);
	}
	
	@Test
	public void testRemoveFromFront() {
		int[] dataArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		LinkedList linkedList = new LinkedList();
		for(int data: dataArray) {
			ListNode node = new ListNode(data);
			linkedList.insertAtEnd(node);
		}
		
		linkedList.removeFromFront();
		
		int[] expectedDataArray = {20, 30, 40, 50, 60, 70, 80, 90, 100};
		
		int[] actualDataArray = linkedList.asArray();
		
		Assert.assertArrayEquals(expectedDataArray, actualDataArray);
	}
	
	@Test
	public void testRemoveFromEnd() {
		int[] dataArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		LinkedList linkedList = new LinkedList();
		for(int data: dataArray) {
			ListNode node = new ListNode(data);
			linkedList.insertAtEnd(node);
		}
		
		linkedList.removeFromEnd();
		
		int[] expectedDataArray = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		
		int[] actualDataArray = linkedList.asArray();
		
		Assert.assertArrayEquals(expectedDataArray, actualDataArray);
	}
	
	
}
