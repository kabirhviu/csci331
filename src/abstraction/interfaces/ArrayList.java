package abstraction.interfaces;

import java.util.Arrays;

//public class ArrayList implements ListInterface {
public class ArrayList extends AbstractList {
	
	private Integer[] list;
	private int capacity;
	private int size;
	
	public ArrayList(int capacity) {
		this.capacity = capacity;
		this.size = 0;
		this.list = new Integer[capacity];
	}
	
	public int getCapacity() {
		return capacity;
	}

	@Override
	public void add(Integer element) {
		if(size<capacity) {
			list[size++] = element;
		}
		else {
			throw new IllegalStateException("List is full!");
		}
	}

	@Override
	public void clear() {
		Arrays.fill(list, null);
		size = 0;
	}

	@Override
	public boolean contains(Integer element) {
		for(Integer number: list) {
			if(number == element) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean remove(Integer element) {
		for(int i=0; i<size; i++) {
			if(list[i] == element) {
				for (int j=i; j<(size-1); j++) {
					list[j] = list[j+1];
				}
				list[size-1] = null;
				size--;
				return true;
			}
		}
		return false;
	}

//	@Override
//	public int size() {
//		return size;
//	}

	@Override
	public Integer[] toArray() {
		Integer[] copy = new Integer[size];
		for(int i =0; i<size; i++) {
			copy[i] = list[i];
		}
		return copy;
		
	}

}
