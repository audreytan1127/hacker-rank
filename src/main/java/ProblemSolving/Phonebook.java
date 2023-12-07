package ProblemSolving;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    //    Hackerrank question for Hashmap practice
//    initialize scanner to check for user input
    Scanner scan;
    int n;

    public Phonebook() {
//    instantiate scanner when phonebook is constructed
        Scanner scan = new Scanner(System.in);
        this.scan = scan;
    }

    //method to grab user input for contact name and number
    public void contactInfo() {
//        ask for number of contacts you wish to enter
        System.out.println("Enter the number of contacts you would like to insert into the phonebook at this time.");
// store number of contacts to store into variable
        int n = scan.nextInt();
//        call nextline so next user input can be saved as name
        scan.nextLine();
//    instantiate map for contact
        Map<String, Integer> contact = new HashMap<>();
//        initialize String name
        String name;
//        initialize int number
        int number;
//        loop through user inputs
        for (int i = 0; i < n; i++) {
//        ask for name of contact
            System.out.println("Input contact name, then number");
//        save input into name variable
            name = scan.nextLine();
//        save input to number variable
            number = scan.nextInt();
//       add another nextline to allow user to submit one user for another contact to be entered
            scan.nextLine();
//        save name and number variables to map
            contact.put(name, number);
        }
//        after input of contacts, loop through input to look for name to print number value
        while (scan.hasNext()) {
            String searchName = scan.nextLine();
//       look through phonebook for key and if found,
            if (contact.get(searchName) != null) {
//                print name = number
                System.out.println(searchName + " = " + contact.get(searchName));
            } else {
//        if no name is found print Not found
                System.out.println("Not found");
            }
            scan.close();
        }


    }
}
