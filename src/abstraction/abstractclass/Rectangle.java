package abstraction.abstractclass;

public class Rectangle extends Polygon{
	
	public Rectangle(int width, int height) {
		super(width, height);
	}

	@Override
	public double area() {
		return (double) width*height;
	}

}
