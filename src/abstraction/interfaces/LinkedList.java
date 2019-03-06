package abstraction.interfaces;

//public class LinkedList implements ListInterface{
public class LinkedList extends AbstractList {
	
	private static class ListNode {
		Integer data;
		ListNode next;
		
		public ListNode(Integer data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private ListNode head;
	private int size;
	
	public LinkedList() {
		this.head = new ListNode(0);
		size = 0;
	}
	

	@Override
	public void add(Integer element) {
		ListNode newNode = new ListNode(element);
		ListNode current = head.next;
		if(current == null) {
			head.next = newNode;
			
		}
		else  {
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
		size++;
	}

	@Override
	public void clear() {
		ListNode current = head.next;
		while(current != null) {
			ListNode temp = current;
			current = current.next;
			temp.data = null;
			temp.next = null;
		}
		head.next = null;
		size = 0;
	}

	@Override
	public boolean contains(Integer element) {
		ListNode current = head.next;
		while(current != null) {
			if(current.data == element) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	@Override
	public boolean remove(Integer element) {
		ListNode current = head.next;
		if(current == null) {
			return false;
		}
		else if(current.data == element) {
			head.next = head.next.next;
			size--;
			return true;
		}
		else {
			while(current.next !=null && current.next.data != element) {
				current = current.next;
			}
			if(current.next == null) {
				return false;
			}
			else {
				ListNode temp = current.next;
				current.next = temp.next;
				temp.data = null;
				temp.next = null;
				size--;
				return true;
			}	
		}
	}

//	@Override
//	public int size() {
//		return size;
//	}

	@Override
	public Integer[] toArray() {
		Integer[] copy = new Integer[size];
		ListNode current = head.next;
		int index = 0;
		while(current!=null) {
			copy[index++] = current.data;
			current = current.next;
		}
		return copy;
	}

}
