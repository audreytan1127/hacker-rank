package ProblemSolving;

public class MaxHeap {

    int[] arr;
    int maxSize;
    int heapSize;

    //    instantiates new heap with a maximum size and a current heap size of 0
    MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        heapSize = 0;
    }

    public int parent(int i) {
        return (i - 1) / 2;
    }

    public int leftChild(int i) {
        return ((2 * i) + 1);
    }

    public int rightChild(int i) {
        return ((2 * i) + 2);
    }

    public void maxHeapify(int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int largest = i;
// checks if left child is the largest value
        if (left < heapSize && arr[left] > arr[i]) {
            largest = left;
        }
// checks if right child is the largest value
        if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }
// if the largest value is not at root,
        if (largest != i) {
//    store the root in a placeholder
            int temp = arr[i];
//    set root index equal to the value largest in heap
            arr[i] = arr[largest];
//    set the index where the largest value WAS to the value of the root in placeholder
            arr[largest] = temp;
//    check to make sure the heap is actually in order thru recursion
            maxHeapify(largest);
        }
    }

    public int removeMax() {
//        checks if array is empty, if it is returns null
        if (heapSize <= 0) {
            return Integer.MIN_VALUE;
        }
//    if the current heap has only 1 value, will remove the value and return 0
        if (heapSize == 1) {
            heapSize--;
            return arr[0];
        }
//        sets the root equal to the initial value in heap
        int root = arr[0];
//        root is removed
        arr[0] = arr[heapSize - 1];
//        current heap size is decremented
        heapSize--;
//        makes sure max heap properties are true
        maxHeapify(0);
        return root;
    }


}
