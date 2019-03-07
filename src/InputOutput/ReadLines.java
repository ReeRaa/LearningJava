package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str;

        System.out.println("Enter lines of text! Enter 'stop' to quit!");

        do{
            str=br.readLine();
            System.out.println(str);
        }while(!str.equals("stop"));

    }
}
