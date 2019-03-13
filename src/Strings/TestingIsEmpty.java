package Strings;

public class TestingIsEmpty {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "Hello";
        String s3 = "World";
        String s4 = "Today";

        if (s1.isEmpty()) {
            System.out.println("String is empty!");
        } else {
            System.out.println(s1);
        }
        if (s2.isEmpty()) {
            System.out.println("String is empty!");
        } else {
            System.out.println(s2);
        }
        String newString = String.join(":", s2, s3, s4, "Me");
        System.out.println(newString);

        //remove all whitespace
        String s5 = "Some   long   text with   birds";
        String s6 = s5.replaceAll("\\s", "");
        System.out.println(s6);

        String s7 = "   Horse         Cow\n\n   \r Camel \t\t Sheep \n Goat        ";
        String s8 = s7.replaceAll("\\s", "");
        System.out.println(s7);
        System.out.println(s8);

        String s9 = "Here, we are passing split limit as a second argument to this function. This limits the number of splitted strings.\n" +
                "\n";
        String[] s10 = s9.split("\\s", 5);
        for (String str : s10) {
            System.out.println(str);
        }

        String s11 = "hei ";
        String s12 = "world";
        s11 = s11.concat(s12);
        System.out.println(s11);

        StringBuffer s13 = new StringBuffer("wow");
        StringBuffer s14 = new StringBuffer("yay");
        s13.insert(1, s12);
        System.out.println(s13);

        StringBuffer s15 = new StringBuffer(s12);
        s15 = s15.reverse();
        System.out.println(s15);

        // char[] chResult=new char[s12.length()];
        char[] palindr = s12.toCharArray();
        char[] palindr2 = new char[s12.length()];
        for (int i = 0; i < palindr.length; i++) {
            palindr2[palindr.length - 1-i] = palindr[i];
        }
        String finaale = new String(palindr2);
        System.out.println(finaale);
        for (char ch : palindr2) {
            System.out.println(ch);
        }
    }
}
