public class HelloWorld{

     public static void main(String []args){
        
        System.out.println("123".compareTo("124") ); //124 is forward and 123 is 1 step backward.
        System.out.println("abc".compareTo("abd") ); //abd is forward and abc is 1 step backward.
        System.out.println("bbb".compareTo("aa") ); //aa is backward in Eng. alphabeth.
        System.out.println( "z".compareTo("x" ) ); //x is 2 step backward in alphabeth.
        System.out.println( "z".compareTo("a" ) ); //a is 25 step backward in alphabeth.
     }
} 
/*OUTPUT

-1
-1
1
2
25

*/
