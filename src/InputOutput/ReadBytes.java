package InputOutput;
import java.io.*;

public class ReadBytes {
    public static void main(String[] args)
    throws IOException{


       byte data[]=new byte[6];
        System.out.println("Enter smthng in max "+data.length+" char!");
        System.in.read(data);
        System.out.println("You wrote: ");

        //enhanced for loop
        System.out.println("Enhanced for-loop: ");
       for (byte i:data){ System.out.println((char)i);}

       //normal for loop
        System.out.println();
        System.out.println("Normal for-loop: ");
        for (int i=0;i< data.length;i++)
       System.out.println((char)data[i]);

        System.out.println();

        //example of write()
        int a='X';
        System.out.print("write: ");
        System.out.write(a);
        System.out.println();
        System.out.println("println: "+a);

    }
}
