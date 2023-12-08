package ProblemSolving;

import java.util.Scanner;

//class to remove vowels from a user string input
public class RemoveVowels {
//    create an empty string field to store the modified string
    String modifiedInput = "";
//    instantiate scanner
    Scanner scan;
    public RemoveVowels(){
        this.scan = new Scanner(System.in);
    }

//    method to check each character passed whether it is a vowel, returns true if a vowel
    public boolean isVowel(char character){
        character = Character.toLowerCase(character);
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
    }

    // Takes user string input and returns new string without vowels.
      public void removingVowels() {
          System.out.println("Please input a string.");
          String userInput = scan.nextLine();

//        //loop through each character in input string
          for (int i = 0; i < userInput.length(); i++) {
//              store each character into variable to pass into isVowel method as argument
              char currentCharacter = userInput.charAt(i);
//
//            //conditional if character is NOT a vowel
              if (!isVowel(currentCharacter)) {
//                  if the current character is NOT a vowel, place into empty string
                  modifiedInput += currentCharacter;
              }
          }
//          prints user input
          System.out.printf("User Input: %s%n", userInput);
//          prints input without vowels
          System.out.printf("Modified Input: %s%n", modifiedInput);
      }
}
