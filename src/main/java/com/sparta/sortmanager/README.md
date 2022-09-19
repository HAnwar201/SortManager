# Sort Manager- Hammad Anwar
This program allows a user to input the size of an int array they would like to create. The user is then asked to choose between three sorting methods to sort the array.
This program utilises three different sorting algorithms: bubble sort, merge sort, and binary tree sort.
After the user has chosen what method they would like to use, the sorted list is displayed alongside the time it took to sort.

### Display Manager
Display manager is used to output information such as asking the user to input
and displaying outcomes. 
```
  System.out.println("Please select which sorting method you would like to use.");
            System.out.println("Type 1 for Bubble sort:");
            System.out.println("Type 2 for Merge sort:");
            System.out.println("Type 3 for Binary Tree sort:");
            System.out.println("What method would you like to use?:");
            try {

                int choice = scanner.nextInt();

                if (choice < 0) {
                    throw new IllegalArgumentException();
                }
                while (choice <1 || choice >4){
                    System.out.println("Please enter a valid number");
                     choice = scanner.nextInt();
                     if(choice >1 && choice <4){
                         break;
                     }
                }
```
The user is presented with 3 choices for what sorting method they would like to use.
If the user enters a number outside the boundaries then this will be caught in a 
loop and the user will be asked to re-enter a number.
Display manager class will take the user choise and unsorted array and pass it to the
sort manager class.

### Sort Manager

The sort manager class is the controller of the program. It is responsible for calling the appropriate classes when needed such as
the random array class and the factory class.

### Factory Class 
```
 if (choice == 1){
            System.out.println("You chose Bubble Sort!");
          return new BubbleSort();
        }
        if (choice == 2){
            System.out.println("You chose Merge Sort!");
         return new MergeSort();
        }
        if (choice == 3){
            System.out.println("You chose Binary Tree Sort!");
         return new TreeSort();
        }
```

Factory class is used to determine which sort method should be instantiated. The user input is passed from
the display manager to sort manger to the factory which then returns a instantiated class to the sort manager.
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
```
   if (root == null) {
            root = start;
        } else {
            Node focusNode = root;
            Node parent;
            while (true) {
                parent = focusNode;
                if (data < focusNode.data) {
                    focusNode = focusNode.left;
                    if (focusNode == null) {
                        parent.left = start;
                        return;
                    }

                } else {
                    focusNode = focusNode.right;
                    if (focusNode == null) {
                        parent.right = start;
                        return;
                    }
```
This code is used for creating the binary tree.