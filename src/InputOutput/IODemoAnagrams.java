package InputOutput;
import java.io.*;
import java.util.*;

public class IODemoAnagrams {

    static boolean isAnagram(String str1, String str2) {
        HashMap<Character, Integer> hmap1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hmap2 = new HashMap<Character, Integer>();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        //Mapping first string
        for (int i = 0; i < arr1.length; i++) {
            if (hmap1.get(arr1[i]) == null) {
                hmap1.put(arr1[i], 1);
            } else {
                // Integer c=(int)
            }
            if (hmap1.equals(hmap2)) {
                System.out.println("Strings are anagrams!");
            } else {
                System.out.println("Strings are not anagrams!");
            }
        }

        return true;
    }
}

