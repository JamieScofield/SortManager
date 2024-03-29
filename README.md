# SortManager
This program contains a sort manager to allow the user to sort a collection of integers using three different sorting algorithms. These are Bubble sort, merge sort and Tree sort. The user will be able to input values and then choose there sorting algorithms. Furthermore, there is functionality to test each algorithm and time how long each algorithm takes to sort each array. The user if they wanted could compare these algorithms to test of which is faster. 

## Bubble sort

This sorting algorithm involves iterating over the entire array and swapping each value to the left if its smaller than the right value. This keeps on iterating until the end of the array.

![Alt text](https://github.com/JamieScofield/SortManager/blob/master/image.png "Bubble code")

## Merge Sort

This sorting algorithm recursively splits the chosen array until there are only in single or double digit arrays. These are then merged back together in a sorted array and returned back to the user. 

![Alt text](https://github.com/JamieScofield/SortManager/blob/master/mergeSort.png "Merge sort")
![Alt text](https://github.com/JamieScofield/SortManager/blob/master/mergeSort2.png "Merge sort")

## Tree sort

This sorting algorithm takes the values of the inputted array and then sorts these into a binary tree. Once this is done it the collects the values (from left to right) and then returns these as a sorted array to the user. 
A known problem with this program is the algorithm does not return a sorted array correctly so a hot fix in the time available is to produce these as a list. 

![Alt text](https://github.com/JamieScofield/SortManager/blob/master/treesort.png "Tree Sort")
![Alt text](https://github.com/JamieScofield/SortManager/blob/master/treesort2.png "Tree Sort")

