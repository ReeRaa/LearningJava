package InputOutput;
import java.io.*;
import java.util.Scanner;

public class IODemoFirst {

    public static void main(String[] args) throws IOException{
        File file=new File("C:\\Users\\reelyka.laheb\\Desktop\\Java\\RaamatuTekst.txt");
        BufferedReader br=new BufferedReader(new FileReader(file));

        String str;

        while ((str=br.readLine())!=null){
            System.out.println(str);
        }

        Scanner sc=new Scanner(file);
        while (sc.hasNextLine()){
            System.out.println(sc.next());//prints a word
            System.out.println(sc.nextLine()); //prints a line
        }
    }
}
