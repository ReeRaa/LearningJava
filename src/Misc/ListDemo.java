package Misc;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Bob");

        Iterator it = names.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(42);
        nums.add(10);
        nums.add(7);
        Iterator itNums = nums.iterator();
        while (itNums.hasNext()) {
            System.out.println(itNums.next());
        }

        Set<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(2);
        intSet.add(32);
        intSet.add(5);
        intSet.add(372);
        Iterator setIterator = intSet.iterator();
        Object value;
        while (setIterator.hasNext()) {
            value = setIterator.next();
            if (value.equals(1))
                System.out.println(value);
        }
        System.out.println("for-each loop");
        for (Object o : intSet) {
            System.out.println(o.toString());
        }
        System.out.println("for-each loop");
        for(Object o:nums){
            System.out.println(o.toString());
        }
    }
}
