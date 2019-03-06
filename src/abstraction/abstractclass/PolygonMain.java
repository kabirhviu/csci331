package abstraction.abstractclass;

public class PolygonMain {

	public static void main(String[] args) {
		Polygon polygon = null;
		int width = 10;
		int height =8;
		
//		polygon = new Polygon(width, height);
//		polygon = new Square(width);
//		polygon = new Rectangle(width, height);
		polygon = new Triangle(width, height);
		
		if(polygon instanceof Square) {
			System.out.println("Square polygon");
		}
		else if(polygon instanceof Rectangle) {
			System.out.println("Rectangle polygon");
		}
		else if(polygon instanceof Triangle) {
			System.out.println("Triangle polygon");
		}
		else {
				System.out.println("Unkown polygon");
		}
			
		System.out.println("Width: " + polygon.getWidth() + 
				", height: " + polygon.getHeight() +", area: " + polygon.area());

	}

}
