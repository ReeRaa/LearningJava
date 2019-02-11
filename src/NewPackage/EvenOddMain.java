package NewPackage;

public class EvenOddMain {
    public static void main(String args[]){
        EvenOdd number=new EvenOdd();
        int num = number.readInAnswer();
        number.isEven(num);

        //Run Days in month
    DaysInMonth days=new DaysInMonth();
    days.days(num);

    //Run char reg:
String word= days.readInAChar();
days.checkIfMatch(word);

    }
}
