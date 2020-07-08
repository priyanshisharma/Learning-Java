package Week3.LeetCodePractice;

public class Power_of_Two {
        public boolean isPowerOfTwo(int n) {
            
            while(n>4)
            {
                if((n%10)%2!=0)
                    break;
                n/=2;
            }  
            
            if(n==4||n==2||n==1)
                return true;
            
            return false;
        }
    
}