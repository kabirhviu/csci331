package design.pattern.strategy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QuickSort implements SortingStrategy {

	@Override
	public void sort(List<RationalNumber> numbers, Comparator<RationalNumber> comparator) {
		quickSort(numbers, 0, numbers.size()-1, comparator);
		
	}

	
	private void quickSort(List<RationalNumber> numbers, int l, int h, Comparator<RationalNumber> comparator) {
		if(l<h) {
			int pivot = getPivot(numbers, l, h, comparator);
			quickSort(numbers, l, pivot, comparator);
			quickSort(numbers, pivot+1, h, comparator);
		}
	}
	
	
	private int getPivot(List<RationalNumber> numbers, int l, int h, Comparator<RationalNumber> comparator) {
		RationalNumber p = numbers.get((l+h)/2);
		int i=0;
		int j=h;
		while(i<j) {
			while(comparator.compare(numbers.get(i), p)<0) {
				i++;
			}
			
			while(comparator.compare(numbers.get(j), p)>0) {
				j--;
			}
			
			if(i<j) {
				swap(numbers, i, j);
			}
		}
		
		return i;
	}

}
