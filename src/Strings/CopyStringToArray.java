package Strings;

public class CopyStringToArray {
    public static void main(String[] args) {
        String str="Welcome home!";

        char[] ch=new char[str.length()];

        try{
            str.getChars(0,str.length(),ch,0);
            System.out.println(ch);
        }catch (Exception ex){System.out.println(ex);}

        
    }
}
