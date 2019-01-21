package lab1_6;

//import java.util.Arrays;

public class MyArrayList<T> {
	private Object[] array;
	private Object[] array2;
	private int number;

	public MyArrayList() {
		this.array = new Object[10];
		this.array2 = new Object[10];
		this.number = 0;
	}

	@SuppressWarnings("unchecked")
	public T get(int index) {
		return (T) array[index];
	}

	public int size() {
		return number;
	}

	public boolean add(T element) {
		if(number < array.length) {
			array[number] = element;
			number++;
		}
		else {
			for(int i = 0; i < number; i++) {
				array2[i] = array[i];
			}
			
			array = new Object[2*number];
			
			for(int i = 0; i <array2.length; i++) {
				array[i] = array2[i];
			}
			
			array[number] = element;
			number++;
		}
		return true;
	}

	public void add(int index, T element) {
		try {
			if(number <= index) {
				throw new Exception();
			}

			if(index >= number) {
				array[index] = element;
				number++;
			} else {
				for(int i = number; i > index; i--) {
					array[i] = array[i-1];
				}
				array[index] = element;
				number++;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public T remove(int index) {
		T removedElement = (T) array[index];

		for(int i = index; i < number; i++) {
			array[i] = array[i+1];
		}

		number--;
		return removedElement;
	}

	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		for(int i = 0; i < number; i++) {
			str.append(array[i]);
			str.append(" ");
		}
		return "List = " + str;
	}
}

