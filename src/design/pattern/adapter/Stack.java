package design.pattern.adapter;

public class Stack implements IStack {
	
	private LinkedList list;
	
	public Stack() {
		list = new LinkedList();
	}
	
	@Override
	public void push(int data) {
		list.insertAtFront(data);
	}
	
	@Override
	public int pop() {
		return list.removeFromFront();
	}
	
	@Override
	public int peek() {
		return list.peekAtFront();
	}

}
