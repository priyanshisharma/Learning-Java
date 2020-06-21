package Week1.HackerrankPractice;

import java.util.Scanner;

public class java_substring_comparisons {
    
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        String[] substrings = new String[s.length() - k + 1];

        for (int i = 0; i <= s.length() - k; i++) 
        {
            String str = s.substring(i, i+k);
            substrings[i] = str;
        }

        smallest = substrings[0];
        largest = substrings[0];

        for(int i = 1; i < substrings.length; i++) //Notice use of .length and not .length()
        {
            // Checkout https://beginnersbook.com/2013/12/java-string-compareto-method-example/ to 
            // understand compareTo function 
            if (substrings[i].compareTo(smallest) < 0) 
            {
                smallest = substrings[i];
            }

            if (substrings[i].compareTo(largest) > 0)
            {
                largest = substrings[i];
            }
        }
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}