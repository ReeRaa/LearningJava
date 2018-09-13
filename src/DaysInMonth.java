import java.util.Scanner;

public class DaysInMonth {
    //return number of days
    void days(int number){
        if(number==1 || number==3 || number==5){System.out.println("There are 31 days in provided month no. "+number);}
        else if (number==2) {System.out.println("There are 28 days in provided month no. "+number);}
        else {System.out.println("There are 30 days in provided month no. "+number);}
       }
}
