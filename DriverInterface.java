
public interface DriverInterface {
	
public static enum ArrayType {Equal, Random, Increasing, Decreasing, IncreasingAndRandom};
	
    public static enum SortType {MergeSort, QuickSort, HeapSort};

	public Integer[] createArray(ArrayType arrayType, int arraySize);
	
	public RunTime[] runSorts(ArrayType arrayType, int arraySize, int numberOfTimes);

}
