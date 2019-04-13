package Misc;

import java.util.Scanner;

public class MyKey {
    private int id;
    private int hashedId;

    public int hashCode(){
        System.out.println("Calling hasCode()");
        getId();
        return id;
    }

     public int getId(){
         Scanner in=new Scanner(System.in);
         System.out.print("Please give ID value: ");
         id=in.nextInt();
         return id;
     }
}
