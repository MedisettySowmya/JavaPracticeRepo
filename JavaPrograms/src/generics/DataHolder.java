package generics;

public class DataHolder<T> {
	private T data;

	public DataHolder(T data) {
		this.data = data;
	}

	public T getDate() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void printDataType() {
		System.out.println("Stored data type: " + data.getClass().getSimpleName());
		System.out.println("Value: " + data);

	}
}
