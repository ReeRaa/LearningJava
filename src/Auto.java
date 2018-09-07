import java.util.Scanner;
public class Auto {
    //int kiirus;

    Scanner input= new Scanner(System.in);
    int kiirus =input.nextInt();
    int kohtadeArv = input.nextInt();
    int kytuseTarbimineKmKohta= input.nextInt();
    Auto(int k,int ka,int ky){
        kiirus=k;
        kohtadeArv=ka;
        kytuseTarbimineKmKohta=ky;
    }
    int kuiKaugelePaagitaiegaSoidab(){
        int kaugus= kiirus * kytuseTarbimineKmKohta;
        System.out.println("sõidab paagitäiega " + kaugus + " km");
        return(kaugus);
    }
    double fuelNeeded (int kilometers){
        return (double) (kytuseTarbimineKmKohta*kilometers)/100;
    }

}
