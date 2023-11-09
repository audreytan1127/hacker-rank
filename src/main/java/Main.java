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
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        if (N%2!=0){
            System.out.println("Weird");
        } else if (N>=2 && N<=5){
            System.out.println("Not Weird");
        } else if (N>=6 && N<=20){
            System.out.println("Weird");
        } else if(N>20){
            System.out.println("Not Weird");
        }
        scan.close();
    }

}