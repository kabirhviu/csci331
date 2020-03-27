package designpattern.adapter;

public class Queue {
	
	private LinkedList list;
	
	public Queue() {
		list = new LinkedList();
	}
	
	public void enqueue(int data) {
		list.insertAtEnd(data);
	}
	
	public int dequeue() {
		return list.removeFromFront();
	}
	
	public int peek() {
		return list.peekAtFront();
	}

}
