package ca.viu.csci331.lab6;

import java.util.List;

public abstract class AbstractSort implements SortingStrategy{

	protected void swap(List<RationalNumber> numbers, int i, int j) {
		RationalNumber temp = numbers.get(i);
		numbers.set(i, numbers.get(j));
		numbers.set(j, temp);
	}

}
