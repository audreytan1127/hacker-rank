import ProblemSolving.*;

import java.util.Scanner;

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
        LinkedList newList = new LinkedList();
        newList = LinkedList.insertAtEnd(newList, 1);
        newList = LinkedList.insertAtEnd(newList, 2);
        newList = LinkedList.insertAtEnd(newList, 3);
        newList = LinkedList.insertAtEnd(newList, 4);
        LinkedList.printList(newList);
/////////////////// LINKED LISTS: Delete by key ///////////////////
        LinkedList.deleteByKey(newList, 1);
        LinkedList.printList(newList);
        LinkedList.deleteByKey(newList, 3);
        LinkedList.printList(newList);
        LinkedList.deleteByKey(newList, 10);
        LinkedList.printList(newList);


    }
}