import java.util.Scanner;
import java.util.Random;

public class PrepForOddsAndEvens {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    void userSettings() {
       /* int a = 3;
        int b = -2;
        if((a>0)&&(b>0)){
            if (a>b) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        } else if ((b<0)||(a<0)) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
        int a = 10;
        int b = 30;
        if (a * 2 < b) {
            a = a * 3;
        }
        if (b < a) {
            b++;
        } else {
            a--;
        }
        int x = 64;
        int y = 0;
        while (x % 2 == 0) {
            y++;
            x = x / 2;
        }*/
        int x;
        for (x = 0;  x <= 7; x += 7) {
            System.out.println("H");
        }
        System.out.println(x);

        System.out.print("What is your name? ");
        String userName = input.nextLine();
        System.out.print("Do you want to have O for Odds or E for Evens? ");
        String playerRole = input.next();
        while (!playerRole.equalsIgnoreCase("E") && !playerRole.equalsIgnoreCase("O")) {
            System.out.print("Please select O for Odds or E for Evens! ");
            playerRole = input.next();
            // }
        }
        if (playerRole.equalsIgnoreCase("E")) {
            System.out.println("So, " + userName + ", you choosed to play with Evens! ");
        } else System.out.println("So, " + userName + ", you choosed to play with Odds! ");
        String quit = "";
        int i = 0;
        while (!quit.equalsIgnoreCase("Q")) {
            while (i != 1) {
                System.out.println("Lets play! Press any letter/number key to continue!");
                i++;
            }
            while (i > 0) {
                System.out.println("Lets play! Press Q to quit or any letter/number key to continue!");
                quit = input.next();
                if (quit.equalsIgnoreCase("Q")) {
                    break;
                }
                System.out.print("Give your number between 1 ... 5: ");
                Integer playerNumber = input.nextInt();
                Integer computerNumber = rand.nextInt(5) + 1;
                System.out.println("Computer guessed number: " + computerNumber);
                int sum = playerNumber + computerNumber;
                if (sum % 2 == 0) {
                    if (playerRole.equalsIgnoreCase("E"))
                        System.out.println("You win! Well done " + userName + " You entered number: " + playerNumber + " Computer calculated number: " + computerNumber + " The sum is: " + sum);
                    else
                        System.out.println("Computer won! Sorry! You entered number: " + playerNumber + " Computer calculated number: " + computerNumber + " The sum is: " + sum);
                } else if (playerRole.equalsIgnoreCase("E"))
                    System.out.println("Computer won! Sorry! You entered number: " + playerNumber + " Computer calculated number: " + computerNumber + " The sum is: " + sum);
                else
                    System.out.println("You win! Well done " + userName + " You entered number: " + playerNumber + " Computer calculated number: " + computerNumber + " The sum is: " + sum);
                System.out.println();
            }

        }
    }
}