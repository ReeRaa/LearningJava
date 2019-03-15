package Collections;
import java.util.HashMap;

public class HasMapTest {
    public static void main(String[] args) {
        HashMap<String, String> capitalCitites = new HashMap<String, String>();
        HashMap<Integer, String> capitalNumbers = new HashMap<Integer, String>();
        capitalCitites.put("Estonia", "Tallinn");
        capitalCitites.put("Finland", "Helisinki");
        System.out.println(capitalCitites);

        for (String str : capitalCitites.keySet()) {
            System.out.println(str);
        }
        for(String str:capitalCitites.values()){
            System.out.println(str);
        }

        capitalNumbers.put(1, "Tallinn");
        capitalNumbers.put(2, "Helisinki");
        System.out.println(capitalNumbers);

        for (int i : capitalNumbers.keySet()) {
            System.out.println(i);
        }
        for(String str:capitalCitites.values()){
            System.out.println(str);
        }

        capitalCitites.remove("Estonia");
        for (String str : capitalCitites.keySet()) {
            System.out.println(str);
        }
        for(String str:capitalCitites.values()){
            System.out.println(str);
        }
        System.out.println();
        String s1=capitalCitites.get("Finland");
        System.out.println(s1);
    }
}
