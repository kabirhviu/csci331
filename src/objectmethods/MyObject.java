package objectmethods;

public class MyObject {
	private int value;
	
	public MyObject(int value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public int hashCode() {
		return value;
	}
	
	@Override
	public boolean equals(Object other) {
		if(other instanceof MyObject) {
			if(this.hashCode() == other.hashCode()) {
				return true;
			}
		}
		return false;
	}
}
