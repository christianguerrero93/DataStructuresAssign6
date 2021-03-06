public class MergeSort<T extends Comparable <? super T>> extends RunTime implements SortInterface<T>{

   @Override

   public void sort(T[] arrayToSort) {

       mergeSort(arrayToSort, 0, arrayToSort.length-1);

   }

   public int Merge(T arr[], int l, int m, int r)

   {

       int i, j, k;

       int n1 = m - l + 1;

       int n2 = r - m;

       /* create temp arrays */

       @SuppressWarnings("unchecked")
	T[] L = (T[])new Comparable[n1];

       @SuppressWarnings("unchecked")
	T[] R = (T[])new Comparable[n2];

       /* Copy data to temp arrays L[] and R[] */

       for (i = 0; i < n1; i++)

           L[i] = arr[l + i];

       for (j = 0; j < n2; j++)

           R[j] = arr[m + 1+ j];

       /* Merge the temp arrays back into arr[l..r]*/

       i = 0; // Initial index of first subarray

       j = 0; // Initial index of second subarray

       k = l; // Initial index of merged subarray

       while (i < n1 && j < n2)

       {

           if (L[i].compareTo(R[j]) <= 0)

           {

               arr[k] = L[i];

               i++;

           }

           else

           {

               arr[k] = R[j];

               j++;

           }

           k++;

       }

       /* Copy the remaining elements of L[], if there

   are any */

       while (i < n1)

       {

           arr[k] = L[i];

           i++;

           k++;

       }

       /* Copy the remaining elements of R[], if there

   are any */

       while (j < n2)

       {

           arr[k] = R[j];

           j++;

           k++;

       }

       return 0;

   }

   /* l is for left index and r is right index of the

   sub-array of arr to be sorted */

   public void mergeSort(T arr[], int l, int r)

   {

       if (l < r)

       {

           // Same as (l+r)/2, but avoids overflow for

           // large l and h

           int m = l+(r-l)/2;

           // Sort first and second halves

           mergeSort(arr, l, m);

           mergeSort(arr, m+1, r);

           Merge(arr, l, m, r);

       }

   }
}