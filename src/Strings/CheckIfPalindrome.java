package Strings;

public class CheckIfPalindrome {
    public static void main(String[] args) {
        //word is palindrome, if it is same after reverse
        String str = "Mee";
        StringBuffer palindr = new StringBuffer(str);
        palindr=palindr.reverse();
        String palindr2 = new String(palindr);
        if (str.equalsIgnoreCase(palindr2)) {
            System.out.println("This word is a palindrome!");
        } else {
            System.out.println("This word is not a palindrome!");
        }
    }
}
