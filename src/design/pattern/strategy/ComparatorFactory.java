package design.pattern.strategy;

import java.util.Comparator;

public class ComparatorFactory {
	
	public static enum ComparatorType {
		ASCENDING,
		DESCENDING
	}
	
	public static Comparator<RationalNumber> createComparator(ComparatorType type) {
		if(type == ComparatorType.ASCENDING) {
			return new ComparatorAscending();
		}
		else if (type == ComparatorType.DESCENDING) {
			return new ComparatorDescending();
		}
		else {
			throw new IllegalArgumentException("Wrong comparator type");
		}
	}

}
