package NewPackage;

import java.lang.reflect.Array;
import java.util.Scanner;

public class LongestName {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many names you have? ");
        int names = input.nextInt();
        String name, maxName;
        int nameLenght, maxNameLength;
        System.out.print("What is name number 1: ");
        maxName = input.next();
        //System.out.println("Number one name is "+maxName);
        maxNameLength = maxName.length();
        for (int i = 2; i <= names; i++) {
            System.out.print("What is name number " + i + " : ");
            name = input.next();
            // System.out.println("Your input was "+name);
            nameLenght = name.length();
            // System.out.println("The word length is: "+ nameLenght);
            if (nameLenght > maxNameLength) {
                maxName = name;
                maxNameLength = maxName.length();
            }
        }
        maxName = maxName.toLowerCase();
        char firstOne = maxName.charAt(0);
        firstOne = Character.toUpperCase(firstOne);
        maxName = firstOne + maxName.substring(1);
        char[] nameChars = maxName.toCharArray();
        for (int i = 0; i < nameChars.length; i++) {


        }
        //maxName=firstOne + maxName;
        System.out.println("The longest name is " + maxName + " Its lenght is " + maxNameLength + " char");


        String answer = "";
        while (!answer.equals("yes") && !answer.equals("no")) {
            System.out.println("Enter yes or no: ");
            answer = input.next();
        }
        System.out.println("Thank you!");

        System.out.println("New");
        String answerTwo="";
        System.out.print("Please answer yes or no! ");
        answerTwo=input.next();
        while(!answerTwo.equals("yes") && !answerTwo.equalsIgnoreCase("no")){
            System.out.println("PLEASE answer yes or no!");
            answerTwo=input.next();
        }
    }
}