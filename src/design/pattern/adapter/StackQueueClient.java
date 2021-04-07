package design.pattern.adapter;

import design.pattern.adapter.IStack;
import design.pattern.adapter.Stack;
import design.pattern.adapter.IQueue;
import design.pattern.adapter.Queue;

public class StackQueueClient {
	
	public static void main(String[] args) {
		
		IStack stack = new Stack();
		
		int datas[] = {10, 20, 30, 40, 50};
		for (int i=0; i<5; i++) {
			stack.push(datas[i]);
			System.out.println("Pushed " + datas[i] + " into the stack.");
		}
		
		for (int i=0; i<5; i++) {
			System.out.println("Popped " + stack.pop() + " from the stack, next element to pop " + stack.peek());
		}
		
		
		IQueue queue = new Queue();
		
		
		for (int i=0; i<5; i++) {
			queue.enqueue(datas[i]);
			System.out.println("Enqueued " + datas[i] + " into the queue.");
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("Dequeued " + queue.dequeue() + " from the queue, next element to dequeue " + queue.peek());
		}
		
	}
}