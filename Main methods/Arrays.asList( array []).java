import java.util.*;
 
public class aslist {
 
	public static void main(String[] args) {
		String array[]= {"Add","Me","in a","List"}; // String Primitive Array
		Integer array1[]= {75,36,25,34}; // Integer Primitive Array
		
        List listeYap=new ArrayList(); //ArrayList -> Polymorphism => List to ArrayList
        List listeYap1=new ArrayList(); //ArrayList -> Polymorphism => List to ArrayList
        
        listeYap=Arrays.asList(array);
        listeYap1=Arrays.asList(array1);
        
        System.out.println("\n"+listeYap.get(0));
        System.out.println(listeYap);
        System.out.println("\n"+listeYap1.get(0));
        System.out.println(listeYap1);
        
	}
 
}
/*OUTPUT
Add
[Add, Me, in a, List]

75
[75, 36, 25, 34]
*/
