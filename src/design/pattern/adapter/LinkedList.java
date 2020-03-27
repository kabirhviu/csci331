package design.pattern.adapter;

public class LinkedList {
	
	public class ListNode {
		private int data;
		private ListNode next;
		private ListNode previous;
		
		public ListNode(int data) {
			this.data = data;
			next = null;
			previous = null;
		}
		
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public ListNode getNext() {
			return next;
		}
		public void setNext(ListNode next) {
			this.next = next;
		}
		public ListNode getPrevious() {
			return previous;
		}
		public void setPrevious(ListNode previous) {
			this.previous = previous;
		}
	}
	
	private ListNode head;
	private ListNode tail;
	
	public LinkedList() {
		head = tail = null;
	}
	
	public void insertAtFront(int data) {
		ListNode node = new ListNode(data);
		if(head == null) {
			assert (head==tail);
			head = tail = node;
		}
		else {
			node.setNext(head);
			head.setPrevious(node);
			head = node;
		}
	}
	
	public void insertAtEnd(int data) {
		ListNode node = new ListNode(data);
		if(tail == null) {
			assert (head == tail);
			head = tail = node;
		}
		else {
			node.setPrevious(tail);
			tail.setNext(node);
			tail = node;
		}
		
	}
	
	public int removeFromFront() {
		
		if (head == null) {
			assert (head == tail);
			return -1;
		}
		else {
			int data = head.getData();
			ListNode next = head.getNext();
			if(next != null) {
				next.setPrevious(null);
			}
			head.setNext(null);
			head = next;
			return data;
		}
	}
	
	public int removeFromEnd() {
		if(tail == null) {
			assert (head == tail);
			return -1;
		}
		else {
			int data = tail.getData();
			ListNode prev = tail.getPrevious();
			if (prev != null) {
				prev.setNext(null);
			}
			tail.setPrevious(null);
			tail = prev;
			return data;
		}
		
	}
	
	public int peekAtFront() {
		if(head == null) {
			assert (head == tail);
			return -1;
		}
		else {
			return head.getData();
		}
		
	}
	
	public int peekAtEnd() {
		if (tail == null) {
			assert (head == tail);
			return -1;
		}
		else {
			return tail.getData();
		}
		
	}
	
	public void remove(ListNode node) {
		if (node != null) {
			
			ListNode prev = node.getPrevious();
			ListNode next = node.getNext();
			if(prev != null) {
				prev.setNext(next);
			}
			if(next != null) {
				next.setPrevious(prev);
			}
			
			if(node == head) {
				head = next;
			}
			
			if (node == tail) {
				tail = prev;
			}
			
			node.setNext(null);
			node.setPrevious(null);
			node = null;
			
		}
		
	}
	
	public ListNode find(int data) {
		if (head == null) {
			assert (head == tail);
			return null;
		}
		else {
			ListNode node = head;
			while ( node != null) {
				if(node.getData() == data) {
					return node;
				}
				node = node.getNext();
			}
		}
		
		return null;
	}
	

}
