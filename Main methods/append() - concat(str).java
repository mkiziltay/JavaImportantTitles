
public class Geeks {
  
    public static void main(String[] args)
    {
        // with String Builder
        StringBuilder sb1 = new StringBuilder("This is example of ");
        System.out.println(" 1 : " + sb1.append("APPEND METHOD")); //1 : This is example of APPEND METHOD
        
        // without String Builder
        String sb2 = "this is example of ";
        System.out.println(" 2 : " + sb2.concat("CONCAT METHOD"));// 2 : this is example of CONCAT METHOD
    }
}