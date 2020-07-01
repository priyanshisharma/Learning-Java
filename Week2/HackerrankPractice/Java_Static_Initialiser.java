package Week2.HackerrankPractice;

import java.util.Scanner;

public class Java_Static_Initialiser {
    static int B, H;
    static boolean flag = true;
    static {

        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        sc.close();
        try 
        {
            if (B <= 0 || H <= 0)
                throw new Exception("Breadth and height must be positive");
        } catch (Exception e) 
        {
            System.out.println(e);
            flag = false;
        }
    }
    public static void main(String[] args){
            if(flag){
                int area=B*H;
                System.out.print(area);
            }
            
        }
}