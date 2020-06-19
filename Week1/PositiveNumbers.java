package Week1;

public class PositiveNumbers {
    public static void main(String[] args) {
        float num;
        num = 2000;
        TypeNumber(num);
        
    }
    public static void TypeNumber(float n)
    {
        if (n>0.0)
            System.out.println(n+" is a positive number.");
        else if (n<0.0)
            System.out.println(n+" is a negative number.");
        else
            System.out.println(n+" is neither a positive nor a negative number.");
        
        
    }
}