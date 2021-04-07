package design.pattern.adapter;

public class Queue implements IQueue{
	
	private LinkedList list;
	
	public Queue() {
		list = new LinkedList();
	}
	
	@Override
	public void enqueue(int data) {
		list.insertAtEnd(data);
	}
	
	@Override
	public int dequeue() {
		return list.removeFromFront();
	}
	
	@Override
	public int peek() {
		return list.peekAtFront();
	}

}
