package Inheritance;

public class DogDemo {
    public static void main(String[] args) {
        Schnautzer s1=new Schnautzer();
        s1.bark();
        s1.breedName="Schnautzer";
        s1.color="PS";
        s1.giveBreedName();
        s1.printColor();

        char[] charName={'a','b','c'};
        //Method 1. Use String constructor
        String name=new String(charName);
        System.out.println(name);
        //Method 2. Use mehods valueOf and copyValueOf
        String name2=String.valueOf(charName);
        System.out.println(name2);
        //Method 3. Use StringBuilder
/*        StringBuilder sb=new StringBuilder();
        for (char ch:sb){sb.append(ch);};
        String str=sb.toString();
        System.out.println(str);*/


    }
}
