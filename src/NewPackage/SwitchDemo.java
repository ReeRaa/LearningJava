package NewPackage;

public class SwitchDemo {
    public static void main(String args[]){
            int i;
            for (i=1;i<10;i++){
                switch(i){
                    case 1:
                        System.out.println("i is one = "+i);
                        break;
                    case 2:
                        System.out.println("i is two = "+i);
                        break;
                    default:
                        System.out.println("i has other value than one or two: i = "+i);
                }
            }
    }
}
