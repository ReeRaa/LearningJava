package InputOutput;
import java.io.*;
import java.util.Scanner;

public class IODemo2 {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();

        System.out.println("Enter your name:");
        String name=sc.nextLine();

        System.out.println("Your name is: "+name+" and your age is: "+ age);

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name:");
        String name2=br.readLine();
        System.out.println("Enter your age:");
        int age2=br.read();
        System.out.println("Your name is: "+name2+" and your age is: "+ age2);



    }

}
