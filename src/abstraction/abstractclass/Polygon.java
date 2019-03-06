package abstraction.abstractclass;

public abstract class Polygon {
	
	protected int width;
	protected int height;
	
	public Polygon(int width, int height) {
		this.setWidth(width);
		this.setHeight(height);
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
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
	
	/*
	 * Abstract method, an abstract class must have at least one 
	 * abstract method.
	 */
	public abstract double area();
	

}
