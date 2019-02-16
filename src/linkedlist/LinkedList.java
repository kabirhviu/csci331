package linkedlist;

public class LinkedList {
	
	private ListNode head;
	
	public LinkedList() {
		this.head = new ListNode(-1);
	}
	
	public void showList() {
		ListNode current = head.next;
		while(current !=null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}
	
	public void append(int data) {
		ListNode newNode = new ListNode(data);
		ListNode current = head.next;
		while(current!=null && current.next != null) {
			current = current.next;
		}
		
		if(current == null) {
			head.next = newNode;
		}
		else {
			current.next = newNode;
		}
	}
	
	public boolean delete (int data) {
		ListNode current = head.next;
		//Check whether the list is empty or not
		if(current == null) {
			return false;
		}
		//Check the special case, whether this is the first data element to delete
		else if(current!=null && current.data == data) {
			head.next = current.next;
			return true;
		}
		else {
			while(current.next != null && current.next.data != data) {
				current = current.next;
			}
			//Data does not exist in the list, if the next is null
			if(current.next == null) {
				return false;
			}
			else {
				current.next = current.next.next;
				return true;
			}
		}
		
	}

	/**
	 * @return the head
	 */
	public ListNode getHead() {
		return head;
	}

	/**
	 * @param head the head to set
	 */
	public void setHead(ListNode head) {
		this.head = head;
	}

}
