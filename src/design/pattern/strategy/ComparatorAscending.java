package design.pattern.strategy;

import java.util.Comparator;

public class ComparatorAscending implements Comparator<RationalNumber> {

	@Override
	public int compare(final RationalNumber first, final RationalNumber second) {
		
		int diff = first.getNumerator()*second.getDenominator() - second.getNumerator()*first.getDenominator();
		if(diff == 0) {
			return 0;
		}
		else if (diff>0) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
