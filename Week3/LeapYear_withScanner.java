package Week3;

import java.util.Scanner;

public class LeapYear_withScanner {
    
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year to be checked ");
        year = sc.nextInt();
        if(CheckLeapYear(year))
            System.out.println(year+" is a leap year.");
        else
            System.out.println(year+" is a leap year.");

        sc.close();
    }
    public static boolean CheckLeapYear(int yr)
    {
        if (yr % 400 == 0)
            return true;

        if (yr % 100 == 0)
            return false;

        if (yr % 4 == 0)
            return true;

        return false;

    }


}