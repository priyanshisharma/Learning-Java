package Week2;

public class Fibonacci {
        
    public static void main(String[] args){
        int n = 5;
        int t1 = 0, t2 = 1, sum=0, tot_sum=0;
        for(int i=0;i<n;i++)
        {
            tot_sum+=t1;
            System.out.print(t1+" + ");
            sum = t1+t2;
            t1=t2;
            t2=sum;

        }
        System.out.print("= "+tot_sum);
    }
}