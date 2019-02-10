package inheritance1;

public class Point {
	/*
	 * protected member variables are accessible from the subclasses.
	 * private member variables are not.
	 */
	protected int x;  
	protected int y;
	

	/**
	 * Constructor
	 * @param x
	 * @param y
	 */
	Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x: "+ x + ", y: "+ y;
	}

}
