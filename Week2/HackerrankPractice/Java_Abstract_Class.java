package Week2.HackerrankPractice;

public class Java_Abstract_Class {
    
    abstract class Book{
        String title;
        abstract void setTitle(String s);
        String getTitle(){
            return title;
        }
        
    }
    class MyBook extends Book{
        void setTitle(String s)
        {
            title = s;
        } 
     }
}