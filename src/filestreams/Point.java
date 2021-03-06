package filestreams;

import java.io.Serializable;

public class Point implements Serializable{
	
	private int x;
	private int y;
	
	/**
	 * Constructor
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void show() {
		System.out.println("x: " + x +", y: "+ y);
	}
	
}
