import java.util.*;
 import java.util.Comparator;
import java.util.PriorityQueue;

public class HelloWorld {
    
     public static void main(String []args){
         //****************WRONG SORTING STYLE********** This style only for String objects....
         List<Person> temp = new ArrayList<>();
         PriorityQueue<Person> pq= new PriorityQueue<>(new Comparator<Person>(){
             @Override
             public int compare(Person s1,Person s2){
                if(s1.getAge() <s2.getAge() ){ return 1; }   //if return + => bigger first
                else if(s1.getAge() ==s2.getAge() ){        //if return = => same next To next
                        if(s1.getId()>s2.getId()){return 1; //if return - => smaller first
                        }else{return -1;}
                }else{return -1;}
             }
         }); // End of the PriorityQueue array initializing.
        
        pq.add(new Person( "mehmet",65,6 ) );
        pq.add(new Person( "salih",65,8 ) );
        pq.add(new Person( "derya",15,8 ) );
        pq.add(new Person( "ahmet",65,4 ) );
        pq.add(new Person( "murat",35,6 ) );
        pq.add(new Person( "selim",65,7 ) );
        pq.add(new Person( "halil",45,16 ) );
        pq.add(new Person( "mustafa",25,26));
        pq.add(new Person( "rahmi",33,3 ) );
        pq.add(new Person( "hakan",23,11 ) );
        pq.add(new Person( "recep",26,10 ) );
        pq.add(new Person( "cemil",16,13 ) );
        
        System.out.println( "**************************** BEFORE SORTING %70 Wrong Because array is't pure String" );
        for(Person p: pq){
            System.out.println( p.getName() );
        }
        System.out.println( "**************************** AFTER SORTING Age and Id sorting" );
        temp.addAll(pq);
        Collections.sort(temp,new Comparator<Person>(){
             @Override
             public int compare(Person s1,Person s2){
                if(s1.getAge() <s2.getAge() ){ return 1; }   //if return + => bigger first
                else if(s1.getAge() ==s2.getAge() ){        //if return = => same next To next
                        if(s1.getId()>s2.getId()){return 1; //if return - => smaller first
                        }else{return -1;}
                }else{return -1;}
             }
         });
         
        for(Person p: temp){
            System.out.println( p.getName() );
        }
    }
}

class Person {
    private String name; //No priority
    private int age;     //First priority
    private int id;     //Second priority
    
    Person(String name, int age, int id){
        this.name=name;
        this.age=age;
        this.id=id;
    }
    
    Person(){}
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public int getId(){
        return this.id;
    }
    
}