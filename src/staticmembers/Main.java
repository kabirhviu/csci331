package staticmembers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1.getSerialNo(): " + p1.getSerialNo());
		System.out.println("p2.getSerialNo(): " + p2.getSerialNo());
		System.out.println("p3.getSerialNo(): " + p3.getSerialNo());
		
		System.out.println("p1.getInstanceCount(): " + p1.getInstanceCount());
		System.out.println("p2.getInstanceCount(): " + p2.getInstanceCount());
		System.out.println("p2.getInstanceCount(): " + p2.getInstanceCount());
		
		System.out.println("Product.getInstanceCount(): " + Product.getInstanceCount());
		
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println("singleton1.toString(): " + singleton1.toString());
		System.out.println("singleton2.toString(): " + singleton2.toString());
		
		System.out.println("singleton1.myDesignPattern(): " + singleton1.myDesignPattern());
		System.out.println("singleton2.myDesignPattern(): " + singleton2.myDesignPattern());
		
		
		if(singleton1 == singleton2) {
			System.out.println("singleton1 and singleton2 are equal");
		}
		else {
			System.out.println("singleton1 and singleton2 are not equal");
		}
		
		if(singleton1.equals(singleton2)) {
			System.out.println("singleton1 and singleton2 are equal");
		}
		else {
			System.out.println("singleton1 and singleton2 are not equal");
		}

	}

}
