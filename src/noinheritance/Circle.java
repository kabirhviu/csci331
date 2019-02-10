package noinheritance;


public class Circle {
	private Point center;
	private int radius;
	/**
	 * @return the center
	 */
	public Point getCenter() {
		return center;
	}
	/**
	 * @param center the center to set
	 */
	public void setCenter(Point center) {
		this.center = center;
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

}
