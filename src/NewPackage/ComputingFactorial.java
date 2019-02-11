package NewPackage;

public class ComputingFactorial {
    public static void main(String[] args) {
        int value = factorial(9);
        System.out.println(value);
        int valueTwo=factorialTwo(9);
        System.out.println(valueTwo);
        int zz=starString(2,4);
        String ll=word("Hello",3);
       System.out.println(ll);
       ComputingFactorial mee=new ComputingFactorial();
       mee.mystery(4);

    }
    public void mystery(int n){
        if (n<=1){
            System.out.print(n);
        }else{
            mystery(n/2);
            System.out.print(", "+n);
        }
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i < (n + 1); i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialTwo(int n) {
        if (n == 1) {
            return 1;
        } else {
            n=n * factorial(n - 1);
            for (int i=1;i<=n;i++) {
            }
            return n;
        }
    }

    public static int starString(int x,int p){
       int n;
        if (p==0){
            System.out.println("*");

            return 1;
        }
        else {
            x=x*starString(x,p-1);
            for (int i=1;i<=x;i++){
                System.out.print("*");

            }
            System.out.println();
            return x;
        }
    }

    public static String word(String word,int number){
        if (number==1){
           return word;
        }
        else {
            String z=word+word(word,number-1);
            //System.out.println(z);
            return z;
        }

    }
}