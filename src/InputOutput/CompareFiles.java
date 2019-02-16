package InputOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class CompareFiles {
    public static void main(String[] args) {
        int a, b;

        if (args.length != 2) {
            System.out.println("Please give files to compare!");
            return;
        }

        try (FileInputStream fin1 = new FileInputStream(args[0]); FileInputStream fin2 = new FileInputStream(args[1])) {


            do {
                a = fin1.read();
                b = fin2.read();

                if (a != b) {
                    System.out.println("files are different! In first file is written '"+ (char) a + "' and in second file is written '" + (char) b+"'");
                    return;
                }
            } while (a != b || a != -1 || b != -1) ;

                System.out.println("Files are the same!");
            }catch (IOException exc) {
            System.out.println("IO error! " + exc);
        }
    }
}