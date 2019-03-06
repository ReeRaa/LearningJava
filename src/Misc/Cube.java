package Misc;

public class Cube {

    static {System.out.println("Hello!");};
    static int calculate(int x){
        return x*x*x;
            }

    public static void main(String[] args){
        int result=Cube.calculate(5);
        System.out.println(result);
    }
}
