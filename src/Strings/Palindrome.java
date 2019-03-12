package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String initialString="Tere tere vana kere";
        String palindromeString;
        char[] initialInChar=new char[initialString.length()];
        char[] palindromeChar=new char[initialString.length()];

        for (int i=0;i<initialString.length();i++){
            initialInChar[i]=initialString.charAt(i);
            palindromeChar[initialString.length()-i-1]=initialInChar[i];
        }

        palindromeString=new String(palindromeChar);
        System.out.println("Palindrom String: "+palindromeString);
        String word=new String(initialInChar);
        System.out.println("Original String: "+word);

        //Other string manipulayin stuff
        String quote="ad grew more level, and we appeared\n" +
                "to fly along. Then the mountains seemed to come nearer to us on each\n" +
                "side and to frown down upon us; we were entering on the Borgo Pass. One\n" +
                "by one several of the passengers offered me gifts, which they pressed\n" +
                "upon me with an earnestness which would take no denial; these were\n" +
                "certainly of an odd and varied kind, but each was given in simple good\n" +
                "faith, with a kindly word, and a blessing, and that strange mixtu";
        int exc=quote.indexOf("me");
        System.out.println(exc);


        String fs=String.format("tere: " +
                "uus");
        System.out.println(fs);

        String s1="tere";
        System.out.println(fs);

        String s2="tere";
        String s3="tere";

        System.out.println(s1);

        System.out.println(String.format("%3$d%2$s%1$d",32," Hello ",45));

        int age=10;
        int myAge=3*age;
        String fname="Mia";
        String lname="Strawberry";


        System.out.println(String.format("%3$d%2$s%1$d",age," Hello ",myAge));
        System.out.println(String.format("%d",32));
        System.out.println(String.format("|% d|",93));
        System.out.println(String.format("|% d|",-22));
        System.out.println(String.format("% d",-22));
        System.out.println(String.format("%d",-22));
        System.out.println(String.format("|%s|","Hello"));
        System.out.println(String.format("|%15s|","Hello"));
        System.out.println(String.format("|%10s|","Hello"));

        System.out.print(String.format("|%15s|","First name"));
        System.out.print(String.format("%15s|","Last name"));
        System.out.println();
        System.out.print(String.format("|%15s|",fname));
        System.out.print(String.format("%15s|",lname));
        System.out.println();

        System.out.print(String.format("|%-15s|","First name"));
        System.out.print(String.format("%-15s|","Last name"));
        System.out.println();
        System.out.print(String.format("|%-15s|",fname));
        System.out.print(String.format("%-15s|",lname));
        System.out.println();
        System.out.println();
        System.out.print(String.format("%-15.2s|",lname));

    }
}
