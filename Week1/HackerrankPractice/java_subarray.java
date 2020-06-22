package Week1.HackerrankPractice;

import java.util.Scanner;

public class java_subarray{
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] list = new int[n];
        int res=0;

        for(int i=0; i<n; i++)
        {
            list[i] = scan.nextInt();
        }
        for(int i=0; i<n;i++)
        {
            int sum = 0;
            for(int j=i; j<n; ++j)
            {
                sum+=list[j];
                if(sum<0)
                {   
                    res+=1;
                }
            }
            
        }
        System.out.print(res);
        scan.close();
    }
}