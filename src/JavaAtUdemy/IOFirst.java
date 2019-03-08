package JavaAtUdemy;

import java.util.*;

public class IOFirst {
    public static void main(String[] args) {

        String string = "esimene.teine.kolmas";
        Scanner scanner = new Scanner(string);
        scanner.useDelimiter("\\.");
        String searchable;
        String foundIt="teine";
        while (scanner.hasNext()){
            searchable=scanner.next();
            if (searchable.equals(foundIt)) {
                System.out.println("Match! I found it! " + searchable);
            }
            //else
            //System.out.println("Not found! " + searchable);

        }


        scanner.close();
/*
        int x=89;
        int y=0;
        System.out.println(divideLBLY(x,y));
        System.out.println(divideEAFP(x,y));
      //  System.out.println(divide(x,y));

        int x=getInt();
        System.out.println("x is "+x);
*/


    }
    private static int getInt(){
        Scanner s=new Scanner(System.in);
        return s.nextInt();
    }
    private static int divideLBLY(int x,int y){
        if(y!=0){
            return x/y;
        }else {
            return 0;
        }
    }
    private static int divideEAFP(int x,int y){
        try{
            return x/y;
        }catch (ArithmeticException e){
            return 0;
        }
    }
    private static int divide(int x,int y){
        return x/y;
    }
}
