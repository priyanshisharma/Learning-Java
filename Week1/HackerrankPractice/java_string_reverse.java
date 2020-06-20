package Week1.HackerrankPractice;

import java.util.Scanner;

public class java_string_reverse {

    // Note that only the main fuction resembles what is required
    // in the Hackerrank Problem, rest has been written in
    // accordance to the file structure.

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int beg=0, end=A.length()-1;
        boolean flag = true;
        while(end>beg)
        {
            if(A.charAt(beg)!=A.charAt(end))
            {
                flag = false;
                break;
            }
            else
                flag = true;

            beg += 1;
            end -= 1;
        }
        if(flag)
            System.out.println("Yes");
        else
            System.out.println("No");

        sc.close();
    }
}