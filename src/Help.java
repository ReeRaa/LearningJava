public class Help {
    void helpOn(int what){
        switch (what){
            case  '1':
                System.out.println("The if:\n");
                System.out.println("if (condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch (expression) {");
                System.out.println(" case constant:");
        }
        System.out.println();
    }

    void  showMenu(){
        System.out.println("Help on:");
        System.out.println(" 1. if:");
        System.out.println(" 2. switch:");
        System.out.println(" 3. for");
        System.out.println(" 4. while");
        System.out.println("Choose one (q to quit): ");
    }

    boolean isValid(int ch){
        if (ch<'1'| ch >'7' & ch != 'q') return false;
        else return true;
    }}
