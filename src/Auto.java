public class Auto {
    int kiirus;
    int kohtadeArv;
    int kytuseTarbimineKmKohta;
    int kuiKaugelePaagitaiegaSoidab(){
        int kaugus= kiirus * kytuseTarbimineKmKohta;
        System.out.println("sõidab paagitäiega " + kaugus + " km");
        return(kaugus);
    }
    double fuelNeeded (int kilometers){
        return (double) (kytuseTarbimineKmKohta*kilometers)/100;
    }

}
