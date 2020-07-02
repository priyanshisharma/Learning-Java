package Week3.HackerrankPractice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tag_content_extractor {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
          	//Write your code here
            
            boolean matchFound = false;
            Pattern expression = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher match = expression.matcher(line);

            while (match.find()) 
            {
                System.out.println(match.group(2));
                matchFound = true;
            }
            if ( ! matchFound) 
            {
                System.out.println("None");
            }
			testCases--;
        }
        in.close();
	}
}



