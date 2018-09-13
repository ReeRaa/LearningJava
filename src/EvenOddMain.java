public class EvenOddMain {
    public static void main(String args[]){
        EvenOdd number=new EvenOdd();
        int num = number.readInAnswer();
        number.isEven(num);
    }
}
