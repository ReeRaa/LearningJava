package csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVscanner {

    public static void main(String[] args) {
        List<String> records = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("C:\\Users\\reelyka.laheb\\IdeaProjects\\LearningJava\\src\\csv\\read_in.csv"))) {
            String line;
            while (scanner.hasNextLine()) {
                records.add(scanner.useDelimiter(",").next());
            }
        } catch (FileNotFoundException exc) {
            System.out.println(exc.getStackTrace());
        }
        for (String str : records) {
            System.out.println(str);
        }

        for (String str : records) {
            if (str.contains("23")) {
                System.out.println("We found it! " + str);
            }
        }
            System.out.println();
            String s = "Seene metsad seene poosad seene talud";
            Scanner scanner = new Scanner(s);

            System.out.println(scanner.findInLine("seene"));
            System.out.println(scanner.next());

            int maximum = 3;
            int[] numbers = new int[maximum];
            int value;
            Scanner scanInt = new Scanner(System.in);

            for (int i = 0; i < maximum; i++) {
                System.out.print("give a number: ");
                if (scanInt.hasNextInt()) {

                    int num = scanInt.nextInt();
                    numbers[i] = num;
                } else {
                    System.out.println("please give numbers! restart a program!");
                    return;
                }

            }
            for (int n : numbers) {
                System.out.println(n);
            }
            scanInt.close();
            scanner.close();
        }

}