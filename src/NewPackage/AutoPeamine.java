package NewPackage;

import java.util.Scanner;

public class AutoPeamine {

    public static void main(String args[]){
        Auto sportauto=new Auto(3,4,5);
        Auto pereauto=new Auto(2,7,8);
        ChkNum e= new ChkNum();
        ArvudeVordlemine xy=new ArvudeVordlemine();

        Scanner sisend=new Scanner(System.in);
        System.out.print("Sisesta pereauto max kiirus: ");
        int x =sisend.nextInt();
        pereauto.kiirus=x;
        System.out.print("Sisesta sportauto max kiirus: ");
        int y =sisend.nextInt();
        sportauto.kiirus =y;

       // sportauto.kohtadeArv=2;
       // pereauto.kohtadeArv=7;

        System.out.print("Sisesta pereauto kütuse tarbimine 100 km kohta: ");
        int a= sisend.nextInt();
        pereauto.kytuseTarbimineKmKohta=a;
        System.out.print("Sisesta spor" +
                "tauto kütuse tarbimine 100 km kohta: ");
        int z= sisend.nextInt();
        sportauto.kytuseTarbimineKmKohta=z;

        System.out.print("Pereauto ");
        pereauto.kuiKaugelePaagitaiegaSoidab();
        System.out.print("Sportauto ");
        sportauto.kuiKaugelePaagitaiegaSoidab();

        if (e.isEven(x)) System.out.println("Pereauto kiirus on paarisarv ");
        else System.out.println("Pereauto kiirus on paaritu arv");

        if (e.isEven(y))System.out.println("Sportauto kiirus on paarisarv ");
        else System.out.println("Sportauto kiirus on paaritu arv");

        if (xy.isGrater(a,z)) System.out.println("Pereauto tarbib rohkem kütust!");
        else System.out.println ("Sportauto tarbib rohkem kütust!");

        System.out.print("Mitu km peab auto sõitma? ");
        int kilometer = sisend.nextInt();
        System.out.println("Pereauto vajab kütust " + sportauto.fuelNeeded(kilometer));
        System.out.println("Sportauto vajab kütust " + sportauto.fuelNeeded(kilometer));

        //Arvuta sisendiga korrutis, kus 2 meetodit on mujal klassis



    }
}
