package LambdaExpression;

public class MyTestLambda{
    public static void main(String[] args) {
        MyTestInterface mty;
        mty= (n) -> (n/2.00);
        System.out.println(mty.divideByTwo(7));

        MyTestTwoParam mtp;
        mtp= (x,y) -> (x/y);
        System.out.println(mtp.divdeNumbers(7.0,8.0));
        System.out.println(mtp.divdeNumbers(19.0,8.0));
    }
}
