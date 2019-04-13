package Misc;

import java.util.logging.Level;

public class Dog extends Animal {

    @Override
    public void bark(){
        System.out.println(name+ ": Wow - wow!");
        System.out.println("Hop!");

    }
    public void move(){
        System.out.println("Hop!");
    }

    public enum Answer{
        YES (1),
        NO (2);

        int code;

        private Answer(int code){
            this.code=code;
        }
    }

    public enum level{
        HIGH(1),
        MEDIUM(2),
        LOW(3);

        private final int levelCode;

        level (int levelCode){
            this.levelCode=levelCode;
        }

        public int getLevelCode(){
            return levelCode;
        }
    }
    public static void main (String[] args){
        System.out.println(level.HIGH.levelCode);
        System.out.println(level.HIGH.getLevelCode());

        level level1=level.HIGH;
        System.out.println(level1);
        System.out.println(level1.getLevelCode());

        int[] nums={1,7,5,2,9};
        System.out.println(nums[1]);
        int[] numsSorted;

        //remove element 1
        int toBeRemoved=1;
        for (int i=toBeRemoved;i<nums.length;i++) {
            nums[i-1] = nums[i];
        }
        System.out.println(nums.toString());
    }

    int age;
}
