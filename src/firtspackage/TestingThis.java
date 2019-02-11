package firtspackage;

import java.util.*;

public class TestingThis {
    int first=5;

    int firstFirst(){
        int first =1;
        System.out.println("This value is "+this.first);
        System.out.println("First value is "+first);

        return first;
    }
    int times[]=new int[4];

    public void ArrayOfNumbers(){
        for (int i=0;i<4;i++){
            times[i]=i+2;
            System.out.print(times[i]+", ");
        }
        //return times;
    }
    public static void main(String[] args){
        TestingThis ts1=new TestingThis();
        ts1.firstFirst();
        int nums[]={1,2,-3};
        int max=nums[0],min=nums[0];
        for (int i=1;i<3;i++)  {
            if (nums[0]<nums[i]) {
                max=nums[i];
            }
            if (nums[0]>nums[i]){
                min=nums[i];
            }
        }
        System.out.println("Min is "+min);
        System.out.println("Max is "+max);
        ts1.ArrayOfNumbers();

        int list[]=new int[10];
        int numsNew[]={1,2,3};
        int table[][]={
                {4,5,6},
                {1,2,2,2,4,5},
                {7,8},
                {9,10,11,12}
        };
        System.out.println();
        System.out.println("Length of list is "+list.length);
        System.out.println("Length of Nums is "+numsNew.length);
        System.out.println("Length of table is "+table.length);
        System.out.println("Length of table[0] is "+table[0].length);
        System.out.println("Length of table[1] is "+table[1].length);
        System.out.println("Length of table[2] is "+table[2].length);
        System.out.println();

        for (int i=0;i<numsNew.length;i++){
            System.out.print(numsNew[i]+"; ");
        }


    }

}
