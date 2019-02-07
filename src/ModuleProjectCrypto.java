import java.util.Scanner;

public class ModuleProjectCrypto {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Please give me a word!  ");
        String word=input.nextLine();
        word=ModuleProjectCrypto.normalizeText(word);
        word=ModuleProjectCrypto.obify(word);
        ModuleProjectCrypto.unobify(word);
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
                }
            }
        }
                    System.out.println(word);
        return word;
    }

    public static String obify(String word){
        String firstPart, secondPart;
        int wordLength=word.length();
        for (int i=0; i<word.length();i++){
            char taht=word.charAt(i);
            if (taht=='O'||taht=='A'||taht=='E'||taht=='I'||taht=='Ü'||taht=='U'||taht=='Ä'||taht=='Ö'||taht=='Õ'){
                firstPart=word.substring(0,i);
                secondPart=word.substring(i,wordLength);
                word=firstPart+"OB"+secondPart;
                wordLength=word.length();
                i=i+2;
            }
        }
        System.out.println(word);
        return word;
    }

    public static String unobify(String word){
        String firstPart, secondPart;
        int wordLength=word.length();
        for (int i=0;i<wordLength-1;i++){
            char taht=word.charAt(i);
            char tahtSecond=word.charAt(i+1);
            if (taht=='O'){
                if (tahtSecond=='B'){
                    firstPart=word.substring(0,i);
                    secondPart=word.substring(i+2,wordLength);
                    word=firstPart+secondPart;
                    System.out.println("i= " + i + " first word is " + firstPart);
                    System.out.println("i= " + i + " second word is " + secondPart);
                    System.out.println("word is currently: " + word);
                    wordLength=word.length();
                }

            }
           // wordLength=word.length();

        }
        System.out.println(word);

        return word;
    }

}
