package ca.viu.csci331.midterm.q2;

public class Queue extends LinkedList {
	
	public Queue() {
		super();
	}
	
	public void enqueue(int data) {
		ListNode node = new ListNode(data);
		insertAtEnd(node);
	}
	
	public int dequeue() {
		if(isEmpty()) {
			return -1;
		}
		else {
			return removeFromFront().data;
		}
	}

}
