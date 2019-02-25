package ca.viu.csci331.midterm.q2;

public class LinkedList {
	protected ListNode head;
	protected int size;
	
	public LinkedList() {
		head = new ListNode(-1);
		size =0;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int[] asArray() {
		int[] dataArray = new int[size];
		ListNode current = head.next;
		for (int i=0; i<size; i++) {
			if(current != null) {
				dataArray[i] = current.data;
			}
			current = current.next;
		}
		return dataArray;		
	}
	
	
	@Override
	public String toString() {
		ListNode current = head.next;
		StringBuilder stringBuilder = new StringBuilder();
		while(current != null) {
			stringBuilder.append(current.data + "\t");
			current = current.next;
		}
		return stringBuilder.toString();
	}
	
	public void insertAtFront(ListNode node) {
		node.next = head.next;
		head.next = node;
		size++;
	}
	
	public void insertAtEnd(ListNode node) {
		ListNode lastNode = getLastNode();
		lastNode.next = node;
		size++;
		
	}
	
	public ListNode removeFromFront() {
		if(head.next != null) {
			ListNode removedNode = head.next;
			head.next = head.next.next;
			size--;
			return removedNode;
		}
		else {
			return null;
		}
	}
	
	public ListNode removeFromEnd() {
		ListNode lastPrevNode = getLastPreviousNode();
		if(lastPrevNode.next != null) {
			ListNode removedNode = lastPrevNode.next;
			lastPrevNode.next = null;
			size--;
			return removedNode;
		}
		else {
			return null;
		}
	}
	
	private ListNode getLastNode() {
		ListNode lastNode = head;
		while(lastNode.next !=null) {
			lastNode = lastNode.next;
		}
		return lastNode;
	}
	
	private ListNode getLastPreviousNode() {
		ListNode lastPrevNode = head;
		while(lastPrevNode.next !=null && lastPrevNode.next.next != null ) {
			lastPrevNode = lastPrevNode.next;
		}
		return lastPrevNode;
	}
	
	

}
