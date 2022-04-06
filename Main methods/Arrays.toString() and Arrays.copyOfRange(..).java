
import java.util.*;

public class ArrayClass {
    
      public static void main (String[] args) { 
          
        String[] array = new String[] {"4","3","2","1","0"};
        System.out.println(Arrays.toString(array)); // print original array
        array = Arrays.copyOfRange(array,1,array.length);// remove 0. element
        System.out.println(Arrays.toString(array)); // print new array
      }
    // OUTPUT: from [4, 3, 2, 1, 0] to [3, 2, 1, 0]
    }
