import java.util.regex.*;
import java.util.*;
 
// Main class
public class Main {
 
    // Main driver method
    public static void main(String args[])
    {
 
        // Creating a pattern to be searched
        // Custom pattern to be searched
        Pattern pattern = Pattern.compile("geeks*");
 
        // Searching for the above pattern in
        // "geeksforgeeks.org"
        Matcher m = pattern.matcher("geeksforgeeks.org");
 
        // Checking whether the pattern is there or not
        // using find() method
        while (m.find())
 
            // Print starting and ending indexes of the
            // pattern in text using method functionality of
            // this class
            System.out.println("Pattern found from "
                               + m.start() + " to "
                               + (m.end() - 1));
                               
        //System.out.println("mkiziltay.m@hotmail.com".matches("[a-zA-Z0-9_-]+[.][a-z]+[@][a-z]+[.][a-z]{2,3}") );
        System.out.println("Anemail.m@hotmail.com".matches("[a-zA-Z0-9._-]+[@][a-z]+[.][a-z]{2,3}") ); //Output:123
        
        String regex = "[ \\[\\]\\(\\)\\{\\}\\-\\s\\, ]";
        String Example = "[{1-} ,2- ,3-]";
        
        System.out.println(Example.replaceAll(regex, "")); //Output:123
        
        System.out.println(Example.replaceAll("[ \\[\\]\\(\\)\\{\\}\\-\\s\\, ]", "")); //Output:123
        
        String Example2 = "abcgefjkl123789..-";
        String regex2 ="[a-d1-7.-]";
        System.out.println(Example2.replaceAll(regex2,"")); //gefjkl89
    }
} // SOURCE : https://www.vogella.com/tutorials/JavaRegularExpressions/article.html
