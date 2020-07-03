package Week3.HackerrankPractice;

import java.util.HashMap;
import java.util.Scanner;

public class Java_Map {
    public static void main(String []argh)
	{
		HashMap<String, Integer> mp = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            mp.put(name,phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            try
            {
                int num=mp.get(s);
                System.out.println(s+"="+num);
            }
            catch(Exception e)
            {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}