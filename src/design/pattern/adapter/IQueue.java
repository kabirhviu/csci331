package design.pattern.adapter;

public interface IQueue {
	
	public void enqueue(int data);
	
	public int dequeue();
	
	public int peek();

}
