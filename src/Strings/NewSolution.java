package Strings;
import java.io.*;
import java.util.*;

public class NewSolution {

    static File file = new File("C:\\Users\\reelyka.laheb\\Desktop\\Java\\VabaTekst.txt");
    static int maxLength;
    static String theWord="";
    final String trialWord="happy";
    final int occurrences=3;

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
          NewSolution ns = new NewSolution();
          String readWord="";
          int wordLength;
          int count = 0;
          System.out.println("Initial i value is "+strLength);
          for (int i = strLength; i > 0; i--) {
              System.out.println("i väärtus selles tsüklis "+i);
              int nr=0;
              Scanner sc = new Scanner(file);

              while (sc.hasNextLine()) {
           //   System.out.println("while cycle beginning count: "+nr++);
              readWord = sc.next();
              wordLength=readWord.length();
              System.out.println(readWord+" "+wordLength);
              //get readWord length

                  if (readWord.length() == i) {

                      System.out.println("WORD in IF is: "+readWord);
                      count = ns.countOccurrences(readWord);
                      if (count >= occurrences) {
                          theWord=readWord;
                          System.out.println("Longest readWord with at least "+occurrences+" occurrences is " + theWord + " with " + count + " occurrences.");
                          break;
                      }
                  }else{
                     // System.out.println("else cycle, readWord is "+readWord);
                  }
                  System.out.println("i value at the end is "+i);
                 // break;

              }
              System.out.println("i value outside while cycle at the end is "+i);

             // break;
          }
          System.out.println("The Word is: "+theWord);
          return theWord;
      }

        //The counter
        public int countOccurrences(String str)throws IOException{
            int counter = 0;
            Scanner sc=new Scanner(file);

            while(sc.hasNext()){
                if (sc.next().equalsIgnoreCase(str)){
                    counter++;
                }
            }
            System.out.println("Word: "+str+"; counts: "+counter);
            return counter;
        }

    public static void main(String[] args) throws IOException {
        NewSolution ns=new NewSolution();
        //ns.countOccurrences("happy");

        int maximumLength= ns.longestWordLength();
        String tWord=ns.searchingLongestWord(maximumLength);
        //System.out.println("The Word is: "+tWord);


    }
}