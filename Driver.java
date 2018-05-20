import java.util.Arrays;
import java.util.Random;

public class Driver implements DriverInterface {
	// Generate and return an array of Integer values all initialized to 1

	public Integer[] getEqualNumbers(int arraySize) {
		Integer[] arr = new Integer[arraySize];
		Arrays.fill(arr, 1);

		return arr;
	}

	// Generate and return an array of Integer with random values

	public Integer[] getRandomNumbers(int arraySize) {
		Integer[] arr = new Integer[arraySize];

		Random r = new Random();
		for (int i = 0; i < arraySize; i++) {
			arr[i] = r.nextInt();
		}

		return arr;
	}

	// Generate and return an array of Integer values starting at 1 and ending
	// at arraySize

	public Integer[] getIncreasingNumbers(int arraySize) {
		Integer[] arr = new Integer[arraySize];

		for (int i = 0; i < arraySize; i++) {
			arr[i] = i + 1;
		}
		return arr;
	}

	// Generate and return an array of Integer values starting at arraySize and
	// ending at 1

	public Integer[] getDecreasingNumbers(int arraySize) {
		Integer[] arr = new Integer[arraySize];

		for (int i = 0; i < arraySize; i++) {
			arr[i] = arraySize - i;
		}
		return arr;
	}

	public Integer[] getIncreasing_Random_Numbers(int arraySize) {
		Integer[] arr = new Integer[arraySize];

		Random r = new Random();

		for (int i = 0; i < arraySize; i++) {
			arr[i] = r.nextInt();
		}

		Arrays.sort(arr);
		return arr;
	}

	// Creates a new array of Integer objects

	@Override
	public Integer[] createArray(ArrayType arrayType, int arraySize) {

		if (arrayType == DriverInterface.ArrayType.Equal) {
			return getEqualNumbers(arraySize);

		} else if (arrayType == DriverInterface.ArrayType.Random) {
			return getRandomNumbers(arraySize);

		} else if (arrayType == DriverInterface.ArrayType.Increasing) {
			return getIncreasingNumbers(arraySize);

		} else if (arrayType == DriverInterface.ArrayType.Decreasing) {
			return getDecreasingNumbers(arraySize);
		}
		return getIncreasing_Random_Numbers(arraySize);
	}

	@Override
	public RunTime[] runSorts(ArrayType arrayType, int arraySize, int numberOfTimes) {
		RunTime[] runTimes = new RunTime[5];
		int index = 0;

		MergeSort<Integer> mergesort = new MergeSort<Integer>();
		for (int i=1; i<= numberOfTimes; i++) {
			Integer[] array = createArray(arrayType,arraySize);
			mergesort.sort(array);
		}
		runTimes[index++] = mergesort;

		QuickSort<Integer> quicksort1 = new QuickSort<Integer>();
		quicksort1.setPivotType(QuickSort.PivotType.FirstElement);
		for (int i=1; i<= numberOfTimes; i++) {
			Integer[] array = createArray(arrayType,arraySize);
			quicksort1.sort(array);
		}
		runTimes[index++] = quicksort1;

		QuickSort<Integer> quicksort2 = new QuickSort<Integer>();
		quicksort2.setPivotType(QuickSort.PivotType.RandomElement);
		for (int i=1; i<= numberOfTimes; i++) {
			Integer[] array = createArray(arrayType,arraySize);
			quicksort2.sort(array);
		}
		runTimes[index++] = quicksort2;

		QuickSort<Integer> quicksort3 = new QuickSort<Integer>();
		quicksort3.setPivotType(QuickSort.PivotType.MidOfFirstMidLastElement);
		for (int i=1; i<= numberOfTimes; i++) {
			Integer[] array = createArray(arrayType,arraySize);
			quicksort3.sort(array);
		}
		runTimes[index++] = quicksort3;

		HeapSort<Integer> heapsort = new HeapSort<Integer>();
		for (int i=1; i<= numberOfTimes; i++) {
			Integer[] array = createArray(arrayType,arraySize);
			heapsort.sort(array);
		}
		runTimes[index++] = heapsort;

		return runTimes;

	}


	}

