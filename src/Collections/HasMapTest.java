package Collections;
import java.util.HashMap;

public class HasMapTest {
    static HashMap<String,Integer> liste=new HashMap<String, Integer>();

    public static void addToListe(String str){
        Integer len=str.length();
        liste=new HashMap<String, Integer>();
        liste.put(str,len);
        System.out.println(liste);
    }

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
        String s10="Hello";
        HasMapTest.liste.put(s10,s10.length());
        HasMapTest.addToListe("Hello");
       // System.out.println(liste);
        HashMap<String,Integer> newMap=new HashMap<String,Integer>();
        newMap.put("Tere",1);
        System.out.println(newMap.getOrDefault("Tere",5));
        System.out.println(newMap.getOrDefault("Vaikimisi",5));
    }
}
