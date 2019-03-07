package InputOutput;
import java.io.*;
public class ReadFromFileDemo {
    public static void main(String[] args) {
        String s;

        try (BufferedReader br = new BufferedReader(new FileReader("LoeFailist.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException exc) {
            System.out.println("Exception!");
        }
    }
}

