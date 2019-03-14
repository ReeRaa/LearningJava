package Strings;

public class ReverseEachWord {

    public static void reverseWords(String input){
        String[] splittedInput=input.split("\\s");
        StringBuilder sb;

        String output="";
        int len=splittedInput.length;

        for (int i=0;i<len;i++){
            sb=new StringBuilder(splittedInput[i]);
            sb=sb.reverse();
            output+=sb.toString()+" ";
            //System.out.println(sb);
            }
        System.out.println(output.trim());
        }

    public static void main(String[] args) {
        ReverseEachWord.reverseWords("My little pony");
    }
}
