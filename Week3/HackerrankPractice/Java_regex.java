package Week3.HackerrankPractice;

import java.util.Scanner;

public class Java_regex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();
    }
    
}
class MyRegex{
    String ValidVal = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    public String pattern = ValidVal + "\\." + ValidVal + "\\." + ValidVal + "\\." + ValidVal;
}