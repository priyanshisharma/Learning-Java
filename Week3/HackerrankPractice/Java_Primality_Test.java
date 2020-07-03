package Week3.HackerrankPractice;

import java.util.Scanner;

public class Java_Primality_Test {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println(scanner.nextBigInteger().isProbablePrime(100) ? "prime" : "not prime");
        scanner.close();
    }
}