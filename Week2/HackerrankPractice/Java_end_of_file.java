package Week2.HackerrankPractice;

import java.util.Scanner;

public class Java_end_of_file {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        for(int i = 1; sc.hasNext(); i++)
            System.out.println(i + " " + sc.nextLine());

        sc.close();
        
    }
}