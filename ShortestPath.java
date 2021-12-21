import java.util.*; 
import java.io.*;

public class HelloWorld{
    static int count=0;
    static List<String> resArr = new ArrayList<>();
    static List<String> resArr2 = new ArrayList<>();
    static List<String> branches = new ArrayList<>();
    
    public static String ShortestPath(String[] strArr) {
    
    int numNodes = Integer.parseInt(strArr[0]);
    String nodeFirst = strArr[1];
    String nodeLast = strArr[numNodes];
    String[] nodesRest = Arrays.copyOfRange(strArr, 2, numNodes);
    String[] connections = Arrays.copyOfRange(strArr, numNodes + 1, strArr.length);
    
    for (String item : connections) {if(item.startsWith(strArr[1] )){count++;/**/resArr2.add(item);/**/}//contains how much starting nodes
    
    
    if(item.contains(nodeLast)&& item.contains(nodeFirst)){
        return item;}
    }

    while(count-- !=0) {
      resArr.add(resArr2.get(count) );// resArr2.remove(count); not required
      for (String conn : connections) {// looking connection nodes
            if (conn.startsWith( Character.toString( resArr.get(resArr.size()-1).toString().charAt(2) ))) {
                resArr.add(""+conn.toString().trim() );
            }else if(resArr.size()>1 && conn.startsWith( Character.toString( resArr.get(resArr.size()-1).toString().charAt(0)) )){
                resArr.remove(resArr.size()-1 );
                resArr.add(""+conn.toString().trim() );
            }
      }

      if( Character.toString( resArr.get(resArr.size()-1).toString().charAt(2)).equals(nodeLast) ){// if found finishing node, loop will finish and value will added the array
          resArr2.add(resArr.toString().replace(" ","") );
          resArr.clear();
        }else{resArr.clear();}
    }
    for(int i=0;i<resArr2.size();i++ ){ // Finilize,remove parts and reformatting Array elemets like "A-B-F"
    if(!resArr.contains(nodeLast)){ resArr.clear(); } // if last node not found clear temporary array.
        for(int j=1;j<resArr2.get(i).length();j++ ){
            if(Character.isLetter(resArr2.get(i).charAt(j)) && !resArr.contains(""+resArr2.get(i).charAt(j)) ){ resArr.add( ""+resArr2.get(i).charAt(j) );}
            if(resArr.contains(nodeLast) ){ branches.add(resArr.toString().replace(", ","-") );resArr.clear();  break;}
        }
    }
    if(branches.isEmpty() ){// is Not contains finis nodes will return -1
        return "-1";
    }else{// if found 1 and more connections, array being sorting.
        branches.sort(Comparator.comparingInt(String::length));
    }
    
    return branches.get(0).toString();// returning closest node.
 }

     public static void main(String []args){
         Scanner s = new Scanner(System.in);
        System.out.print(ShortestPath( s.nextLine().replace("\"","").replaceAll("[\\[\\]\\(\\)]", "").split(",") ));
        
     }
 }