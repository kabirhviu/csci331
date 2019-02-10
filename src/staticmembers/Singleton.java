package staticmembers;

public class Singleton {
	
	private static Singleton instance = null;
	
	private Singleton() {
		
	}
	
	public String myDesignPattern() {
		return "I am Singleton pattern";
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}

}
