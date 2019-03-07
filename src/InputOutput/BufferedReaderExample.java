package InputOutput;
import java.io.*;
public class BufferedReaderExample {
    public static void main(String[] args) throws Exception {
        FileReader fr=new FileReader("C:\\Users\\reelyka.laheb\\IdeaProjects\\LearningJava\\LoeFailist.txt");
        BufferedReader br=new BufferedReader(fr);

        int i;
         while ((i=br.read())!=-1){
             System.out.print((char)i);
         }
         br.close();
         fr.close();
    }
}
