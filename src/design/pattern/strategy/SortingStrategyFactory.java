package design.pattern.strategy;

public class SortingStrategyFactory {
	
	public static enum SortingStrategyType {
		BUBBLE,
		QUICK
	}
	
	public static SortingStrategy createSortingStrategy(SortingStrategyType type) {
		if(type == SortingStrategyType.BUBBLE) {
			return new BubbleSort();
		}
		else if( type == SortingStrategyType.QUICK) {
			return new QuickSort();
		}
		else {
			throw new IllegalArgumentException("Wrong sorting strategy type!");
		}
	}

}
