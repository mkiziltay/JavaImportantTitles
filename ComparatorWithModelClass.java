import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class GFG {
    public static void main(String[] args)
    {
  
        // create some user objects
        User u1 = new User("Aaman", 25);
        User u2 = new User("Joyita", 22);
        User u3 = new User("Suvam", 28);
        User u4 = new User("mahafuj", 25);
        User u5 = new User("Jakai",19);
  
        // before sort
        List<User> list
            = Arrays.asList( u1,u2,u3 ,u4,u5 );
        System.out.println("Before Sort:\n-------------------------------------");
        list.forEach(User
                     -> System.out.println("User age "
                                           + User.getAge()));
  
        Collections.sort(list, Comparator.comparingInt(User::getAge));
        
        System.out.println("\n\nAfterSort:\n-------------------------------------");
        list.forEach(User
                     -> System.out.println("User age "
                                           + User.getAge()));
    }
}
class User /*implements Comparable<User>*/ {
    public String name;
    public int age;
  
    public User(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
  
    public int compareTo(User u1)
    {
        return name.compareTo(u1.name);
    }
  
    public String getName()
    {
        return name;
    }
  
    public void setName(String name)
    {
        this.name = name;
    }
  
    public int getAge()
    {
        return age;
    }
  
    public void setAge(int age)
    {
        this.age = age;
    }
  
    @Override
    public String toString()
    {
        return "User [name=" + name
            + ", age=" + age + "]";
    }
}