import java.lang.reflect.Array;
import java.util.Scanner;

public class LongestName {
    public static void main(String args[]){
        Scanner input =new Scanner(System.in);
        System.out.print("How many names you have? ");
        int names=input.nextInt();
        String name,maxName;
        int nameLenght,maxNameLength;
        System.out.print("What is name number 1: ");
        maxName=input.next();
        //System.out.println("Number one name is "+maxName);
        maxNameLength=maxName.length();
        for (int i=2; i<=names;i++){
            System.out.print("What is name number "+i+" : ");
            name=input.next();
           // System.out.println("Your input was "+name);
            nameLenght=name.length();
           // System.out.println("The word length is: "+ nameLenght);
            if (nameLenght>maxNameLength ) {
                maxName=name;
                maxNameLength = maxName.length();
            }
        }
        maxName=maxName.toLowerCase();
        char firstOne=maxName.charAt(0);
        firstOne=Character.toUpperCase(firstOne);
        //maxName=firstOne + maxName;
        System.out.println("The longest name is "+ maxName+" Its lenght is "+ maxNameLength + " char");

    }
}
