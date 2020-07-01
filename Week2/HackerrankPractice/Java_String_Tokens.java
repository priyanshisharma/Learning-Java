package Week2.HackerrankPractice;

import java.util.Scanner;

public class Java_String_Tokens {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().trim();
        scan.close();
        
        String[] tokens = input.split("[^\\p{Alpha}]+");
        
        int size = (input.isEmpty()) ? 0 : tokens.length;
        System.out.println(size);
        
        for(String s : tokens) {
            System.out.println(s);
        }
    }
}