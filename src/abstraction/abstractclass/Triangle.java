package abstraction.abstractclass;

public class Triangle extends Polygon{

	public Triangle(int width, int height) {
		super(width, height);
	}

	@Override
	public double area() {
		return 0.5*width*height;
	}

}
