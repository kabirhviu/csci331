package design.pattern.singleton;

public class Singleton {
	
	private static Singleton instance = null;
	
	private static int count = 0;
	
	private Singleton() {}
	
	public static synchronized Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
			++count;
		}
		return instance;
	}
	
	public String toString() {
		return "Singleton.instance: " + count;
	}
	
	public static int getCount() {
		return count;
	}

}
