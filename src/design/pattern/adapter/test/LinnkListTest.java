package designpattern.adapter.test;

import org.junit.Assert;
import org.junit.Test;

import designpattern.adapter.LinkedList;
import designpattern.adapter.LinkedList.ListNode;

public class LinnkListTest {
	
	@Test
	public void testConstructor () {
		
		LinkedList list = new LinkedList();
		Assert.assertNotNull(list);
		
		
		Assert.assertEquals(-1, list.peekAtFront());
		Assert.assertEquals(-1, list.peekAtEnd());
		
		Assert.assertEquals(-1,  list.removeFromFront());
		Assert.assertEquals(-1, list.removeFromEnd());
		
		Assert.assertNull(list.find(100));
		
		
	}
	
	@Test
	public void testInsertRemoveFront() {
		LinkedList list = new LinkedList();
		int datas[] = {10, 20, 30, 40, 50};
		for(int i=0; i<5; i++) {
			list.insertAtFront(datas[i]);
			Assert.assertEquals(datas[i], list.peekAtFront());
		}
		for( int i=0; i<5; i++) {
			Assert.assertEquals(datas[5-i-1], list.removeFromFront());
		}
	}
	
	@Test
	public void testInsertRemoveEnd() {
		LinkedList list = new LinkedList();
		int datas[] = {10, 20, 30, 40, 50};
		for(int i=0; i<5; i++) {
			list.insertAtEnd(datas[i]);
			Assert.assertEquals(datas[i], list.peekAtEnd());
		}
		for( int i=0; i<5; i++) {
			Assert.assertEquals(datas[5-i-1], list.removeFromEnd());
		}
	}
	
	@Test
	public void testInsertFrontRemoveEnd() {
		LinkedList list = new LinkedList();
		int datas[] = {10, 20, 30, 40, 50};
		for(int i=0; i<5; i++) {
			list.insertAtFront(datas[i]);
			Assert.assertEquals(datas[i], list.peekAtFront());
		}
		for( int i=0; i<5; i++) {
			Assert.assertEquals(datas[i], list.removeFromEnd());
		}
	}
	
	@Test
	public void testInsertEndRemoveFront() {
		LinkedList list = new LinkedList();
		int datas[] = {10, 20, 30, 40, 50};
		for(int i=0; i<5; i++) {
			list.insertAtEnd(datas[i]);
			Assert.assertEquals(datas[i], list.peekAtEnd());
		}
		for( int i=0; i<5; i++) {
			Assert.assertEquals(datas[i], list.removeFromFront());
		}
	}
	
	@Test
	public void testFind() {
		LinkedList list = new LinkedList();
		int datas[] = {10, 20, 30, 40, 50};
		for(int i=0; i<5; i++) {
			list.insertAtEnd(datas[i]);
			Assert.assertEquals(datas[i], list.peekAtEnd());
		}
		Assert.assertNull(list.find(100));
		
		for( int i=0; i<5; i++) {
			ListNode node = list.find(datas[i]);
			Assert.assertNotNull(node);
			Assert.assertEquals(datas[i], node.getData());
			list.remove(node);
			node = null;
			node = list.find(datas[i]);
			Assert.assertNull(node);
		}
	}

}
