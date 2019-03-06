package abstraction.abstractclass;

public class Square extends Polygon{

	public Square(int side) {
		super(side, side);
	}

	@Override
	public double area() {
		
		return (double) width*height;
	}

}
