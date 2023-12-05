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

    //    will allow for the value at a certain index to be increased to new value
//    useful for removing key at certain index
    public void increaseKey(int i, int newValue) {
//        sets value at index to the new value passed in
        arr[i] = newValue;
//      ensure max heap properties are still valid after increase
        while (i != 0 && arr[parent(i)] < arr[i]) {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    public int getMax() {
        return arr[0];
    }

    public int currSize() {
        return heapSize;
    }

    //    deletes key at certain index
    public void deleteKey(int i) {
//        sets key to infinity and heapifies so infinite value is at root index
        increaseKey(i, Integer.MAX_VALUE);
//        removes infinite key and heapifies
        removeMax();
    }

    //    inserts a new key
    public void insertKey(int x) {
// checks to see if another key can be inserted due to heaps having max size
        if (heapSize == maxSize) {
            System.out.println("/n Overflow: key cannot be inserted due to max capacity of heap.");
            return;
        }
//        increment current heap size
        heapSize++;
//        sets i to the index of new heap size
        int i = heapSize - 1;
//        sets index to key value passed in
        arr[i]=x;
//        max heapify
       maxHeapify(i);
    }
}
