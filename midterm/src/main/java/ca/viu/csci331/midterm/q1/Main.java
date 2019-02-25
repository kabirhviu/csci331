package ca.viu.csci331.midterm.q1;

public class Main {
	
	public static void main(String[] args) {
		
		int arrayInt[] = {200, 150, 180, 100, 120, 300, 250, 160, 190, 130}; 
		int[] sortedSubArrayInt = Sort.quick(arrayInt, 2, 7);
		show(sortedSubArrayInt);
		//sortedSubArrayInt = {100, 120, 180, 250, 300}		
		sortedSubArrayInt = Sort.quick(arrayInt, 1, 8);
		show(sortedSubArrayInt);
		//sortedSubArrayInt = {100, 120, 150, 160, 180, 250, 300}
		sortedSubArrayInt = Sort.quick(arrayInt);
		show(sortedSubArrayInt);
		//sortedAusArrayIn = {100, 120, 130, 150, 160, 180, 190, 200, 250, 300}
		double arrayDouble[] = {200.2, 150.15, 180.18, 100.1, 120.12, 300.3, 250.25, 160.16, 190.19, 130.13}; 
		double[] sortedSubArrayDouble = Sort.quick(arrayDouble, 2, 7);
		show(sortedSubArrayDouble);
		//sortedSubArrayDouble = {100.1, 120.12, 180.18, 250.25, 300.3}		
		sortedSubArrayDouble = Sort.quick(arrayDouble, 1, 8);
		show(sortedSubArrayDouble);
		//sortedSubArrayDouble = {100.1, 120.12, 150.15, 160.16, 180.18, 250.25, 300.3}	
		sortedSubArrayDouble = Sort.quick(arrayDouble);
		show(sortedSubArrayDouble);
		//sortedAusArrayIn = {100.1, 120.12, 130.13, 150.15, 160.16, 180.18, 190.19, 200.2, 250.25, 300.3}
	}
	
	public static void show(int[] data) {
		System.out.println("\n");
		for (int i : data) {
			System.out.print(i+ " ");
		}
		System.out.println("\n");
	}
	
	public static void show(double[] data) {
		System.out.println("\n");
		for (double i : data) {
			System.out.print(i+ " ");
		}
		System.out.println("\n");
	}

}
