
public class TestingDebugging {
    public static void main(String args[]) {
        /*int i, k;
        //alt üles
        for (i = 0; i < 9; i++) {
            System.out.println();
            for (k = i; k < 9; k++) {
                System.out.print("*");
            }
        }

        //Ülevalt alla
        for (i = 9; i > 0; i--) {
            System.out.println();
            for (k = i; k < 9; k++) {
                System.out.print("*");
            }
        }
        */
        System.out.println();
        ParameetrigaMeetod param1 = new ParameetrigaMeetod();
        ParameetrigaMeetod param2 = new ParameetrigaMeetod();
        ParameetrigaMeetod param3 = new ParameetrigaMeetod();

        param1.width=22;
        param1.length=3;
        param2.width=22;
        param2.length=4;
        System.out.println("Area  = " + param1.calculatedArea());
        if (param1.calculatedArea()>param2.calculatedArea()) System.out.println("Area1 is bigger than Area 2");
        else System.out.println("Area2 is bigger than Area 1");

        //parameter casting
        System.out.println("Area  = " + param3.calcParam(11,4));

    }
}
