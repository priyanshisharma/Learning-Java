package Week1.HackerrankPractice;

import java.util.Scanner;

public class java_2D_Array {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int max_sum=-2000000,curr_sum;
        for(int i=1; i<5;i++)
        {
            for(int j=1;j<5;j++)
            {
                curr_sum = arr[i][j]+arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1]+arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1];
                max_sum = max_sum>curr_sum?max_sum:curr_sum;
            }
        }
        System.out.println(max_sum);
        scanner.close();
    }
}