package Strings;
import java.util.Arrays;

public class CapitalzeEachWord {
    public static void main(String[] args) {
        String str="this is me";
        String[] splitedString=str.split("\\s");
        String[] changedCase=new String[splitedString.length];
        String helper;
        String titleString;
        char ch;

        for (int i=0;i<splitedString.length;i++){
            ch=splitedString[i].toUpperCase().charAt(0);
            helper=splitedString[i].substring(1).toLowerCase();
           changedCase[i]=ch+helper;
        }
        titleString=String.join(" ",changedCase);

        System.out.println(titleString);

        //better solution
        String input="hello my fiRst year at school";
        String[] splitedInput=input.split("\\s");
        String titleResult="";
        for (String s:splitedInput){
         //   titleResult=titleResult+s.substring(0,1).toUpperCase() +s.substring(1).toLowerCase()+" ";
            titleResult+=s.substring(0,1).toUpperCase() +s.substring(1).toLowerCase()+" ";
        }
        System.out.println(titleResult);

    }
}
