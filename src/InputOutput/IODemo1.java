package InputOutput;
import java.io.*;
import java.util.Scanner;

public class IODemo1 {

    public static void main(String[] args) throws IOException{

        File file=new File("C:\\Users\\reelyka.laheb\\Desktop\\Java\\VabaTekst.txt");

        BufferedReader br=new BufferedReader(new FileReader(file));
        String str;
        while ((str=br.readLine())!=null){
            System.out.println(str);
        }
        System.out.println("FileReader");
        FileReader fr=new FileReader(file);
        while ((fr.read())!=-1){
            System.out.println((char)fr.read());
        }
        System.out.println("Scanner");
        Scanner sc=new Scanner(file);
        while (sc.hasNextLine()){
          //  System.out.println(sc.next());//prints a word
            System.out.println(sc.nextLine()); //prints a line
            //System.out.println(sc.next().charAt(1)); //print single char
        }

        //using scanner without loops
       // sc.useDelimiter("\\a");
      //  System.out.println(sc.next());

    }
}
