
public class TestingDebugging {
    public static void main(String args[]){
        int i,k;
        //alt üles
        for (i=0;i<9;i++){
            System.out.println();
            for (k=i;k<9;k++){
                System.out.print("*");
            }
        }

        //Ülevalt alla
        for (i=9;i>0;i--){
            System.out.println();
            for (k=i;k<9;k++){
                System.out.print("*");
            }
        }
    }
}
