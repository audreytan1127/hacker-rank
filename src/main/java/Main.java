import ProblemSolving.*;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
////        Welcome to Java HackerRank!
//        System.out.println("Hello, World.");
//        System.out.println("Hello, Java.");
//
////        HackerRank Q5: Scanner class!
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        // Complete this line
//        int b = scan.nextInt();
//        // Complete this line
//        int c = scan. nextInt();
//
//        System.out.println(a);
//        // Complete this line
//        System.out.println(b);
//        // Complete this line
//        System.out.println(c);

//        HackerRank Q6: Scanner with Conditions
//        Conditionals hackerRank6 = new Conditionals();
//        int N = hackerRank6.getInt();
//        if (N%2!=0){
//            System.out.println("Weird");
//        } else if (N>=2 && N<=5){
//            System.out.println("Not Weird");
//        } else if (N>=6 && N<=20){
//            System.out.println("Weird");
//        } else if(N>20){
//            System.out.println("Not Weird");
//        }

//  // HackerRank Q7: Scanner Input/Output
//        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//        double d = scan.nextDouble();
////        Need another nextLine(); to skip the empty space given after nextInt().
//        scan.nextLine();
//        String s = scan.nextLine();
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);

//        //HackerRank Q8: Java Loops 1
//        Scanner scan = new Scanner(System.in);
//        int N = 2;
//        for (int i=1; i<=10; i++){
//            System.out.printf("%d x %d = %d %n", N, i, N*i);
//        }

//        // HackerRank Q9: Print Format
//        System.out.println("================================");
//        for(int i=0;i<3;i++){
//            String s1=scan.next();
//            int x=scan.nextInt();
//            //Complete this line
//            System.out.printf("%-15s%03d%n", s1, x);
//        }
//        System.out.println("================================");

////////////////   Fibonacci sequence    /////////////////////////
//        FibonacciSequence fib = new FibonacciSequence();
//        fib.setFibLength();
//        fib.runFibSeq();


////////// Acc. Take in a string input, remove all vowels, and print new string without vowels ///////////
//        RemoveVowels removingVowelsFromString = new RemoveVowels();
//        removingVowelsFromString.removingVowels();

//        //HackerRank Q10 convert int to string value
//        StringToInt convert = new StringToInt();
//        String s = convert.convertIntToString();

        ///////////// LINKED LISTS: Insert at end /////////////
//        LinkedList newList = new LinkedList();
//        newList = LinkedList.insertAtEnd(newList, 1);
//        newList = LinkedList.insertAtEnd(newList, 2);
//        newList = LinkedList.insertAtEnd(newList, 3);
//        newList = LinkedList.insertAtEnd(newList, 4);
//        LinkedList.printList(newList);
/////////////////// LINKED LISTS: Delete by key ///////////////////
//        LinkedList.deleteByKey(newList, 1);
//        LinkedList.printList(newList);
//        LinkedList.deleteByKey(newList, 3);
//        LinkedList.printList(newList);
//        LinkedList.deleteByKey(newList, 10);
//        LinkedList.printList(newList);

///////////// LINKED LISTS: Delete by index ///////////////////
//        LinkedList.deleteByIndex(newList, 0);
//        LinkedList.printList(newList);
//        LinkedList.deleteByIndex(newList, 2);
//        LinkedList.printList(newList);
//        LinkedList.deleteByIndex(newList, 8);
//        LinkedList.printList(newList);

/////////////// STACKS: .push() to add new values to stack ////////////////
//        Stack<Integer> newStack = new Stack<>();
//        newStack.push(50);
//        newStack.push(40);
//        newStack.push(30);
//        newStack.push(20);
//        newStack.push(10);
//        System.out.println(newStack);
////////////// STACKS: .pop() removes top value of stack //////////////////////
//        Integer removedTopElement = newStack.pop();
//        System.out.println("The value that has been removed: " + removedTopElement);
//        System.out.println("The new stack value after " + newStack);
////////////// STACKS: .peek() finds just top value of stack ///////////////
//        Integer topElementValue = newStack.peek();
//        System.out.println("The top element value in the stack is: " + topElementValue);
////////////// STACKS: .isEmpty() returns boolean value when checking whether values present in stack /////////
//        if(!newStack.isEmpty()){
//            System.out.println("The stack is not empty: " + newStack);
//        } else{
//            System.out.println("The stack is empty, use .push() to add values to top of stack");
//        }

        //////////// QUEUE: instantiate a queue ////////////////////
//        Queue<String> fruit = new ArrayDeque();
//        fruit.add("banana");
//        fruit.add("apple");
//        fruit.add("cherry");
//        fruit.add("kiwi");
//        System.out.println("Queue of fruit: " + fruit);
//
//        String removeFirstFruit = fruit.remove();
//        System.out.println("First fruit to remove: " + removeFirstFruit);
//        System.out.println("Fruit queue after removal: " + fruit);
//
//        String peekFirstFruit = fruit.peek();
//        System.out.println("The first fruit of the queue: " + peekFirstFruit);
///////////////////// HEAPS: Max  Heap Class /////////////////////////////////
//        MaxHeap heap1 = new MaxHeap(5);
//        heap1.insertKey(20);
//        heap1.insertKey(5);
//        heap1.insertKey(10);
//        heap1.insertKey(8);
//        heap1.insertKey(50);
//
//        System.out.println("Current size of heap: " + heap1.currSize());
//        System.out.println("Max value of heap: " + heap1.getMax());
//
//        int removedMax = heap1.removeMax();
//        System.out.println("This value will be removed from heap: " + removedMax);
//        System.out.println("New size of heap: " + heap1.currSize());
//        System.out.println("New max of heap: " + heap1.getMax());
//
//        int deletedKey = heap1.deleteKey(2);
//        System.out.println("This value will be deleted: " + deletedKey);
//        System.out.println("New size of heap: " + heap1.currSize());
//        System.out.println("New max of heap: " + heap1.getMax());

//////////// HEAPS: min heap class /////////////////////
//        MinHeap heap2 = new MinHeap(5);
//        heap2.insertKey(10);
//        heap2.insertKey(5);
//        heap2.insertKey(2);
//        heap2.insertKey(8);
//        System.out.println("Current size of heap: " + heap2.currSize());
//        System.out.println("Current minimum value of heap: " + heap2.getMin());
//
//        System.out.println("Removing minimum value from heap: " + heap2.removeMin());
//        System.out.println("Current size of heap: " + heap2.currSize());
//        System.out.println("Current minimum value of heap: " + heap2.getMin());
//
//        int removeKey = heap2.deleteKey(1);
//        System.out.println("Deleting this index from heap: "+ removeKey);
//        System.out.println("Current size of heap: " + heap2.currSize());
//        System.out.println("Current minimum value of heap: " + heap2.getMin());

//////////////// Phonebook Hackerrank HashMap Q (user input) //////////////
//        Phonebook myContacts = new Phonebook();
//        myContacts.contactInfo();
    }

}