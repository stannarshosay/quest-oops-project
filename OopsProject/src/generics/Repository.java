package generics;

public class Repository<T> {

	private T array[];
	
	public Repository(T[] array) {
		this.array = array;
	}

	public T[] getAll() {
		return this.array;
	}
	
	public void add(int index,T item) {
		this.array[index] = item;
	}
	
}
