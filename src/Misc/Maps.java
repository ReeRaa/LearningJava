package Misc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps {
    String toyname;
    int keyValue;
    String toyName;

    //get a toy
    public void getToy(){
        getToyName();
    }


    //get keyValue
    public int getKeyValue(){
        Scanner in=new Scanner(System.in);
        System.out.print("Please give toy keynumber: ");
        keyValue=in.nextInt();
        return keyValue;
    }

    //get toy name
    public void getToyName(){

        keyValue=getKeyValue();
        this.keyValue=keyValue;

        Object aToy=(String)generateToyMap().getOrDefault(keyValue,"No such value in DB");
        toyName= aToy.toString();
        System.out.println("Selected code: "+keyValue+" corresponds to toy: "+toyName);
    }

    //toy list
    public Map generateToyMap(){
        Map mapOfToys=new HashMap();
        mapOfToys.put(1,"lego");
        mapOfToys.put(2,"car");
        mapOfToys.put(3,"doll");

        return mapOfToys;
    }
}
