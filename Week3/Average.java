package Week3;

public class Average {

    public static void main(String[] args)
    {
        double avg = 0;
        int[] numbers = {2, 7, 18, 30, 14, -8};

        for(int num : numbers)
            avg+=num;

        /*
            for(int i=0; i<numbers.length;i++)
            {
                avg+=numbers[i];
            }
         */
        System.out.println("The sum of numbers is " + avg);
        avg/=numbers.length;
        /*
         Casting avg = ((double)sum)/(numbers.length)
         */
        System.out.println("The average is "+avg);

    }
}
