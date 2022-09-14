# Sort Manager
This program utilises three different sorting algorithms: bubble sort, merge sort, and binary tree sort.
### Bubble Sort
Bubble sort is a simple sorting algorithm that repeatedly steps through the input list element by element, comparing the current element with the one after it, swapping their values if needed.

```
    int n = arrayToSort.length;
        for (int i = 0; i < n - 1; i++)
                if (arrayToSort[i] > arrayToSort[i + 1]) {
                    int temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i + 1];
                    arrayToSort[i + 1] = temp;
                }
```
This is the main driving force of the bubble sort implementation. First the length of the array is assigned to an int.
Run a nested for loop to traverse the input array using two variables i and j, such that 0 ≤ i < n-1 and 0 ≤ j < n-i-1.

If arr[j] is greater than arr[j+1] then swap these adjacent elements, else move on.

### Merge Sort
Conceptually, a merge sort works as follows:

Divide the unsorted list into n sublists, each containing one element (a list of one element is considered sorted).

Repeatedly merge sublists to produce new sorted sublists until there is only one sublist remaining. This will be the sorted list.

```
  int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];
```
Find the middle point to divide the array into two halves. Assign both halves to a left and right array of ints.
```
   while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= righHalf[j]) {
                arrayToSort[k] = leftHalf[i];
                i++;
            } else {
                arrayToSort[k] = righHalf[j];
                j++;
            }
```
Two arrays are merged and sorted. 

### Binary Tree Sort 
Tree sort is a sorting algorithm that is based on Binary Search Tree data structure. It first creates a binary search tree from the elements of the input list or array and then performs an in-order traversal on the created binary search tree to get the elements in sorted order. 