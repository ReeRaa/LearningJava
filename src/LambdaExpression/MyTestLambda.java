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

        MyTestBoolean mtb;
        mtb= (x) -> (x% 3== 0);
        System.out.println(mtb.test(10));
        System.out.println(mtb.test(9));

        MyTestBoolean mtb2;
        mtb2 = (x) -> ((x+2)< x);
        System.out.println(mtb2.test(-7));
        System.out.println(mtb2.test(8));

        MyTestStrings stringsAreEqual;
        stringsAreEqual = (x,y) -> (x.equals(y));
        System.out.println(stringsAreEqual.test("tere","tere"));
        System.out.println(stringsAreEqual.test("tere","tore"));

        MyTestStrings oneStringInAnother;
        oneStringInAnother = ((x, y) -> (x.indexOf(y) != -1));
        System.out.println("alahulga võedlus: "+ oneStringInAnother.test("Tulerebase aasta","aasta"));
        System.out.println(oneStringInAnother.test("Tulerebase aasta","töö"));

        //ruutvorrandi test
        System.out.println("Ruutvorrandi test");
        Ruutvorrand vorrand;
        vorrand = (x, y, z) -> ((x*x)+(y*y)  != (z* z));
        System.out.println(vorrand.test(4,5,6));
        System.out.println(vorrand.test(1,2,3));

        System.out.println("find z");
        TwoInts twoInts = (x, y) -> Math.sqrt((x*x)+(y*y));
        System.out.println(twoInts.test( 2,7));

        //try block lambda
        System.out.println("Block lambda");
        OneInt blocLambda = (x) -> {
            int result=0;
            for (int i=0;i < x;i++){
                result += x;
            }

            return result;
        };
        System.out.println(blocLambda.test(5));

        System.out.println("Test generics");
        TestGeneric<Integer> gen= (x,y) -> (x%y == 0);
        System.out.println(gen.test(2,3));
    }
}
