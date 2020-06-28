package Week2.HackerrankPractice;

public class Java_Interface 
{
    interface AdvancedArithmetic
    {
        int divisor_sum(int n);
      }
      
      //Write your code here
      class MyCalculator implements AdvancedArithmetic {
      
          public int divisor_sum(int num)
          {
      
                  int res=0;
                  for(int i=1;i<=num;i++)
                  {
                      if(num%i==0)
                      {
                          res+=i;
                      }
                  }
                  return res;
          }
      }
}