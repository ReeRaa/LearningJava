package NewPackage;

import java.util.Scanner;
public class learningScanner {
    public static void main(String[] args){
        Scanner sisend= new Scanner(System.in);
        System.out.println("What is your name?");
        String name=sisend.nextLine();
        System.out.println("Hello "+ name);
    //    Scanner vanus= new Scanner(System.in);
        System.out.println("How old are you?");
        int vanus=sisend.nextInt();
        System.out.println(("Sinu vanus aastates on: ") + vanus);
    }
}
