import java.util.*;

//How it works : Replace elements each other in list.
public class CollectionsSwapExample {  
    public static void main (String[] args) {  
        //Create a list with items  
            ArrayList<String>  list = new ArrayList<String>(Arrays.asList("Third","Second","First","Fourth"));  
  
            System.out.println("Original List : \n" +list+"\n");
        
            //Perform swapping : Wrond place 0 and 2 
            Collections.swap(list, 0, 2);  
            System.out.println("List after swapping : \n" +list); 
            
          }  
}
