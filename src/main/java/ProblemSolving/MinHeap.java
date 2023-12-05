package ProblemSolving;

public class MinHeap {
    int[] arr;
    int maxSize;
    int heapSize;

    //    instantiates new min heap object with max size and current size of heap to 0
    public MinHeap(int maxSize) {
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


    public int minHeapify(int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int smallest = i;
//        checks if left child is smallest value
        if (left < heapSize && arr[left] < arr[i]) {
            smallest = left;
        }
//        checks if right child is smallest value
        if (right < heapSize && arr[right] < arr[i]) {
            smallest = right;
        }
//        if smallest value is not at i
        if (smallest != i) {
//        store current root into placeholder
            int temp = arr[i];
//        set index to smallest value
            arr[i] = arr[smallest];
//        set smallest value index to placeholder (temp)
            arr[smallest] = temp;
//        recursively call min heap with smallest value to ensure heap structure
            minHeapify(smallest);
        }
        return smallest;
    }

    public int removeMin() {
// check if array is empty, if it is return null
        if (heapSize <= 0) {
            return Integer.MIN_VALUE;
        }
//        if current heap has only one value then remove the value and decrement heap size
        if (heapSize == 1) {
            heapSize--;
            return arr[0];
        }
//       set root equal to the top value in heap
        int root = arr[0];
//        remove root by setting equal to last value in heap (null)
        arr[0] = arr[heapSize - 1];
//        decrement heap size
        heapSize--;
//        call minHeapify to ensure min heap properties are true
        minHeapify(0);
        return root;
    }

    public void decreaseKey(int i, int newValue) {
//set index of value to be decreased
        arr[i] = newValue;
//loop to ensure integrity of min heap
        while (i != 0 && arr[parent(i)] > arr[i]) {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    public int getMin() {
        return arr[0];
    }

    public int currSize() {
        return heapSize;
    }

    public int deleteKey(int i) {
//        decrease the key at index passed in
        decreaseKey(i, Integer.MIN_VALUE);
//    remove min and heapify to restore min heap properties
        removeMin();
        return i;
    }

    public void insertKey(int x) {
//        check that a new key can be inserted to heap
        if (heapSize == maxSize) {
            System.out.println("/n Overflow: a new key cannot be inserted due to max capacity of heap.");
        }
//        increase heap size
        heapSize++;
//        set index to the end of heap index
        int i = heapSize - 1;
//        add new value to end of heap
        arr[i] = x;
//        heapify
        while (i != 0 && arr[parent(i)] > arr[i]) {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

}
