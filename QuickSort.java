import java.util.Random;

public class QuickSort<T extends Comparable<? super T>> extends RunTime implements SortInterface<T> {

	public enum PivotType {
		FirstElement, RandomElement, MidOfFirstMidLastElement
	}

	public PivotType pivotType = PivotType.FirstElement;

	public static PivotType[] values() {
		PivotType[] pivot_type = new PivotType[3];
		int index = 0;
		for (PivotType p : PivotType.values())
			pivot_type[index++] = p;

		return pivot_type;
	}

	public QuickSort.PivotType getPivotType() {
		return pivotType;
	}

	public void setPivotType(QuickSort.PivotType pivotType) {
		this.pivotType = pivotType;
	}

	@Override
	public void sort(T[] arrayToSort) {
		long start = System.currentTimeMillis();
		this.quickSort(arrayToSort, 0, arrayToSort.length - 1);

		long end = System.currentTimeMillis();
		long totalTime = end - start;

		addRuntime(totalTime);
	}

	private void quickSort(T[] array, int first, int last) {
		int pivotIndex;
		if (first < last) {
			pivotIndex = this.partition(array, first, last);
			this.quickSort(array, first, pivotIndex - 1);
			this.quickSort(array, pivotIndex + 1, last);
		}
	}

	public void choosePivot(T[] array, int first, int last) {

		switch (pivotType) {
		case FirstElement: {
			return;
		}
		case RandomElement: {
			Random r = new Random();
			int outcome = r.nextInt(last - first) + first;
			T temp = array[outcome];
			array[outcome] = array[first];
			array[first] = temp;

		}
		case MidOfFirstMidLastElement: {

			int mid = (first + last) / 2;
            if (((array[first].compareTo(array[mid]) > 0) && (array[first].compareTo(array[last]) < 0)) || ((array[first].compareTo(array[mid]) <= 0) && (array[first].compareTo(array[last]) >= 0))) {
                return;
            } else if (((array[mid].compareTo(array[first]) > 0) && (array[mid].compareTo(array[last]) < 0)) || ((array[mid].compareTo(array[first]) <= 0) && (array[mid].compareTo(array[last]) >= 0))) {
               T temp = array[mid];
                array[mid] = array[first];
                array[first] = temp;

            } else {
               T temp = array[last];
                array[last] = array[first];
                array[first] = temp;
            }

		}

		}

	}

	private int partition(T[] array, int first, int last) {
		// ---------------------------------------------------------
		// Partitions an array for quicksort.
		// Precondition: theArray[ first ... last] where first <= last.
		// Postcondition: Returns the index of the pivot element of
		// theArray[ first ... last]. Upon completion of the method,
		// this will be the index value lastS1 such that
		// S1 = theArray[first ... lastS1-1] < pivot
		// theArray[lastS1] == pivot
		// S2 = theArray[lastS1+1 ... last] >= pivot
		// Calls: choosePivot.
		// ---------------------------------------------------------

		// tempItem is used to swap elements in the array
		T tempItem;

		// place pivot in theArray[first]

		this.choosePivot(array, first, last);
		T pivot = array[first]; // reference pivot

		// initially, everything but pivot is in unknown
		int lastS1 = first; // index of last item in S1

		// move one item at a time until unknown region is empty
		for (int firstUnknown = first + 1; firstUnknown <= last; firstUnknown++) {
			// Invariant: theArray[first+1 ... lastS1] < pivot

			// move item from unknown to proper region
			if (array[firstUnknown].compareTo(pivot) < 0) {
				// item from unknown belongs in S1
				++lastS1;
				tempItem = array[firstUnknown];
				array[firstUnknown] = array[lastS1];
				array[lastS1] = tempItem;
			} // end if
				// else item from unknown belongs in S2
		} // end for

		// place pivot in proper position and mark its location
		tempItem = array[first];
		array[first] = array[lastS1];
		array[lastS1] = tempItem;

		return lastS1;
	} // end partition

}
