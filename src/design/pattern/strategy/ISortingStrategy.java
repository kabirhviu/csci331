package design.pattern.strategy;

import java.util.Comparator;
import java.util.List;
 
public interface ISortingStrategy{
	
	void sort(List<RationalNumber> numbers, Comparator<RationalNumber> comparator);
	
	default void swap(List<RationalNumber> numbers, int i, int j) {
		RationalNumber temp = numbers.get(i);
		numbers.set(i, numbers.get(j));
		numbers.set(j, temp);
	}
}
