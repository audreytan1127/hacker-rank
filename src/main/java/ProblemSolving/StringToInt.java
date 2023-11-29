package ProblemSolving;

import java.util.Scanner;

public class StringToInt {
    String s = "";
    public Scanner scan;
    public StringToInt(){
        this.scan = new Scanner(System.in);
    }
    public String convertIntToString() {
        System.out.println("Please type in an integer to convert to a String.");
        int n = scan.nextInt();
        try {
            if (n >= -100 && n <= 100) {
                s = Integer.toString(n);
                scan.close();
            }
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job, your integer is now a string value: " + s);
            } else {
                System.out.println("Cannot parse value to string. Please re-run to try again");
            }
        } catch (NumberFormatException e) {
            System.out.println("Unable to parse integer");
        }
        return s;
    }

}
