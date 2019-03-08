package Strings;

import java.io.*;
import java.util.*;

public class Search {

    static String path = "C:\\Users\\reelyka.laheb\\IdeaProjects\\LearningJava\\LoeFailist.txt";

    public void findLongestWord() throws IOException {
        String longestWord = "";
        String current = "";
        Scanner scanner = new Scanner(new File(path));
        scanner.useDelimiter("[^A-Za-z]+");
        int counter;
        int maxLength = 0;

        while (scanner.hasNext()) {
            current = scanner.next();
            if (current.length() > longestWord.length()) {
                longestWord = current;
                maxLength = longestWord.length();
            }
        }
        System.out.println("Max length is:" + maxLength); //how long is the longest word in file
        //with countdown find the longest word with min 3 occurrences
        longestWord = startFromLongest(longestWord.length());
        System.out.println("FINAL RESULT: "+longestWord);//for control
        System.out.println("Longest word with min 3 occurrences is: "+ longestWord);
    }

    //start to search beginning from longest
    public String startFromLongest(int maxLength) throws IOException {
        String searchable = "";
        String current = "";
        File f1 = new File(path);
        Scanner scanner = new Scanner(new File(path));
        scanner.useDelimiter("[^A-Za-z]+");
        int counter = 0;

        for (int i=maxLength; i>0;i--) {
            while (scanner.hasNext()) {
                current = scanner.next();
                if (current.length() == i) {
                    counter = countOccurrences(current);
                    if (counter > 3) {
                        System.out.println("Longest word is found with more than 3 occurrences: " + current);
                        System.out.println(" Counter value: " + counter);
                        searchable = current;
                    } else {
                        System.out.println("Not as many occurences as needed! Word: " + current + " counter: " + counter);
                    }
                }
            }
        }
        System.out.println("output: "+searchable);
        return searchable;
    }

    //The counter
    public int countOccurrences(String word)throws IOException {
        int counter = 0;
        String current;

        Scanner scanner = new Scanner(new File(path));
        scanner.useDelimiter("[^A-Za-z]+");

        while (scanner.hasNext()) {
            current = scanner.next();
            if (current.equals(word)) {
                counter++;
            }
        }
            return counter;
    }

        public static void main (String[]args) throws IOException {
            Search longestWord = new Search();
            longestWord.findLongestWord();

        }
    }