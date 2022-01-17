
import java.util.*;

public class Main
{
    
	public static void main(String[] args) {
	    
	    String str = "Zero,One!Two  *   Three-four~Five.";
	    
	    String Fresult = str.replaceAll("\\p{Punct}|\\p{Space}",""); // {Punct}=punctuation => Noktalama işaretleri
	    String Sresult = str.replaceAll("[^a-zA-Z0-9]","");          // [^a-zA-Z0-9] = everything except this [a-zA-Z0-9]
	    
		System.out.println("First  result is : "+Fresult); // First result is : ZeroOneTwoThreefourFive
		System.out.println("Second result is : "+Sresult); // Second result is : ZeroOneTwoThreefourFive
		
	}
}
