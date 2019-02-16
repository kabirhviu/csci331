package linkedlist;

public class Main {

	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		for(int i=10; i<100; i+=10) {
			linkedList.append(i);
		}
		System.out.println("Linked List Elements: ");
		linkedList.showList();
		
		linkedList.delete(10);
		System.out.println("\nLinked List Elements after deleting 10: ");
		linkedList.showList();
		
		linkedList.delete(10);
		System.out.println("\nLinked List Elements after deleting 10: ");
		linkedList.showList();
		
		linkedList.delete(50);
		System.out.println("\nLinked List Elements after deleting 50: ");
		linkedList.showList();
		
		linkedList.delete(50);
		System.out.println("\nLinked List Elements after deleting 50: ");
		linkedList.showList();
		
		linkedList.delete(90);
		System.out.println("\nLinked List Elements after deleting 90: ");
		linkedList.showList();
		
		linkedList.delete(90);
		System.out.println("\nLinked List Elements after deleting 90: ");
		linkedList.showList();

	}

}
