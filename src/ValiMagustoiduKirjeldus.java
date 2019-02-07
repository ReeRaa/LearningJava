public class ValiMagustoiduKirjeldus {

    public static void main(String args[])
        throws java.io.IOException{
            char choise, ignore;
           MagustoiduRetseptid receiptObject=new MagustoiduRetseptid();
       // System.out.println("Vali magustoidu kirjeldus, valides numbri retsepti ees!");

            for (;;){
                do{
                    receiptObject.displayMenu();
                    choise=(char) System.in.read();
                    do{
                        ignore=(char)System.in.read();
                    } while ( ignore != '\n');
                }while (!receiptObject.isValid(choise));
                if (choise=='q') break;
                System.out.println("");
                receiptObject.receiptDescription(choise);
            }
        }
    }

