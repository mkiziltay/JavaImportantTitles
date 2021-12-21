import java.util.*;

public class HelloWorld{
    
    

     public static void main(String []args){
         ArrayList<Book> list = new ArrayList<>();
         HashMap<String,String> map = new HashMap<>();
        
        list.add(new Book("sefiller", 300, "Victor Hugo", 1995) );
        list.add(new Book("golyat", 150, "Gol yath", 1994) );
        list.add(new Book("ince mehmet", 90, "omer seyfettin", 2001) );
        list.add(new Book("java 102", 65, "Mahmut kara", 2021) );
        list.add(new Book("kucuk kurbaa", 60, "delal houlo", 1990) );
        list.add(new Book("sifirdan java",426, "mehmet kose", 2021) );
        list.add(new Book("suc ve ceza", 500,  "Dostoyevski", 1989) );
        list.add(new Book("kole insanlar", 80,  "tolstoy", 1995) );
        list.add(new Book("insanlar ve sirlari", 70, "hector Hugo", 2000) );
        list.add(new Book("Mr. Recai",110, "Peyami Safa" , 1998) );
        list.add(new Book("Dijital Kale", 350, "Don Brown", 2002) );
        
        list.stream().forEach(book -> map.put(book.getName(),book.getWriter() ) );
        
        list.stream().filter(number -> number.getPage() > 60).forEach(filter -> System.out.println(filter.getName()+" -- "+filter.getWriter() ));
     }
}

class Book{
    private String name;
    private int page;
    private String writer;
    private int release;
    
    Book(String name, int page, String writer, int release){
        this.name=name;
        this.page=page;
        this.writer=writer;
        this.release=release;
    }
    
    public String getName(){return this.name; }
    
    public String getWriter(){return this.writer; }
    
    public int getPage(){return this.page; }
    
    public int getRelease(){return this.release; }
    
}