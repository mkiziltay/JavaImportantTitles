
import java.util.*;

public class LongestWorld{

     public static void main(String []args){
        
        String str = "Hey!!!!! which one is the longest word in this case!";
        String longest = Arrays.stream(str.toLowerCase().replaceAll("[\\p{Punct}]","").split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println(longest);
     }
}
