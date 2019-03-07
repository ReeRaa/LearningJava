package Strings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Search {

    static String path = "C:\\Users\\reelyka.laheb\\IdeaProjects\\LearningJava\\LoeFailist.txt";

    public String findLongestWord(ArrayList<String> blacklistedWords) throws IOException {
        String longestWord = "";
        String current;

        Scanner sc = new Scanner(new File(path));

        while (sc.hasNext()) {
            current = sc.next();
            if ((blacklistedWords.size()) != 0) {
                for (String item : blacklistedWords) {
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
    }




        public static void main (String[]args) throws IOException {
            Search longestWord = new Search();
            ArrayList<String> blacklisted = new ArrayList<String>();
            String input = longestWord.findLongestWord(blacklisted);
            File f1 = new File(path); //Creation of File Descriptor for input file
            String[] words = null;  //Intialize the word Array
            FileReader fr = new FileReader(f1);  //Creation of File Reader object
            BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
            String s;

            int count = 0;

            while ((s = br.readLine()) != null && count<3) {
                words = s.split(" ");
                for (String word : words) {
                    if (word.equals(input)) {
                        count++;
                    }
                }
            }


            if (count < 3)  //Check for count not equal to zero
            {
                blacklisted.add(input);
                System.out.println("The given word " + input + " is present less than 3 times (" + count + ") in the file");
                for (String item:blacklisted){System.out.println("Blacklisted "+item);}

            } else {
                System.out.println(input);
                System.out.println("Found the word " + input + "  which is  present more than 3 times in the file: "+count);
                for (String item:blacklisted){System.out.println("Blacklisted "+item);}
            }

            fr.close();
        }
    }
