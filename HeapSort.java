public class HeapSort<T extends Comparable<? super T>> extends RunTime implements SortInterface<T> {
	
	private static int total;

	@Override

	public void sort(T[] arrayToSort) {

		Heap_sort(arrayToSort, 0, arrayToSort.length - 1);

	}

	private static void operation_swapping(Comparable[] K, int a, int b) {
		Comparable tmp = K[a];
		K[a] = K[b];
		K[b] = tmp;
	}

	
	private static void operation_to_heapify(Comparable[] K, int i) {
		int lft = i * 2;
		int rgt = lft + 1;
		int grt = i;

		if (lft <= total && K[lft].compareTo(K[grt]) > 0)
			grt = lft;
		if (rgt <= total && K[rgt].compareTo(K[grt]) > 0)
			grt = rgt;
		if (grt != i) {
			operation_swapping(K, i, grt);
			operation_to_heapify(K, grt);
		}
	}

	public void Heap_sort(T K[], int l, int r)

	{
		total = K.length - 1;

		for (int i = total / 2; i >= 0; i--)
			operation_to_heapify(K, i);

		for (int i = total; i > 0; i--) {
			operation_swapping(K, 0, i);
			total--;
			operation_to_heapify(K, 0);
		}
	}
}