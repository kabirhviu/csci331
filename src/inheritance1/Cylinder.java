package inheritance1;


public class Cylinder extends Circle{
	private int height;
	
	/*
	 * Constructor
	 */
	public Cylinder (int x, int y, int radius, int height){
		super(x, y, radius); //Calls parent's constructor
		this.height = height;
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
		return 3.14*radius*height;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", height: "+ height;
	}

}
