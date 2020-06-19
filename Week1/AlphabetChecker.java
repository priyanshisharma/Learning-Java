package Week1;

public class AlphabetChecker {
    public static void main(String[] args) {
        char ch;
        ch = 'P';
        if(isAlpha(ch))
            System.out.println(ch+" belongs to the English Alphabet.");
        else
            System.out.println(ch+" doesn't belong to the English Alphabet.");
        
    }
    public static boolean isAlpha(char c)
    {
        if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
            return true;
        
        return false;   
    }
}