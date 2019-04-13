package Misc;

import java.util.*;

public class HashMaps {
    public static void main(String[] args) {
        MyKey key = new MyKey();
        Map<Integer, String> tree = new HashMap(2);
        tree.put(key.hashCode(), "birch");
        tree.put(2, "oask");
        tree.put(3, "sthng");
        tree.put(null, "you");

        System.out.println("get(1): " + tree.get(1));
        System.out.println("get(2): "+ tree.get(2));


        boolean valPresent = tree.containsKey(1);
        if (valPresent) {
            System.out.println("We have value 1!");
        } else {
            System.out.println("We do not have value 1!");
        }

        Set <Integer> keys=tree.keySet();
        System.out.println("Mapi võtmete arv: "+keys.size());
        System.out.println(keys.contains(1));
        keys.remove(2);
        System.out.println("Value at place 2 is: "+tree.get(2));

        Collection<String> values=tree.values();

        if (values.contains("birch")){
            System.out.println("Birch is in the list!");
        }
        Iterator it=keys.iterator();
        while (it.hasNext()){
            System.out.println("Key in interator: "+it.next());
        }
        Iterator itValue=values.iterator();
        while (itValue.hasNext()){
            System.out.println("Value in interator: "+itValue.next());
        }
    }
}