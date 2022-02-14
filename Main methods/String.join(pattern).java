
public class HelloWorld{

     public static void main(String []args){
         String[] strings = {"a", "b", "c", "d", "e"};
         String join = String.join("|", strings);
        System.out.println(join);
     }
}
// OUTPUT : a|b|c|d|e