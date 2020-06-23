package Week1.HackerrankPractice;

import java.util.Scanner;

class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";

/* ^ represents that starting character of the string. [a-zA-Z] makes sure that the starting character is in the lowercase or uppercase alphabet.[aA-zZ] includes the underscore.
\\w{7,29} represents a check to make sure that the remaining items are word items, which includes the underscore, until it reaches the end and that is represented with $. The {7,29} represents the 8-30 character constraint given to us minus the predefined first character.*/
}
public class valid_username_regular_expression {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}