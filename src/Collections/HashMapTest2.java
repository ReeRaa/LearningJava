package Collections;
import java.util.*;

public class HashMapTest2 {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        //initial set;
        System.out.println("Initial set: "+hm);

        //put some elements
        hm.put("Tere",1);
        hm.put("Hallo",2);
        System.out.println("With some elements: "+hm);

        //some elements with for cycle
        for(String str:hm.keySet()){
            System.out.println(str);
        }

        for(Map.Entry me:hm.entrySet()){
            System.out.println(me.getKey()+" "+me.getValue());
        }
    }
}
