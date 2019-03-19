package Portfolio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FindLongestWordWith3occurrences {

        static File file = new File("C:\\Users\\reelyka.laheb\\Desktop\\Java\\RaamatuTekst.txt");
        static int maxLength;
        static String theWord="";
        final String trialWord="happy";
        static final int occurrences=3;

        public int longestWordLength() throws IOException {

            String longestWord = "";
            String currentWord = "";
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[^A-Za-z]+");
            int maxLength = 0;

            while (scanner.hasNext()) {
                currentWord = scanner.next();
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
            }
            maxLength = longestWord.length();

            System.out.println("Max length for longest word can be: " + maxLength); //how long can be the longest word in file
            return maxLength;
        }

        //search the word,  with at least 3 occurrences beginning countdown from max length
        public String searchingLongestWord(int strLength) throws IOException {
            FindLongestWordWith3occurrences ns = new FindLongestWordWith3occurrences();
            String readWord="";
            int count = 0;
            for (int i = strLength; i > 0 && theWord==""; i--) {
                int nr=0;
                Scanner sc = new Scanner(file);
                sc.useDelimiter("[^a-zA-Z]+");

                while (sc.hasNext() && theWord=="") {
                    readWord = sc.next();

                    if (readWord.length() == i) {
                        System.out.print("WORD in IF is: \""+readWord);
                        count = ns.countOccurrences(readWord);
                        System.out.println("\" with count of: "+count);
                        if (count >= occurrences) {
                            theWord=readWord;
                            System.out.println("Longest readWord with at least "+occurrences+" occurrences is \"" + theWord + "\" with " + count + " occurrences.");
                            break;
                        }
                    }
                }
                sc.close(); //close the scanner
            }
            return theWord;
        }

        //The counter
        public int countOccurrences(String str)throws IOException{
            int counter = 0;
            Scanner sc=new Scanner(file);
            sc.useDelimiter("[^a-zA-Z]+");

            while(sc.hasNext()){
                if (sc.next().equalsIgnoreCase(str)){
                    counter++;
                }
            }
            return counter;
        }

        public static void main(String[] args) throws IOException {
            FindLongestWordWith3occurrences ns=new FindLongestWordWith3occurrences();
            int maximumLength= ns.longestWordLength();
            String tWord=ns.searchingLongestWord(maximumLength);
            System.out.println("The non case-sensitive word with at least "+ occurrences+ " occurrences is: "+ tWord.toUpperCase());
        }
}
