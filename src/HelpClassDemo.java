public class HelpClassDemo {
    public static void main(String args[])
        throws java.io.IOException {
            char choice, ignore;
            Help helpobject=new Help();

            for (;;){
                do{
                    helpobject.showMenu();
                    choice=(char) System.in.read();
                    do {
                        ignore=(char)System.in.read();
                    } while ( ignore != '\n');
                } while ( !helpobject.isValid(choice));
                if(choice=='q')break;
                System.out.println(("\n"));
                helpobject.helpOn(choice);
            }
        }

}
