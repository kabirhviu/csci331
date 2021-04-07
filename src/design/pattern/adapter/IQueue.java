package design.pattern.adapter;

public interface Queue {
	
	public void enqueue(int data);
	
	public int dequeue();
	
	public int peek();

}
