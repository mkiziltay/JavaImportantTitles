import java.util.*;
//import java.util.stream.Collectors;

public class HelloWorld{

     public static void main(String []args){
         int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
         String[] strings = {"a", "b", "c", "d", "e"};
         String reduce = Arrays.stream(strings).reduce("new Style", (a, b) -> a + "|" + b);
        System.out.println(reduce); // new Style|a|b|c|d|e
        
        int max = Arrays.stream(numbers).reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(max); // 10
        
        int sum = Arrays.stream(numbers).reduce(0, Integer::sum);
        System.out.println(sum); // 55

     }
}