import java.io.*;
import java.text.*;
import java.util.*;
import java.util.stream.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        
        ArrayList<String> names = new ArrayList<>(); // we will add emails whichs including @gmail...
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0]; // names

                String emailID = firstMultipleInput[1]; // mails
                
                System.out.println( "------- mail ------");
                System.out.println(firstMultipleInput[0]+"***and***"+firstMultipleInput[1] );
                
                
                if(firstMultipleInput[1].matches("[a-zA-Z0-9._-]+[@][gmail]+[.][a-z]{2,3}")){
                    names.add(firstMultipleInput[0]);
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        System.out.println( "\n-----Here is gmail users names with alphabetic sorting------");
        Collections.sort(names);
        names.stream().forEach(p -> System.out.println(p));
        
        bufferedReader.close();
    }
}
/*
OUTPUT
-----Here is gmail users names with alphabetic sorting------
julia
julia
riya
samantha
tanya
*/