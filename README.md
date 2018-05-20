# DataStructuresAssign6


Overview

In this assignment you will be implementing and testing all three sort algorithms: Merge Sort , Quick Sort , and Heap Sort .

In additions, you will also be writing a driver to test the search algorithms and you will be measuring the run times of each sort.

You will also be using the RunTime class that you enhanced for Homework 4.

Finally, you will be analysing and comparing the performance of the three sort algorithms based on the type of array that was being sorted and the run times you computed.

    RunTime Class

    You will copy the RunTime class that you enhanced in Homework 4 to the project you are using for this assignment.
    MergeSort Class

    You will write the MergeSort.java class which will inherit from RunTime.java and implement the Sort Interface using the Merge Sort algorithm. The interface may be downloaded from SortInterface.java

    You can see the Merge Sort Java Documentation here.

    Please note that your sort method must measure the run time and add it to the RunTime class by using the addRunTime() method.
    QuickSort Class

    You will write the QuickSort.java class which will inherit from RunTime.java and implement the Sort Interface using the Quick Sort algorithm. The interface may be downloaded from SortInterface.java

    You can see the Quick Sort Java Documentation here.

    Please note that your sort method must measure the run time and add it to the RunTime class by using the addRunTime() method.

    For your implementation of QuickSort, you must have three different ways of choosing the pivot as specified by the PivotType enum which will be defined in QuickSort.
    HeapSort Class

    You will write the HeapSort.java class which will inherit from RunTime.java and implement the Sort Interface using the Heap Sort algorithm. The interface may be downloaded from SortInterface.java

    You can see the Heap Sort Java Documentation here.

    Please note that your sort method must measure the run time and add it to the RunTime class by using the addRunTime() method.
    Driver Class

    You will write the Driver.java class which will implement the Driver Interface . The interface may be downloaded from DriverInterface.java
    Output From Driver Main Method

    Please note that, in addition to implementing the DriverInterface, you are also required to write your own public static main(String[] args) method in Driver.java.

    Your main() method will have to call the runSort() method to sort each of the following array types ten times for each sort algorithm:
        1,000 equal Integers.
        1,000 random Integers.
        1,000 increasing Integers.
        1,000 decreasing Integers.
        1,000 increasing and random Integers.
        10,000 equal Integers.
        10,000 random Integers.
        10,000 increasing Integers.
        10,000 decreasing Integers.
        10,000 increasing and random Integers.

    For each call to the runSort() method to sort an ArrayType using a SortType ten times, your main() method will produce the following output:

    ArrayType, Array Size
    ---------------------
                                        Run 1   Run 2   Run 3   Run 4   Run 5   Run 6   Run 7   Run 8   Run 9  Run 10 Average               
                                        Micro   Micro   Micro   Micro   Micro   Micro   Micro   Micro   Micro   Micro   Micro
    		                   Seconds Seconds Seconds Seconds Seconds Seconds Seconds Seconds Seconds Seconds Seconds
                        		   ------- ------- ------- ------- ------- ------- ------- ------- ------- ------- -------
                             MergeSort
                QuickSort FirstElement
               QuickSort RandomElement
    QuickSort MidOfFirstMidLastElement
                              HeapSort
    	

    		                      Run 1      Run 2      Run 3      Run 4      Run 5      Run 6      Run 7      Run 8      Run 9     Run 10     Average
    		                   Kilo Bytes Kilo Bytes Kilo Bytes Kilo Bytes Kilo Bytes Kilo Bytes Kilo Bytes Kilo Bytes Kilo Bytes Kilo Bytes Kilo Bytes
    				   ---------- ---------- ---------- ---------- ---------- ---------- ---------- ---------- ---------- ---------- ----------
                             MergeSort
                QuickSort FirstElement
               QuickSort RandomElement
    QuickSort MidOfFirstMidLastElement
                              HeapSort
    	

    Analysis:

    Using the run time tables you created by running Driver.main(), copy your results into a Microsoft Word document and answer the following questions using 1-3 complete sentences for each question:
        Which sort worked best on data in constant or increasing order (ie already sorted data)? Why do you think this sort worked best?
        Did the same sort do well on the case of mostly sorted data? Why or why not?
        In general, did the ordering of the incoming data affect the performance of the sorting algorithms? Please answer this question by referencing specific data from your table to support your answer.
        Which sort did best on the shorter (ie n=1,000) data sets? Did the same one do better on the longer (ie n=10,000) data sets? Why or why not? Please use specific data from your table to support your answer.
        In general, which sort did better? Give a hypothesis as to why the difference in performance exists.
        Are there results in your table that seem to be inconsistent? (ex. If I get run times for a sort that look like this {1.3, 1.5, 1.6, 7.0, 1.2, 1.6, 1.4, 1.8, 2.0, 1.5] the 7.0 entry is not consistent with the rest). Why do you think this happened?

Link for requirements
http://bit.ly/cmp338-s17-hw6
