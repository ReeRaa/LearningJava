package NewPackage;

public class Taxi {
    int passangers;
    int luggage;

    void carHold(){
        int hold = passangers + luggage;
        System.out.println("All together it can hold: "+ hold +" items.");
    }
    void myMeth(){
        int i;
        for (i=0;i<10;i++){
            if (i==5) return;
            System.out.println(i);
        }
    }
}
