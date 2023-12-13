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
        int largest = i;
//    initialize left child
        int left = 2 * i + 1;
//    initialize right child
        int right = 2 * i + 2;
// check if left child is smaller than parent
        if (left < arrSize && arr[left] > arr[largest]) {
//        if so, switch left child with root index
            largest = left;
        }
//        check if right child is smaller than parent
        if (right < arrSize && arr[right] > arr[largest]) {
//        if so, switch right child with root index
            largest = right;
        }
//        check if the largest value is at i in the list
        if (largest != i) {
//        if not, declare placeholder variable equal to the list at index i
            int swap = arr[i];
//        set variable equal to largest value
            arr[i] = arr[largest];
//        and set at the index of the largest value equal to placeholder value
            arr[largest] = swap;
//            recursively call heapify
            heapify(arr, arrSize, i);
        }

    }

    //    heapSort function
//    sorts array from smallest to largest(without using sort())
    public void heapSort(int arr[]) {
//        declare length of list to array length
        int arrSize = arr.length;
//     Builds heap from index of 0
        for (int i = arrSize / 2 - 1; i >= 0; i--) {
//            calls heapify with each input of the array
            heapify(arr, arrSize, i);
        }
//        loops through array to make sure that the root value is largest value
        for(int i = arrSize - 1; i>0; i--){
//            sets the root value into placeholder variable
            int temp = arr[0];
//            sets root index value equal to largest value
        arr[0] = arr[i];
//        sets index of new root value to old root value stored in variable
        arr[i] = temp;
//        calls heapify to ensure largest value is in root index
        heapify(arr, i, 0);
        }
    }
}
