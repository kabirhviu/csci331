package overloading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoaded overloaded = new OverLoaded();
		
		System.out.println("sum(int, int): " + overloaded.sum(100, 200));
		System.out.println("sum(int, int, int): " + overloaded.sum(100, 200, 300));
		System.out.println("sum(double, double): " + overloaded.sum(100.3, 200.2));
		System.out.println("sum(double, double, double): " + overloaded.sum(100.3, 200.2, 300.4));
		System.out.println("sum(int, double): " + overloaded.sum(100, 200.2));
		System.out.println("sum(double, int): " + overloaded.sum(100.3, 200));
		int iNumbers[] = {100, 200, 300, 400, 500};
		System.out.println("sum(int[]): " + overloaded.sum(iNumbers));
		double dNumbers[] = {100.1, 200.2, 300.3, 400.4, 500.5};
		System.out.println("sum(double[]): " + overloaded.sum(dNumbers));

	}

}
