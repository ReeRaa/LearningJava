package InputOutput;
import java.io.*;

public class ShowFileTwo {
    public static void main(String[] args) {
        int i;
        FileInputStream fin=null;

        //confirm, that file is specified
        if (args.length!=1){
            System.out.println("Please indicate filename!");
            return;
        }

        //open file, read file until EOF and close file in finally block
        try {
            fin=new FileInputStream(args[0]);
            do{
                i=fin.read();
                if (i!=-1) System.out.println((char)i);
            }while (i!=-1);
        } catch (FileNotFoundException exc){System.out.println("File not found!");}
        catch (IOException exc){System.out.println("Can not read from file!");}
        finally {
            try{
                fin.close();
            }catch (IOException exc){System.out.println(exc);}
        }
    }
}
