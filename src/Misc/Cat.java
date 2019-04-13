package Misc;


public class Cat extends Animal{

    int a,b;
    public int add(int c, int d){
        return (c+d);
    }

    public void callAdditives(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println(add(a,b));
    }


    static int cat1 =3;

    int cat2 =1;

    public static void main(String[] args){
        System.out.println(cat1);
    Cat cat=new Cat();
        System.out.println(cat.cat2);

        for (int i=0; i<10; i++) {
            cat.callAdditives(i, i*i);

        }
}
}