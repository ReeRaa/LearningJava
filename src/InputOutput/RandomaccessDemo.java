package InputOutput;
import java.io.*;

public class RandomaccessDemo {
    public static void main(String[] args) {
        double data[]={1.2,3.4,7.8,4.5,2.4};
        double d;

        try (RandomAccessFile raf =new RandomAccessFile("Random.dat","rw")) //open file
        {
            //write values to the file
            for (int i=0;i<data.length;i++){
                raf.writeDouble(data[i]);
            }

            //read back specified values
            raf.seek(0);
            System.out.println("First value is: "+raf.readDouble());

            raf.seek(8);
            System.out.println("Second value is: "+raf.readDouble());

            raf.seek(24);
            System.out.println("Fourth value is: "+raf.readDouble());

            //read every other value
            for (int i=0;i<data.length;i+=2){
                raf.seek(i*8);
                System.out.println("values over 2 are: "+raf.readDouble());
            }
        } catch (IOException exc){System.out.println("An error occurred!");}
    }
}
