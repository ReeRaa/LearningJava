package InputOutput;
import java.io.*;

public class CopyFileTwo {
    public static void main(String[] args) {
        int i;

        if (args.length!=2) {System.out.println("Please give input and output file names!");return;}

        try(FileInputStream fin=new FileInputStream(args[0]);FileOutputStream fout=new FileOutputStream(args[1],true)){
            do {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                }
            }while (i!=-1);
        }catch (IOException exc) {System.out.println("IO error! "+exc);}
    }
}
