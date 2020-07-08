package Week3.LeetCodePractice;

public class ArrangingCoins {
    public int arrangeCoins(int n) {
        
        int beg=0,end=n,res=n/2,mid;
        long sum;
        while(beg<=end)
        {
            mid = (beg+end)/2;
            sum = ((long) mid*(mid+1)/2);
            if(sum<=n)
            {
                beg=mid+1;
                res = mid;
            }
            else
            {
                end = mid-1;
            }
        };
        
        return res;
    } 
}