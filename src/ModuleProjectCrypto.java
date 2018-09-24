public class ModuleProjectCrypto {
    public static void main(String[] args){
        String word=" ti4!mbu!        *')  lim ps!!";
        System.out.println(word.length());
        ModuleProjectCrypto.normalizeText(word);
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
                word = word.replace('H', 'W');
                char taht = word.charAt(i);
                String otsitav = Character.toString(taht);
                boolean isItLetter = Character.isLetter(taht);
                System.out.println(isItLetter);

                if (!isItLetter) {
                    firstPart = word.substring(0, i);
                    System.out.println("i= " + i + " first word is " + firstPart);
                    secondPart = word.substring(i + 1);
                    System.out.println("i= " + i + " second word is " + secondPart);
                    // word=firstPart.concat(secondPart);
                    word = firstPart + secondPart;
                    wordLength = word.length();
                    System.out.println("word is currently: " + word);

                }
            }
        }
                    System.out.println(word);
        return word;
    }

}
