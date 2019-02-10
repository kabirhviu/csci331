package staticmembers;

public class Product {
	
//	private static int instanceCount = 0;
	
	private static int instanceCount;
	
	private final int serialNo;
	
	static {
		instanceCount = 0;
	}
	
	public Product() {
		instanceCount++;
		serialNo = instanceCount;
	}
	
	public int getSerialNo() {
		return serialNo;
	}
	
	public static int getInstanceCount() {
		return instanceCount;
	}

}
