package objectmethods;

public class Main {
	
	public static void main(String[] args) {
		MyObject myObject = new MyObject(100);
		
		System.out.println("Object.toString(): " + myObject.toString());
		System.out.println("Object.getClass().getName(): " + myObject.getClass().getName());
		System.out.println("Object.getClass().getSimpleName(): " + myObject.getClass().getSimpleName());
		System.out.println("Object.hashCode(): " + myObject.hashCode());
		System.out.println("Object.hashCode() hex: " + Integer.toHexString(myObject.hashCode()));
		
		MyObject myObject1 = new MyObject(200);
		MyObject myObject2 = new MyObject(200);
		
		
		System.out.println("myObject1.hashCode(): " + myObject1.hashCode());
		System.out.println("myObject2.hashCode(): " + myObject2.hashCode());
		
		System.out.println("Comparing the same object");
		if(myObject1 == myObject1) {
			System.out.println("Objects are equal");
		}
		else {
			System.out.println("Objects are not equal");
		}
		
		if(myObject1.equals(myObject1)) {
			System.out.println("Objects are equal");
		}
		else {
			System.out.println("Objects are not equal");
		}
		
		
		
		System.out.println("Comparing two different objects");
		if(myObject1 == myObject2) {
			System.out.println("Objects are equal");
		}
		else {
			System.out.println("Objects are not equal");
		}
		
		if(myObject1.equals(myObject2)) {
			System.out.println("Objects are equal");
		}
		else {
			System.out.println("Objects are not equal");
		}
		
		
	}

}
