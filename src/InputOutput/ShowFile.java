package InputOutput;
import java.io.*;
//java ShowFile FileForManipulation.txt;

public class ShowFile {
    public static void main(String[] args)
    {
        int i;
        FileInputStream fin;

        //is file specified:
        if(args.length!=1){
            System.out.println("Usage: ShowFile File");
            return;
        }


        try{
            //open the file
            fin=new FileInputStream(args[0]);
        }catch (FileNotFoundException exc){
            System.out.println("File not found!");
            return;
        }

        try{
            //read bytes until EOF
            do{
                //read from file
                i=fin.read();
                if (i!= -1)System.out.print((char)i);
                } while (i!=-1);
        }catch (IOException exc){
            System.out.println("Error reading file.");
        }

        try{
            //close the file
            fin.close();
            } catch (IOException exc){
            System.out.println("Error closing file!");
        }


    }
}
