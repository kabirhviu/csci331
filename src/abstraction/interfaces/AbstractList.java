package abstraction.interfaces;

public abstract class AbstractList implements ListInterface {
	
	private int size;
	
	@Override
	public int size() {
		return size;
	}

}
