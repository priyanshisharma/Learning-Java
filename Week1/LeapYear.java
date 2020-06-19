package Week1;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        year = 2000;
        if(CheckLeapYear(year))
            System.out.println(year+" is a leap year.");
        else
            System.out.println(year+" is a leap year.");
        
    }
    public static boolean CheckLeapYear(int yr)
    {
        if (yr % 400 == 0) 
            return true; 

        if (yr % 100 == 0) 
            return false; 
        
        if (yr % 4 == 0) 
            return true; 
        
        return false;
        
    } 
}