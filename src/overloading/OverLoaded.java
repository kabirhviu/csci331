package overloading;

public class OverLoaded {
	
	int sum(int one, int two) {
		return one + two;
	}
	
	int sum(int one, int two, int three) {
		return one + two + three;
	}
	
	double sum(double one, double two) {
		return one + two;
	}
	
	double sum(double one, double two, double three) {
		return one + two + three;
	}
	
	/**
	 * Changing only the return type does not overload a function
	 * @param one
	 * @param two
	 * @return
	 */
//	double sum(int one, int two) {
//		return (double) (one + two);
//	}
	
	
	int sum(int one, double two) {
		return one + (int)two;
	}
	
	double sum(double one, int two) {
		return one + (double)two;
	}
	
	int sum(int[] numbers) {
		int sum = 0;
		for(int n: numbers) {
			sum+=n;
		}
		
		return sum;
	}
	
	double sum(double[] numbers) {
		double sum = 0;
		for(double n: numbers) {
			sum+=n;
		}
		
		return sum;
	}

}
