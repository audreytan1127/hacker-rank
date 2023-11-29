package ProblemSolving;

import java.util.Scanner;

public class RemoveVowels {
    String modifiedInput = "";
    Scanner scan;
    public RemoveVowels(){
        this.scan = new Scanner(System.in);
    }
    public boolean isVowel(char character){
        character = Character.toLowerCase(character);
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
    }
    // Takes string input, checks each char, returns new string without vowels.
      public void removingVowels() {
          System.out.println("Please input a string.");
          String userInput = scan.nextLine();

//        //loop through each character in input string
          for (int i = 0; i < userInput.length(); i++) {
              char currentCharacter = userInput.charAt(i);
//
//            //check if character is a vowel
              if (!isVowel(currentCharacter)) {
                  modifiedInput += currentCharacter;
              }
          }
          System.out.printf("User Input: %s%n", userInput);
          System.out.printf("Modified Input: %s%n", modifiedInput);
      }
}
