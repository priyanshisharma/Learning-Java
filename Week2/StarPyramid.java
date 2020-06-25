package Week2;

public class StarPyramid {
    
    public static void main(String args[]) 
    { 
        int n = 5; 
        printPyramid(n); 
    } 

    public static void printPyramid(int n) 
    { 
        for (int i=0; i<n; i++) //total rows
        {
            for (int j=n-i; j>1; j--) 
            { 
                System.out.print(" "); 
            } 
            for (int j=0; j<=i; j++ ) 
            {
                System.out.print("* "); 
            } 

            System.out.println(); 
        } 
    } 
}