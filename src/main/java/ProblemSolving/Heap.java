package ProblemSolving;

public class Heap {
    int[] arr = {10, 5, 6, 15, 8, 20, 1};
    int arrSize = 10;
    int i;

    //buildHeap function
//    builds heap from array given
    public void buildHeap(int arr[], int arrSize) {

// loop through length of array and
        for (int i = arrSize / 2 - 1; i >= 0; i--) {
//        call heapify to organize array into heap
            heapify(arr, arrSize, i);
        }
    }

    //    heapify function
//    ensures that root is smallest value
//    left to right child is then small to large
    public void heapify(int arr[], int arrSize, int i) {
// initialize root as smallest value
//    initialize parent
//    initialize left child
//    initialize right child
//

    }

    //    heapSort function
//    sorts array from smallest to largest(without using sort())
    public void heapSort(int arr[], int arrSize) {

    }
}
