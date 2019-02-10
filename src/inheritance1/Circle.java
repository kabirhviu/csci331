package inheritance1;


public class Circle extends Point {
	
	protected int radius;
	
	/*
	 * Constructor
	 */
	Circle (int x, int y, int radius){
		super(x,y); //calls parent's constructor, must be the first statement in this constructor
		this.radius = radius;
	}

	/**
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(int radious) {
		this.radius = radious;
	}
	
	public double area() {
		return 3.14*radius*radius;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", radius: " + radius;
	}

}
