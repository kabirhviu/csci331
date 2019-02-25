package ca.viu.csci331.midterm.q2;

public class Stack extends LinkedList {
	
	public Stack() {
		super();
	}
	
	public void push(int data) {
		ListNode node = new ListNode(data);
		insertAtFront(node);
	}
	
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		else {
			return removeFromFront().data;
		}
	}

}
