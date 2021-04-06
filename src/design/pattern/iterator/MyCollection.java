/**
 * Class MyCollection demonstrates Iterator implementation.
 * 
 * @author mhkabir
 */

import java.util.*;

public class MyCollection {
	
	private static int DEFAULT_CAPACITY = 100;
	
	private int capacity;
	private int size;
	private int[] array;
	private int modCount;
	private int iterCount;
	
	public MyCollection() {
		this.capacity = DEFAULT_CAPACITY;
		this.size = 0;
		this.modCount = 0;
		this.iterCount = 0;
		array = new int[DEFAULT_CAPACITY];
	}
	
	public MyCollection(int capacity) {
		this.capacity = capacity;
		this.size = 0;
		this.modCount = 0;
		this.iterCount = 0;
		array = new int[capacity];
	}
	
	
	public void add(int item) {
		if(size < capacity) {
			this.array[size++] = item;
			modCount++;
		}
		else {
			throw new IndexOutOfBoundsException("Array is full");
		}
	}
	
	public int get(int index) {
		if(index < size) {
			return this.array[index];
		}
		else {
			throw new NoSuchElementException("Element does not exist at this location");
		}
	}
	
	public void remove(int item) {
		int index = -1;
		for(int i = 0; i <size; i++) {
			if(this.array[i] == item) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			removeAt(index, false);
		}
		else {
			throw new NoSuchElementException("Element does not exist at this location");
		}
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int getSize() {
		return size;
	}
	
	public Iterator<Integer> iterator() {
		iterCount++;
		return new MyIterator();
	}
	
	
	
	private void removeAt(int index, boolean isIterator) {
		if(index < size) {
			for (int i = index; i < (size-1); i++) {
				this.array[i] = this.array[i+1];
			}
			size--;
			if(isIterator == false) {
				modCount++;
			}
			
		}
		else {
			throw new NoSuchElementException("Element does not exist at this location");
		}
	}
	
	/**
	 * Iterator is implemented as an private inner class.
	 * 
	 * @author mhkabir
	 *
	 */
	private class MyIterator implements Iterator<Integer> {
		int curPos = 0;
		int curModCount = modCount;
		
		@Override
		public boolean hasNext() {
			return curPos < size;
		}

		@Override
		public Integer next() {
			if(hasNext() == false) {
				throw new NoSuchElementException("Collection is empty!");
			}
			else {
				if(curModCount == modCount) {
					return array[curPos++];
				}
				else {
					throw new ConcurrentModificationException("Collection has been modified after Iterator instantiation!");
				}
			}
			
		}
		
		public void remove() {
			if(size == 0) {
				throw new NoSuchElementException("Collection is empty, cannot remove element!");
			}
			
			if((curPos -1) < 0) {
				throw new NoSuchElementException("Did not call next() before calling remove()");
			}
			
			if(iterCount > 1) {
				throw new ConcurrentModificationException("Other iterators are using the same collection, remove is not allowed!");
			}
			else {
				//Remove the item that was accessed by the recent next() call
				//Move back curPos by 1 to point the right element to remove as well as get ready for the next() call
				curPos--; 
				removeAt(curPos, true);
			}
			
		}
		
	}

}
