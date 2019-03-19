package InputOutput;
import java.util.*;
import java.io.*;

public class TestDelimitter {
    public static void main(String[] args) throws IOException{
        File file=new File("C:\\Users\\reelyka.laheb\\Desktop\\Java\\VabaTekst.txt");
        Scanner sc=new Scanner(file);
        sc.useDelimiter("[^a-zA-Z]+");
        while (sc.hasNext()){
            System.out.println(sc.next());
        }
        sc.close();

    }
}
