package NewPackage;

import java.util.Scanner;
public class Arvutamine {
    public static void main(String[] args){
        Double z;

        ArvutamiseKontroll e=new ArvutamiseKontroll();
        Suurendamine s=new Suurendamine();

        Scanner sisend=new Scanner(System.in);
        System.out.print("Sisesta esimene arv: ");
        Double x =sisend.nextDouble();

        Double y =s.suurendamine(x);
        System.out.println("Temast 5 võrra suurem arv on: "+y);
       // double y = sisend.nextDouble();
        System.out.println("Arvude "+x+" ja "+y+ " summa on "+ e.liitmine(x,y));
        System.out.println("Arvude "+x+" ja "+y+ " korrutis on "+ e.korrutis(x,y));
        System.out.println("Arvude "+x+" ja "+y+ " summa jagatis on "+ e.jagatis(x,y));
    }
}
