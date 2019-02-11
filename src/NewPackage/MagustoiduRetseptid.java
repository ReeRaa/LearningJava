package NewPackage;

public class MagustoiduRetseptid {
    //param method for selecting menu item
    void receiptDescription(int menuItem){
        switch (menuItem){
            case '1':
                System.out.println("Bubert:");
                System.out.println("Bubert on magus mannapudru muna ja vaniljega.");
                break;
            case '2':
                System.out.println("Pannkoogid:");
                System.out.println("Pannkoogid on magusast taignast pannil küpsetatud väikesed lamedad koogid.");
                break;
            case '3':
                System.out.println("Vahvlid:");
                System.out.println("Vahvlid on magusast taignast küpsetatud õhukesed ja krõbedad torusse keeratud küpsetised.");
                break;
        }
    }

    //näita menüüd
    void displayMenu(){

        System.out.println("");
        System.out.println("Vali magustoidu kirjeldus, valides numbri retsepti ees! \nProgrammist väljumiseks vajuta tähele 'q'!");
                System.out.println("1. Bubert");
        System.out.println("2. Pannkoogid");
        System.out.println("3. Vahvlid");
    }

    //kontrolli, kas sisestatud char on korrektne
    boolean isValid(int ch){
        if (ch<'1' | ch>'3' & ch !='q') return false;
        else return true;
    }
}
