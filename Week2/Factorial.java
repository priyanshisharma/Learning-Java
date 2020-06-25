package Week2;

public class Factorial{
    public static void main(String[] Args)
    {
        int n=6;
        long res=1;
        for(int i=1; i<=n; i++)
        {
            res*=i;
        }
        System.out.println("The factorial of "+n+" is "+res);
    }
}