package noinheritance;


public class Cylinder {
	
	private Circle base;
	private int height;
	/**
	 * @return the base
	 */
	public Circle getBase() {
		return base;
	}
	/**
	 * @param base the base to set
	 */
	public void setBase(Circle base) {
		this.base = base;
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	public double volume(){
		return base.area()*height;
	}
	
}
