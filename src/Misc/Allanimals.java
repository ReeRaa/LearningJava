package Misc;

public class Allanimals {
    public int[] removeArray(int[] array, int removeIndex){
        for (int i=removeIndex;i<array.length-1;i++){
            array[i]=array[i + 1];
        }
        return array;
    }


    public static void main(String[] args) {

        //System.out.println(args[0]);
        //System.out.println(args[1]);

        Animal doggy=new Dog();
        Animal catty=new Cat();

        doggy.name="Swarts";
        catty.name="Bully";

        doggy.bark();
        catty.bark();

        ((Dog) doggy).move();
        Dog d=new Dog();
        d.name="Mops";
        d.bark();

        ((Dog) doggy).age=5;

        Integer myIne=2;

        myIne=myIne +3;
        System.out.println(myIne);

        int m1=myIne;
        final int i1=3;

        System.out.println(m1);
        System.out.println("array");


        int[] num5={1,2,3,4,5};
        Allanimals al=new Allanimals();
        al.removeArray(num5,2);
//        for (int x:num5){
//            System.out.println(num5[x]);}

    int a=1;
    final int b=a;
    System.out.println("a " +a);
    System.out.println("b " +b);
    a=a+2;
    System.out.println("uus a " +a);
    System.out.println("a+2 kui on b " +b);
    byte c=121;
    a=a+c;

    Integer myInt=23;
    myInt=34;
    a=myInt;
    int f=9;
    myInt=f;

    Integer t=null;
    int s;
    Cat cat=new Cat();

    System.out.println(cat.cat2);
    System.out.println(cat.cat1);
}
}
