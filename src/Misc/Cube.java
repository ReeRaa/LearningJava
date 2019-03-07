package Misc;
/**@author Reelyka*/
public class Cube {

    static {System.out.println("Hello!");};

    /**@return*/
    static int calculate(int x){
        return x*x*x;
            }

    public static void main(String[] args){
        char a=1199;
        char b='X';
        int result=Cube.calculate(5);
        System.out.println(result);
        System.out.println(a+" "+b);
    }
}
