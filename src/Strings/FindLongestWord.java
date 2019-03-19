package Strings;
import java.io.*;
import java.util.*;

public class FindLongestWord {
    static String text;
    public static void main(String[] args) throws IOException {
        List <String> lineList=new ArrayList<String>();

        File file=new File("C:\\Users\\reelyka.laheb\\Desktop\\Java\\VabaTekst.txt");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String allText, line;


        for (int i = 1; i < 5; i++) {
            text = br.readLine();
            System.out.println(text);

        }
        System.out.println(text);

        String tempString=text;
        String[] words=tempString.split(" ");

        for (String word : words) {
            System.out.println(word);
        }

        System.out.println();
        System.out.println(words[1]);



    }
}
