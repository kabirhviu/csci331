/**
 * Class MyCollectionTest test MyCollection class that has implemented iterator() method.
 * 
 * @author mhkabir
 */
import java.util.Iterator;

public class MyCollectionTest {
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		MyCollection myCollection1 = new MyCollection(10);
		
		//Adding into collection
		System.out.println("Collection 1 size before add: " + myCollection1.getSize());
		for(int i = 0; i < 10; i++) {
			myCollection1.add(array[i]);
		}
		System.out.println("Collection 1 size after add: " + myCollection1.getSize());
		
		//Iterating through the collection through iterator
		Iterator<Integer> iter1 = myCollection1.iterator();
		System.out.println("Collection 1 elements: ");
		while(iter1.hasNext()) {
			System.out.print(" " + iter1.next());
		}
		System.out.println();
		
		//Removing from the collection
		for(int i = 0; i < 10; i++) {
			myCollection1.remove(array[i]);
			System.out.println("\nCollection 1 elements after removing " + array[i] + ": ");
			for(int j = 0; j<myCollection1.getSize(); j++ ) {
				System.out.print(" " + myCollection1.get(j));
			}
			System.out.println();
		}
		
		//Iterating through the empty collection through iterator
		Iterator<Integer> iter2 = myCollection1.iterator();
		System.out.println("Collection 1 elements: ");
		while(iter2.hasNext()) {
			System.out.print(" " + iter2.next());
		}
		System.out.println();
		
		//Testing iteration with modifying the collection, will catch exception
//		myCollection1.add(11);
//		System.out.println("Collection 1 elements: ");
//		while(iter2.hasNext()) {
//			System.out.print(" " + iter2.next());
//		}
//		System.out.println();

		
		
//		Testing next, while hasNext() return false, will catch exception
//		System.out.print("next " + iter2.next());
		
		
		
//		Testing iterator remove before calling iterator next, will catch exception
//		for(int i = 0; i < 10; i++) {
//			myCollection1.add(array[i]);
//		}
//		Iterator<Integer> iter3 = myCollection1.iterator();
//		iter3.remove(); 
		
//		Testing iterator remove, will catch exception since more than one iterators are active on the same collection
//		while(iter3.hasNext()) {
//			int element= iter3.next();
//			iter3.remove();
//			System.out.println("\nCollection 1 elements after removing " + element + ": ");
//			for(int j = 0; j<myCollection1.getSize(); j++ ) {
//				System.out.print(" " + myCollection1.get(j));
//			}
//			System.out.println();
//		}
		
		
		//Testing iterator remove
		MyCollection myCollection2 = new MyCollection(10);
		for(int i = 0; i < 10; i++) {
			myCollection2.add(array[i]);
		}
		Iterator<Integer> iter4 = myCollection2.iterator();
		
		System.out.println("Collection 2 elements: ");
		for(int j = 0; j<myCollection2.getSize(); j++ ) {
			System.out.print(" " + myCollection2.get(j));
		}
		System.out.println();
		
		while(iter4.hasNext()) {
			int element= iter4.next();
			iter4.remove();
			System.out.println("\nCollection 2 elements after removing " + element + " using iterator: ");
			for(int j = 0; j<myCollection2.getSize(); j++ ) {
				System.out.print(" " + myCollection2.get(j));
			}
			System.out.println();
		}
		
		
	}

}
