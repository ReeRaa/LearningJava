package LambdaExpression;

public class LambdaDemo {
    public static void main(String[] args) {
        MyValue myVal;
        myVal=()-> 27.7;
        System.out.println("Constant value is: "+myVal.getValue());

        MyParamvalue myParamvalue;
        myParamvalue=(n)-> n/2;

        System.out.println("Param value is: "+myParamvalue.getValue(7));
        System.out.println("Param value is: "+myParamvalue.getValue(16));

        AreEqual areEqual;
        areEqual=(x,y)-> (x==y);
        System.out.println(areEqual.areEqual(3,4));
        System.out.println(areEqual.areEqual(3,3));

        AreEqual lessThan;
        lessThan=(x,y)-> (x<y);
        System.out.println(lessThan.areEqual(4,7));
        System.out.println(lessThan.areEqual( 4,2));

        AreEqual greaterThan;
        greaterThan=(x,y) ->(x>y);
        System.out.println(greaterThan.areEqual(3,7));
        System.out.println(greaterThan.areEqual(3,2));

        StringsInLambda lmbdStr;
        lmbdStr= (a,b)->(a.equalsIgnoreCase(b));
        System.out.println(lmbdStr.compare("Ma","ma"));
        System.out.println(lmbdStr.compare("Ma","me"));
    }
}
