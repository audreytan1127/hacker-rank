import ProblemSolving.Conditionals;

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
//        Scanner scan = new Scanner(System.in);
        Conditionals hackerRank6 = new Conditionals();
        int N = hackerRank6.getInt();
        if (N%2!=0){
            System.out.println("Weird");
        } else if (N>=2 && N<=5){
            System.out.println("Not Weird");
        } else if (N>=6 && N<=20){
            System.out.println("Weird");
        } else if(N>20){
            System.out.println("Not Weird");
        }


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

//        //HackerRank Q8: Java Loops
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

//        Fibonacci Sequence (user enters length, starts at 0 and 1)
//        int FibLength;
//        Scanner sc = new Scanner(System.in); //create object
//
//        System.out.print("Please enter length: ");
//        FibLength = sc.nextInt();
//
//        int[] num = new int[FibLength];
//        //initialized first element to 0
//        num[0] = 0;
//        //initialized second element to 1
//        num[1] = 1;
//
//        //New number should be the sum of the last two numbers of the series.
//        for (int i = 2; i < FibLength; i++) {
//            num[i] = num[i - 1] + num[i - 2];
//        }
//
//        //Print Fibonacci Series
//        System.out.println("Fibonacci Series: ");
//        for (int i = 0; i < FibLength; i++) {
//            System.out.print(num[i] + " ");
//        }

//        // Accenture: Take in a string input, remove all vowels, and print new string without vowels.
//
//        //take in string input and store each character
//        String modifiedInput = "";
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please input a string.");
//        String userInput = scan.nextLine();
//        //loop through each character in input string
//        for(int i=0; i<userInput.length();i++){
//            char currentCharacter = userInput.charAt(i);
//
//            //check if character is a vowel
//            if(!isVowel(currentCharacter)){
//                modifiedInput += currentCharacter;
//            }
//        }
//        System.out.printf("User Input: %s%n", userInput);
//        System.out.printf("Modified Input: %s%n", modifiedInput);

    }
////    Accenture remove vowels from string question
//        //have list of vowels to check each character in string
//    public static boolean isVowel(char character){
//        character = Character.toLowerCase(character);
//        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
//    }
}