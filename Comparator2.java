import java.util.*;
 import java.util.Comparator;
import java.util.PriorityQueue;
                                    //COMPARATOR EXAMPLE.........
public class HelloWorld {
    
     public static void main(String []args){
         // Burada listemize üyeler ekliyoruz ve üyeleri yaşlarına göre öncelikli olarak değerlendiriyoruz. Yaşı eşit olan üyelerden erken kayıt olmuş (id değeri küçük) olanlar daha öncelikli oluyor.
         List<Person> temp = new ArrayList<>();
        
        temp.add(new Person( "mehmet",65,6 ) );
        temp.add(new Person( "derya",15,8 ) );
        temp.add(new Person( "ahmet",65,4 ) );
        temp.add(new Person( "murat",35,6 ) );
        temp.add(new Person( "selim",65,7 ) );
        temp.add(new Person( "halil",45,16 ) );
        temp.add(new Person( "mustafa",25,26 ) );
        temp.add(new Person( "rahmi",33,3 ) );
        temp.add(new Person( "hakan",23,11 ) );
        temp.add(new Person( "recep",26,10 ) );
        
        
        Collections.sort( temp,new ComparateCls() );
        for(Person p: temp){
            System.out.println( p.getName() );
        }
    }
}

class Person {
    private String name; //Has No priority
    private int age;     //Has First priority
    private int id;     //Has Second priority
    
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
    //--------------------------------Comparator NOT USES THIS EXAMPLE
    /*
    public int compareTo(Person p) {
        if(age>p.age){ return 1; }
        else if(age==p.age){
            if(id>p.id){return 1;
            }else{return -1;}
        }
        return -1;
    }*/
    //-------------------------------
}

class ComparateCls implements Comparator<Person>{
    @Override
    public int compare(Person s1,Person s2){
      if(s1.getAge() <s2.getAge() ){ return 1; } //if return + => bigger first
        else if(s1.getAge() ==s2.getAge() ){    //if return = => same next To next
            if(s1.getId()>s2.getId()){return 1; //if return - => smaller first
            }else{return -1;}
        }
        return -1;  
    }
}