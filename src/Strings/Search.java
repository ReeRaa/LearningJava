package Strings;

import java.io.*;
import java.util.*;

public class Search {

    static String path = "C:\\Users\\reelyka.laheb\\IdeaProjects\\LearningJava\\LoeFailist.txt";

    public String findLongestWord() throws IOException {
        String longestWord="";
        String current="";
        ArrayList<String> blacklisted = new ArrayList<String>();
        ArrayList<String> candidates = new ArrayList<String>();

        Scanner scanner = new Scanner(new File(path));
        scanner.useDelimiter("[^A-Za-z]+");

        File f1 = new File(path); //Creation of File Descriptor for input file
        String[] words = null;  //Intialize the word Array
        FileReader fr = new FileReader(f1);  //Creation of File Reader object
        BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
        String s;
        int counter = 0;


        while (scanner.hasNext()) {
            current = scanner.next();
            if (current.length() >= longestWord.length()) {
                longestWord = current;
                //count Occurrences of this word
                counter=countOccurrences(longestWord);
                if (counter >=3) {
                    candidates.add(current);
                    System.out.println("We have a winner! The longest word that was counted at least 3 times is " + longestWord + ". It was counted " + counter + " times! It's length is: "+longestWord.length());
                }
            }
        }

//            System.out.println("longest word is " + longestWord);
//            System.out.println("counter is " + counter);
        System.out.println("Here are candidates!");
            for (String word:candidates){System.out.println(word);}

        //Find longest of candidates


        return current;
    }

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
           // System.out.println("Counter value is: " + counter);
        }
            return counter;
    }


        public static void main (String[]args) throws IOException {
            Search longestWord = new Search();
            String input = longestWord.findLongestWord();

         /*   if ((blacklisted.size()) != 0) {
                for (String item : blacklisted) {
                    if (current.matches(item)) {
                        System.out.println("Blaclisted word!");
                    } else if (current.length() > longestWord.length()) {
                        longestWord = current;
                        System.out.println("Longest word! !"+longestWord);
                    }

                }
            } else if (current.length() > longestWord.length()) {

                longestWord = current;
                System.out.println(longestWord);

                //System.out.println("\n" + longestWord + "\n");
            }
        }
            return longestWord;
                fr.close();*/
        }
    }

