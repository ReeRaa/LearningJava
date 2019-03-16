package Collections;
import java.util.*;

public class BooksHashMap {
    public static void main(String[] args) {
        //create map of books
        Map<Integer,Book> map=new HashMap<Integer, Book>();
        //create books
        Book b1=new Book(101,"About dogs","Jack London","Sunshine",5);
        Book b2=new Book(102,"About cats","Jolanda London","Starshine",2);

        //Add Books to map
        map.put(1,b1);
        map.put(2,b2);

        //retrieve Books form map
        for(Map.Entry<Integer,Book> entry:map.entrySet()){
            int key=entry.getKey();
            Book b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
