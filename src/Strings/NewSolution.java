package Strings;
import java.io.*;
import java.util.*;

public class NewSolution {

    static String path = "C:\\Users\\reelyka.laheb\\IdeaProjects\\LearningJava\\LoeFailist.txt";

    public void findLongestWord() throws IOException {
       // final Map<String, Integer> longestWordMap = new LinkedHashMap<>();

        String longestWord = "";
        String current = "";
        Scanner scanner = new Scanner(new File(path));
        scanner.useDelimiter("[^A-Za-z]+");
        int counter;
        int maxLength = 0;

        List<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            current = scanner.next();
            words.add(current);
            if (current.length() > longestWord.length()) {
                longestWord = current;
                maxLength = longestWord.length();
            }
        }
        System.out.println("Max length is:" + maxLength); //how long is the longest word in file
        //with countdown find the longest word with min 3 occurrences
        longestWord = startFromLongest(words, longestWord.length());
        System.out.println(String.format("FINAL RESULT: length = %d, word = %s", longestWord.length(), longestWord));
        System.out.println("Longest word with min 3 occurrences is: " + longestWord);
    }

    //start to search beginning from longest
    public String startFromLongest(List<String> words, int maxLength) throws IOException {
        String searchable = "";
        for (int i = maxLength; i > 0; i--) {
            for (String current : words) {
                if (current.length() == i) {
                    if (countOccurrences(words, current) > 3) {
                       // break;
                    } else {
                        return current;
                    }
                }
            }
        }

        System.out.println("output: " + searchable);
        return searchable;
    }

    //The counter
    public int countOccurrences(List<String> words, String word) throws IOException {
        int counter = 0;

        for (String current : words) {
            if (current.contentEquals(word)) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) throws IOException {
        Search longestWord = new Search();
        longestWord.findLongestWord();

    }
}