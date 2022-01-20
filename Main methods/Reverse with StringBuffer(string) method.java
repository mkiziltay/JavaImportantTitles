

import java.util.*;

public class Main
{
    
	public static void main(String[] args) {
	    
	    String numbers = "9 8 7 6 5 4 3 2 1";
	    
	    String result = new StringBuffer(numbers).reverse().toString();
	    
		System.out.println("Buffered string : "+new StringBuffer(numbers));                //Buffered string : 9 8 7 6 5 4 3 2 1
		System.out.println("Buffered and reversed : "+new StringBuffer(numbers).reverse());//Buffered and reversed : 1 2 3 4 5 6 7 8 9
		System.out.println("result is : "+result);                                         // result is : 1 2 3 4 5 6 7 8 9
		
	}
}
