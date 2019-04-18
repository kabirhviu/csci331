package ca.viu.csci331.lab6;

import java.util.Comparator;
import java.util.List;
 
public interface SortingStrategy{
	void sort(List<RationalNumber> numbers, Comparator<RationalNumber> comparator);
}
