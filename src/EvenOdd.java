import java.util.Scanner;

public class EvenOdd {
    EvenOdd(){}
    int readInAnswer (){
        Scanner input = new Scanner(System.in);
        System.out.print("Give your number! ");
        int number =input.nextInt();
        System.out.println("Your number was: "+number);
        return number;
     }
     boolean isEven(int number){
        if (number%2 ==0) System.out.println("Your number is even!") ;
        else System.out.println(("Your number is odd!"));
        return true;
     }

}
