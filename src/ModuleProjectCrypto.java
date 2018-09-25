import java.util.Scanner;

public class ModuleProjectCrypto {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Please give me a word!  ");
        String word=input.nextLine();
        //String word="This is some \\“really\\” great. (Text)!?”)";
        System.out.println(word.length());
        word=ModuleProjectCrypto.normalizeText(word);
        ModuleProjectCrypto.Oboetics(word);
    }

    public static String normalizeText(String word){
        int charFoundAtPlace;
        int wordLength;
        String firstPart;
        String secondPart;
        word=word.trim();
        wordLength=word.length();
        word=word.toUpperCase();
        for (int u=0;u<wordLength;u++){

            for (int i=0;i<wordLength;i++) {
                char taht = word.charAt(i);
                String otsitav = Character.toString(taht);
                boolean isItLetter = Character.isLetter(taht);
                if (!isItLetter) {
                    firstPart = word.substring(0, i);
                    secondPart = word.substring(i + 1);
                    word = firstPart + secondPart;
                    wordLength = word.length();
                    System.out.println("word is currently: " + word);

                }
            }
        }
                    System.out.println(word);
        return word;
    }

    public static String Oboetics(String word){
        String firstPart, secondPart;
        int wordLength=word.length();
        for (int i=0; i<word.length();i++){
            char taht=word.charAt(i);
            if (taht=='O'||taht=='A'||taht=='E'||taht=='I'||taht=='Ü'||taht=='U'||taht=='Ä'||taht=='Ö'||taht=='Õ'){
                firstPart=word.substring(0,i);
                secondPart=word.substring(i,wordLength);
                System.out.println("i= " + i + " first word is " + firstPart);
                System.out.println("i= " + i + " second word is " + secondPart);
                word=firstPart+"OB"+secondPart;
                wordLength=word.length();
                i=i+2;
                System.out.println(word);

            }
        }
        System.out.println(word);
        return word;
    }

}
