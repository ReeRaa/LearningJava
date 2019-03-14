package Strings;

public class ToggleCases {
    public static String toggler(String str){
        String[] splittedStr=str.split("\\s");
        String toggled="";
        for (String s:splittedStr){
            toggled+=s.toLowerCase().charAt(0)+s.toUpperCase().substring(1)+" ";
        }
        System.out.println("Toggled word is: "+toggled);
        return toggled;
    }


    public static void toggleAndReverse(String str){
        StringBuilder sb;
        String toggledString=toggler(str);
        String[] splittedAndToggled=toggledString.split("\\s");
        String output="";

        for (String s:splittedAndToggled){
            sb=new StringBuilder(s);
            sb=sb.reverse();
            output+=sb+" ";
        }
        System.out.println("Toggled and reversed word is: "+output);

    }

    public static void main(String[] args) {
        ToggleCases.toggleAndReverse("See on Minu Töö");

    }
}
