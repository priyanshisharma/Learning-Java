package Week2.HackerrankPractice;

import java.math.BigInteger;
import java.util.Scanner;

public class Java_BigInteger {
    
    public static void main(final String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        BigInteger bi1 = new BigInteger(sc.next());
        BigInteger bi2 = new BigInteger(sc.next());

        BigInteger  bi3, bi4;
        bi3 = bi1.add(bi2);
        bi4 = bi1.multiply(bi2);
        System.out.println( bi3);
        System.out.println( bi4);
        sc.close();
    }
    
}