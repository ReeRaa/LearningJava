public class HelloWorldNew {
    public static void main(String[] args){
        //deklareerin array
        int[] numbers = {1,4,9,14,20};
        //allocate memory for numbers
        //numbers=new int[6];
        int a=2;
        int b=20;

       // for (int item:numbers){
        //    System.out.println(item+a +" ja " + ( item+b));
        //}
        String[][] names= { {"esimene","teine"},{" üks"," kaks"," kolm"}};
        String[] shortNames= { "esimene","teine"};
        System.out.println(names[0][0] + names [1][2] + names [1][1]);
        System.out.println(names.length);
        System.out.println(shortNames.length);
        System.out.println(numbers.length);

        copyArrays();

        //  for (String item:names){
      //      System.out.println(item);
      //  }
    }
    public static void copyArrays(){
        char[] copyFrom = {'a','i','a','s',' ','s','a','d','a','s'};
        char[] copyTo = new char[9];
        System.arraycopy(copyFrom,1,copyTo,0,9);
        System .out.println(new String (copyFrom));
        System.out.println(new String (copyTo));
    }
}
