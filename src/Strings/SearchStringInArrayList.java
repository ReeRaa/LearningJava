package Strings;

import java.util.ArrayList;

public class SearchStringInArrayList {
    public static void main(String[] args) {
        String str = "Morning";
        ArrayList<String> myArray = new ArrayList<>();
        myArray.add("Hello");
        myArray.add("Morning");
        myArray.add("Yellow");

        //search for String in ArrayList
        for (String st : myArray) {
            if (st.equals(str)) {
                System.out.println("It contains the word!");
            }
        }
    }
}
