package Week1.HackerrankPractice;

import java.util.Scanner;

public class java_anagrams {

    // Note that only the functions below resemble what is required
    // in the Hackerrank Problem, rest has been written in
    // accordance to the file structure.

    static boolean isAnagram(String a, String b) {
        // Complete the function

        if(a.length() != b.length()) 
            return false;

        int ctr_a[] = new int[26], ctr_b[] = new int[26];
        a = a.toLowerCase();
        b = b.toLowerCase();
        for(int i=0; i<a.length(); i++)
        {
            ctr_a[a.charAt(i) - 'a']++;
            ctr_b[b.charAt(i) - 'a']++;
        }

        for(int i =0;i<26; i++)
            if(ctr_a[i] != ctr_b[i] )
                return false;
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}