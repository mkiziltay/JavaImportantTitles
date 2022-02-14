
import java.util.*;

public class Main
{
    
	public static void main(String[] args) {
	    
	    ArrayList<String> array = new ArrayList<>(Arrays.asList("one", "two", "three","four","five"));
	    
	    String seperator = "-";
	    
	    String result = String.join(seperator,array);
	    // or String result = String.join("-",array);
	    
	    // Creating new String from ArrayList with String.join(item,array) method
	    
		System.out.println("Array is :" +array.toString()); // ==> Array is :[one, two, three, four, five]
		System.out.println("with join method result is :" + result); // ==>  result is :one-two-three-four-five
	}
}
