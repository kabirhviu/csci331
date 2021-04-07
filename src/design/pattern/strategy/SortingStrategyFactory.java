package design.pattern.strategy;

public class SortingStrategyFactory {
	
	
	public static enum SortingStrategyType {
		BUBBLE,
		QUICK
	}
	
	public static ISortingStrategy createSortingStrategy(SortingStrategyType type) {
		if(type == SortingStrategyType.BUBBLE) {
			return new BubbleSorting();
		}
		else if( type == SortingStrategyType.QUICK) {
			return new QuickSorting();
		}
		else {
			throw new IllegalArgumentException("Wrong sorting strategy type!");
		}
	}

}
