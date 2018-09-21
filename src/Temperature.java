public class Temperature{
        public static void main(String args[]){
       /* double tempf=98.6;
        double tempc=0.0;
        ftoc(tempf);
*/
        //new
            int a=1;
            int b=2;
            int c=3;
            c=findIt(a,c,b);
            System.out.println("Number is " + c);

            String letter="o";
            System.out.println(isVowel(letter));


                }
        public static boolean isVowel(String a){
            if (a.equalsIgnoreCase("A") || a.equalsIgnoreCase("O")){
                return true;
            }
            else return false;
        }

        public static int findIt(int c,int a, int b){
            c--;
            a=2*b+c;
            return a;
        }

        // converts Fahrenheit temperatures to Celsius
        public static void ftoc(double tempf){
        double tempc = (tempf - 32)*5/9;
        System.out.println(tempc);
        }


        }