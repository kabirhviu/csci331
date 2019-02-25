package ca.viu.csci331.midterm.q1;

public class Sort {
	
	public static int[] quick(final int[] data, final int begin, final int end) {
		int copy[] = new int[end-begin];
		for(int i=begin; i<end; i++) {
			copy[i-begin] = data[i];
		}
		quickSort(copy, 0, end-begin-1);
		return copy;
	}
	
	public static double[] quick(final double[] data, final int begin, final int end) {
		double copy[] = new double[end-begin];
		for(int i=begin; i<end; i++) {
			copy[i-begin] = data[i];
		}
		quickSort(copy, 0, end-begin-1);
		return copy;
	}
	
	public static int[] quick(final int[] data) {
		int copy[] = quick(data, 0, data.length);
		return copy;
	}
	
	public static double[] quick(final double[] data) {
		double copy[] = quick(data, 0, data.length);
		return copy;
	}
	
//	private static void quickSort(int[] data, int low, int high) {
//		if(low<high) {
//			int pivot = getPivot(data, low, high);
//			quickSort(data, low, pivot-1);
//			quickSort(data, pivot+1, high);
//		}
//	}
	
//	private static int getPivot(int[] data, int low, int high) {
//		int pValue = data[high];
//		int i = low-1;
//		for(int j=low; j<high; j++) {
//			if(data[j]<=pValue) {
//				i++;
//				swap(data, i,j);
//			}
//		}
//		swap(data, i+1, high);
//		return i+1;
//	}
	
	private static void quickSort(int[] data, int low, int high) {
		if(low<high) {
			int pivot = pivot(data, low, high);
			quickSort(data, low, pivot);
			quickSort(data, pivot+1, high);
		}
	}
	
	private static int pivot(int[] data, int low, int high) {
		int pValue = data[(low+high)/2];
		int i = low;
		int j = high;
		while(i<j) {
			while(data[i]<pValue) {
				i++;
			}
			while (data[j]>pValue) {
				j--;
			}
			if(i<j) {
				swap(data, i,j);
				i++;
				j--;
			}
		}
		
		return i;
	}
	
	
	public static void swap(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	
	private static void quickSort(double[] data, int low, int high) {
		if(low<high) {
			int pivot = getPivot(data, low, high);
			quickSort(data, low, pivot-1);
			quickSort(data, pivot+1, high);
		}
	}
	
	private static int getPivot(double[] data, int low, int high) {
		double pValue = data[high];
		int i = low-1;
		for(int j=low; j<high; j++) {
			if(data[j]<=pValue) {
				i++;
				swap(data, i,j);
			}
		}
		swap(data, i+1, high);
		return i+1;
	}
	
	
	public static void swap(double[] data, int i, int j) {
		double temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	

}
