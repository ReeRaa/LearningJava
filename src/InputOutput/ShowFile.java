package InputOutput;
import java.io.*;
//java ShowFile FileForManipulation.txt;

public class ShowFile {
    public static void main(String[] args)
    {
        System.out.println("args.length = "+args.length );
        int i;

        //make object from FilesInputStream Class
        FileInputStream fin;

        //check, if file is specified, it means that path is given:
        if(args.length!=1){ //This code will be executed as soon as the program is called with parameters. it means: if address exists, then length =1
            System.out.println("For using this program, please indicate a file as a parameter");
            return;
        }

        //open the file
        try{
            fin=new FileInputStream(args[0]);
        }catch (FileNotFoundException exc){
            System.out.println("File not found!");
            return;
        }

        //read bytes until EOF
        try{
            do{
                i=fin.read(); //read from file
                if (i!= -1)System.out.print((char)i);
                } while (i!=-1);
        }catch (IOException exc){
            System.out.println("Error reading file.");
        }

        //close the file
        try{
            fin.close();
            } catch (IOException exc){
            System.out.println("Error closing file!");
        }
        }
}
