package NewPackage;

import java.math.BigDecimal;
import java.util.Formatter;

public class HelloWorld {
    public static void main(String[] args){
Sum();

    }
    public static void Sum(){
        double x;
        double y;
            x=1.6;
            y=0.3;
        BigDecimal a = new BigDecimal("0.6");
        BigDecimal b = new BigDecimal("0.3");
        BigDecimal c = a.add(b);
        System.out.println(x);
        System.out.println(y);
        System.out.println("Vastus: " + (x+y));
        System.out.println(c);
    }
}
