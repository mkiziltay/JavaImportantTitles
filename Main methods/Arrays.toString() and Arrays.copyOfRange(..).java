
import java.util.*;

public class ArrayClass {
    
      public static void main (String[] args) { 
          
        String[] array = new String[] {"4","3","2","1","0"};
        System.out.println(Arrays.toString(array)); // print original array
          
          // copy after 0. element
        array = Arrays.copyOfRange(array,1,array.length); //(0. element will be removed)
        System.out.println(Arrays.toString(array)); // print new array
      }
    // OUTPUT: from [4, 3, 2, 1, 0] to [3, 2, 1, 0]
    }
