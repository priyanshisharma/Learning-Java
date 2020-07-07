package Week3;

import java.util.Scanner;

public class Calculator {
    public static void main(String Args[])
    {
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter an operation, from the following: \n + , - , / , *");
        char operator = sc.next().charAt(0);
        
        switch (operator)
        {
            case '+' : System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                        break;
            case '-' : System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                        break;
            case '*' : System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
                        break;
            case '/' : System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                        break;
            default : System.out.println("Terminating operation due to invalid operand.");
        }

        sc.close();
    }
}