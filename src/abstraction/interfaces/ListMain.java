package abstraction.interfaces;

public class ListMain {
	
	public static void main(String[] args) {
		Integer[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		ListInterface list = null;
//		list = new ArrayList(10);
		list = new LinkedList();
		for(Integer number: numbers) {
			list.add(number);
		}
		
		if(list instanceof ArrayList) {
			System.out.println("\nList capacity: " + ((ArrayList)list).getCapacity());
		}
		
		System.out.println("\nList size: " + list.size());
		
		Integer[] arrayFromList = list.toArray();
		System.out.print("\nArray from List: \n[");
		for(Integer number: arrayFromList) {
			System.out.print(number+ ", ");
		}
		System.out.print("\n");
		
		for(Integer number: numbers) {
			if(list.contains(number)){
				System.out.println("List contains: " + number);
			}
		}
		int ten = 10;
		list.remove(ten);
		arrayFromList = list.toArray();
		System.out.println("\nList size after removing "+ ten + ": " + list.size());
		System.out.print("\nArray from List after removing: "+ ten + " \n[");
		for(Integer number: arrayFromList) {
			System.out.print(number+ ", ");
		}
		System.out.print("]\n");
		
		
		int hundred = 100;
		list.remove(hundred);
		arrayFromList = list.toArray();
		System.out.println("\nList size after removing "+ hundred + ": " + list.size());
		System.out.print("\nArray from List after removing: "+ hundred + " \n[");
		for(Integer number: arrayFromList) {
			System.out.print(number+ ", ");
		}
		System.out.print("]\n");
		
		int fifty = 50;
		list.remove(fifty);
		arrayFromList = list.toArray();
		System.out.println("\nList size after removing "+ fifty + ": " + list.size());
		System.out.print("\nArray from List after removing: "+ fifty + " \n[");
		for(Integer number: arrayFromList) {
			System.out.print(number+ ", ");
		}
		System.out.print("]\n");
		
		list.clear();
		arrayFromList = list.toArray();
		System.out.println("\nList size after clearing: " + list.size());
		System.out.print("\nArray from List after clearing \n[");
		for(Integer number: arrayFromList) {
			System.out.print(number+ ", ");
		}
		System.out.print("]\n");
		
		
	}
	
}
