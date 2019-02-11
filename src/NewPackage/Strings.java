package NewPackage;

import java.util.HashMap;

public class Strings {
    public static void main(String[] args){
        String word= "Hello world";
        String word2= " Hello world   ";

        int number=4321;
        int wordToHash=word.hashCode();
        System.out.println(wordToHash);
        System.out.println(word2);

        System.out.println(word2.trim());

    }
}
