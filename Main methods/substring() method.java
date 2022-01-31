
public class Geeks {
  
    public static void main(String[] args)
    {
        
        String str = "the part of example of this word";
        System.out.println(" the part of 4. index to 8. index ====> " + str.substring(4,19));//the part of 4. index to 8. index ====> part of example
        
        System.out.println(" the part of 4. index to 8. index ====> " + str.substring(4,str.length()));
    }
}