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
                records.add(scanner.nextLine());
            }
        } catch (FileNotFoundException exc) {
            System.out.println(exc.getStackTrace());
        }
        for (String str:records) {
            System.out.println(str);
        }
        System.out.println();
        String s="Seene metsad seene poosad seene talud";
        Scanner scanner=new Scanner(s);

        System.out.println(scanner.findInLine("seene"));
        System.out.println(scanner.next());

    }
}
