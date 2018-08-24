import java.util.Random;

public class PeaKlass {
    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static void main(String args[])
        throws java.io.IOException{
        //Random suvaline= new Random();
        //int minuArv= suvaline.nextInt();

        int minuarv= getRandomNumberInRange(1,9);
        System.out.println("suvaline number on "+minuarv);

        System.out.println("Arva ära, mis nr peale ma mõtlen vahemikus 1...9");
        //System.out.print("Sisesta palun arv ja vajuta Enter klahvile ");
        int inChar;
        System.out.println("Enter a Character:");
            inChar = System.in.read();
            System.out.print("You entered ");
            System.out.println(inChar);

        /*Integer vastajaArv= System.in.read();
        System.out.println("Vastaja arv on "+vastajaArv);

        if (vastajaArv==minuarv) System.out.println("Arvasid ära! Tubli!");
        else {
            System.out.println("Kahjuks ei läinud täppi!");
            System.out.print("Minu mõeldud arv "+minuarv);
            if (vastajaArv<minuarv) System.out.println(" oli sinu pakutud arvust suurem");
            else System.out.println( " oli sinu pakutud arvust väiksem");
            //System.out.println(ch);
        }

       /* char ch, answer='K';
        System.out.println("Anna täht A ja Z vahel");
        ch=(char)System.in.read();
        if (ch==answer) System.out.println("Õige!");
        else if
            (ch< answer) System.out.println(" Liiga madal!");
            else System.out.println("Liiga kõrge!");
*/

    }

}

/*
// Demonstrate if-else-if statements.
class IfElse {
    public static void main(String args[]) {
        int month = 4; // April
        String season;
        if(month == 12 || month == 1 || month == 2)
            season = "Winter";
        else if(month == 3 || month == 4 || month == 5)
            season = "Spring";
        else if(month == 6 || month == 7 || month == 8)
            season = "Summer";
        else if(month == 9 || month == 10 || month == 11)
            season = "Autumn";
        else
            season = "Bogus Month";
        System.out.println("April is in the " + season + ".");

    }
    */
