import java.util.Scanner;
import java.util.Random;

public class PrepForOddsAndEvens {
    Scanner input = new Scanner(System.in);
    Random rand=new Random();

    void userSettings() {
        System.out.print("What is your name? ");
        String userName = input.nextLine();
        System.out.print("Do you want to have O for Odds or E for Evens? ");
        String playerRole = input.next();
        while (!playerRole.equals("E") && !playerRole.equals("O")) {
            System.out.print("Please select O for Odds or E for Evens! ");
            playerRole = input.next();
            // }
        }
        if (playerRole.equals("E")) {
            System.out.println("So, " + userName + ", you choosed to play with Evens! ");
        } else System.out.println("So, " + userName + ", you choosed to play with Odds! ");
        String quit = "";
        while (!quit.equals("Q") && !quit.equals("q")) {
            System.out.println("Lets paly! Press Q to quit or any letter/number key to continue!");
            quit = input.next();
            System.out.print("Give your number between 1 ... 5: ");
            Integer playerNumber = input.nextInt();
            Integer computerNumber = rand.nextInt(5) + 1;
            System.out.println("Computer guessed number: " + computerNumber);
            int sum = playerNumber + computerNumber;
            if (sum % 2 == 0) {
                if (playerRole.equals("E"))
                    System.out.println("You win! Well done " + userName + " You entered number: " + playerNumber + " Computer calculated number: " + computerNumber + " The sum is: " + sum);
                else
                    System.out.println("Computer won! Sorry! You entered number: " + playerNumber + " Computer calculated number: " + computerNumber + " The sum is: " + sum);
            } else if (playerRole.equals("E"))
                System.out.println("Computer won! Sorry! You entered number: " + playerNumber + " Computer calculated number: " + computerNumber + " The sum is: " + sum);
            else
                System.out.println("You win! Well done " + userName + " You entered number: " + playerNumber + " Computer calculated number: " + computerNumber + " The sum is: " + sum);
            System.out.println();
        }
    }
}