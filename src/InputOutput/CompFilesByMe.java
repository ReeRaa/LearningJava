package InputOutput;
import java.io.*;

public class CompFilesByMe {
    public static void main(String[] args) {

        int i, j;
        char k,l;
        String a,b;
        int position=0;

        if (args.length != 2) {
            System.out.println("Please give two files, to compare!");
            return;
        }

        try (FileInputStream f1 = new FileInputStream(args[0]);
             FileInputStream f2 = new FileInputStream(args[1])) {
            do {
                i = f1.read();
                k=(char)i;
                System.out.println(k);
                a=Character.toString(k);
                System.out.println(a);

                j = f2.read();
                l=(char)j;
                System.out.println(l);
                b=Character.toString(l);
                System.out.println(b);
                position++;

                if (a==b || i !=j ) break; //ignore upper and lowercases
            } while ((i != -1 && j != -1));

            if (i != j) System.out.println("Files are not equal! They differ at position "+position+" where char in 1 file is "+k+ " and in 2 file is "+l);
            else System.out.println("Files are the same!");
        } catch (IOException exc) {
            System.out.println("IO error!");

        }
    }
}
