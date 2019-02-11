package NewPackage;

import java.util.Scanner;

public class Parameters {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        System.out.println("Give a number ");
        int number =input.nextInt();
        System.out.println("How many times? ");
        int howManyTimes= input.nextInt();
        powerTo(number,howManyTimes);
        powerOf(number, howManyTimes);

    }

    public static void powerTo(int number, int howManyTimes) {
        int value=1;
        for (int i = 1; i < howManyTimes + 1; i++) {
           value = number *howManyTimes;
        }
        System.out.println("Value " + number + " multiplied with " + howManyTimes + " is " + value);
    }

    public static void powerOf(int number,int powerPower){
        double value;
        value=Math.pow(number,powerPower);
        System.out.println(" Number "+ number+" in power of "+powerPower+" is "+(int)value);
    }

}