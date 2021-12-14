

import java.io.IOException;
import java.lang.reflect.Method;

class Printer <T>
{
    private final T []array;
    
    public Printer(T []array){
        this.array = array;
    }
    
   public void printArray(T []array){
       for( int i=0; i<array.length; i++ ){
       System.out.println( array[i] );
       }
   }
 
}

public class Main {


    public static void main( String args[] ) {
        
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        Printer myPrinter = new Printer(intArray);
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}