package Strings;
import java.util.Scanner;
import java.io.*;

public class LongestWord {
    static String path = "C:\\Users\\reelyka.laheb\\IdeaProjects\\LearningJava\\LoeFailist.txt";
      /*
    public String findLongestWords() throws IOException {
        String longestWord = "";
        String current;

        Scanner sc = new Scanner(new File(path));

        while (sc.hasNext()) {
            current = sc.next();
            if (current.length() > longestWord.length()) {
                longestWord = current;
            }
        }
        //System.out.println("\n" + longestWord + "\n");
        return longestWord;
    }


    public static void main(String[] args) throws IOException {
 new LongestWord().findLongestWords();

        File f1 = new File(path);
        String[] words = null;
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        String str;
        LongestWord longestWord = new LongestWord();
        String input = longestWord.findLongestWords();

        System.out.println("Longest word candidate is " + input);

        int counter = 0;

        while ((str = br.readLine()) != null) {
            words = str.split(" ");
            for (String word : words) {
                if (word.equals(longestWord)) {
                    counter++;
                    System.out.println(counter+"tere");
                }
            }

        }
        if (counter != 0) {
            System.out.println("This word exists so many times in file: " + counter);
        }
        fr.close();


    }*/
    }
