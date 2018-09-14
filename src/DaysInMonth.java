import java.util.Scanner;

public class DaysInMonth {
    //return number of days
    void days(int number) {
        if (number == 1 || number == 3 || number == 5) {
            System.out.println("There are 31 days in provided month no. " + number);
        } else if (number == 2) {
            System.out.println("There are 28 days in provided month no. " + number);
        } else {
            System.out.println("There are 30 days in provided month no. " + number);
        }
    }

    // read in char 1
    String readInAChar() {
        Scanner charIn = new Scanner(System.in);
        System.out.print("Give a char: B or D: ");
        String charReadIn = charIn.next();
        return charReadIn;
    }

    //look, is it R, B, D or sth else
    void checkIfMatch(String word) {
        if (word.equalsIgnoreCase("B")) {
            System.out.println("You wrote "+ word+ " which stands for Blue!");
        } else if (word.equalsIgnoreCase("D")) {
            System.out.println("You wrote letter D which stands for Dark red");
        }
        else System.out.println("You wrote "+word+ " which is not letter B or D! Try again!");
    }
}
