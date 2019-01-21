package hw11_1;

public class MyIntegerSort {

	public static void mergeSort(int[] array) {
		mergeSort(array, 0, array.length - 1);
	}

	public static void mergeSort(int[] array, int lb, int ub) {
		int middle;
		
		if(lb < ub) {
			middle = (lb + ub) / 2;
			mergeSort(array, lb, middle);
			mergeSort(array, middle + 1, ub);
			merge(array, lb, middle, ub);
		}
	}

	public static void merge(int[] array, int lb, int middle, int ub) {
		int a, b, c;
		int[] temp = new int[array.length]; // new int[ub - lb + 1]가 더 효율적
		
		a = lb;
		b = middle + 1;
		c = lb;
		
		while(a <= middle && b <= ub) {
			if(array[a] <= array[b])
				temp[c] = array[a++];
			else
				temp[c] = array[b++];
			c++;
		}
		
		if(a > middle) {
			for(int i = b; i <= ub; i++, c++)
				temp[c] = array[i];
		}
		else {
			for(int i = a; i <= middle; i++, c++)
				temp[c] = array[i];
		}
		
		for(int i = lb; i <= ub; i++)
			array[i] = temp[i];
		
	}

}
