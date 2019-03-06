package exceptionhandling;

public class NumHolder {
	
	private int[] numbers;
	private final int capacity;
	private int count;
	
	public NumHolder(int capacity) {
		this.capacity = capacity;
		this.numbers = new int[capacity];
		this.count = 0;
	}
	
	public void add(int number) throws NumHolderException {
		if(getCount() < numbers.length) {
			numbers[count++] = number;
		}
		else {
			throw new NumHolderException("NumHolder is full, cannot add more number");	
		}
	}
	
	public int get(int i) {
		if(i>=0 && i<count) {
			return numbers[i];
		}
		else {
			throw new NumHolderRuntimeException("Number at given index " + i + ", does not exist");
		}
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	
	public static void main(String[] args) {
		NumHolder numHolder = new NumHolder(5);
		for(int i=0; i<5; i++) {
			try {
				numHolder.add(i*10);
			} catch (NumHolderException e) {
				System.out.println(e.getMessage());
			}
		}
		
		for (int i=0; i<5; i++) {
			int number = numHolder.get(i);
			System.out.println(number);
		}
		
		for (int i=0; i<6; i++) {
			try {
				int number = numHolder.get(i);
				System.out.println(number);
			}
			catch(NumHolderRuntimeException re) {
				try {
					throw new NumHolderException(re.getMessage(), re);
				} catch (NumHolderException e) {
					e.printStackTrace();
				}
			}
		}
	}


}
