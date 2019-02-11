package NewPackage;

public class Help {
    void helpOn(int what){
        switch (what){
            case  '1':
                System.out.println("if (condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch construction:\n");
                System.out.println("switch (expression) {");
                System.out.println(" case constant:");
                break;
            case '3':
                System.out.println("The for construction:\n");
                System.out.println("for (init; condition; iteration)");
                break;
        }
        System.out.println();
    }

    void  showMenu(){
        System.out.println("Help on:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println(" 3. for");
        System.out.println("Choose one (q to quit): ");
    }

    boolean isValid(int ch){
        return !(ch < '1' | ch > '3' & ch != 'q');
    }}
