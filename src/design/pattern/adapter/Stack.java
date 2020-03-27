package designpattern.adapter;

public class Stack {
	
	private LinkedList list;
	
	public Stack() {
		list = new LinkedList();
	}
	
	public void push(int data) {
		list.insertAtFront(data);
	}
	
	public int pop() {
		return list.removeFromFront();
	}
	
	public int peek() {
		return list.peekAtFront();
	}

}
