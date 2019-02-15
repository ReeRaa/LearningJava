package InputOutput;
import java.io.*;

public class CopyFile {
    public static void main(String[] args) {

        FileInputStream fin = null;
        FileOutputStream fout = null;
        int i;

        //check if file is specified
        if (args.length != 2) {
            System.out.println("Please specify file names!");
            return;
        }

        //read file in and write it to file
        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1],true);

            do {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                }
            }
            while (i != -1);
        } catch (IOException exc) {
            System.out.println("IO error " + exc);
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException exc) {
                System.out.println("Error closing input file " + exc);
            }
        }
        try {
            if (fout != null) fout.close();
        } catch (IOException exc) {
            System.out.println("Error closing output file! " + exc);

        }
    }
}
