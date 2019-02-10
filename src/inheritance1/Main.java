package inheritance1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point point = new Point(2,3);
		Circle circle = new Circle(2, 3, 4);
		Cylinder cylinder = new Cylinder(2,3,4,5);
		
		System.out.println("point: " + point.toString());
		System.out.println("circle: "+ circle.toString());
		System.out.println("clylinder: "+ cylinder.toString());

	}

}
