
import java.io.IOException;
import java.lang.reflect.Method;

class ArrayUtil
{
    public <T> void arrayContains(T[] array, T elem) // T elem is neccessary. it's example for double parameter.
    {
    	for (T item : array)
    	{
    		System.out.println( item );
    	}
    }
}


public class Main {


    public static void main( String args[] ) {
        
        Integer[] intArray = { 1, 2, 3 };
        Integer a = 5; // Integer b is neccessary. it's example for double parameter.
        String[] stringArray = {"Hello", "World"};
        String b = "five"; // Integer b is neccessary. it's example for double parameter.
        
        ArrayUtil au = new ArrayUtil();
        au.arrayContains( intArray, a );
        au.arrayContains( stringArray, b );
      
    }
}