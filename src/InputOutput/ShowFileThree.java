package InputOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class ShowFileThree {
    public static void main(String[] args) {
        int i;

        if(args.length!=1) {System.out.println("Please give file name!");return;}

        try(FileInputStream fin=new FileInputStream(args[0])) {

            do{
                i=fin.read();
                if (i!=-1) System.out.print((char)i);
            }while (i!=-1);
        } catch(IOException exc){
            System.out.println("IO Error! "+exc);

        }
    }
}
