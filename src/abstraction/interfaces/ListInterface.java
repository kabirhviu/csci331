package abstraction.interfaces;

public interface ListInterface {
	void add(Integer integer);
	void clear();
	boolean contains(Integer integer);
	boolean remove(Integer integer);
	int size();
	Integer[] toArray();
}
