package design.pattern.strategy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BubbleSort implements SortingStrategy {

	@Override
	public void sort(List<RationalNumber> numbers, Comparator<RationalNumber> comparator) {
		int size = numbers.size();
		for(int i=0; i<size; i++) {
			for( int j=0; j<size-i-1; j++) {
				if(comparator.compare(numbers.get(j), numbers.get(j+1))>0) {
					swap(numbers, j,j+1);
				}
			}
		}
	}	
}
