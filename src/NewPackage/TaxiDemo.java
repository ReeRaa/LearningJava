package NewPackage;

public class TaxiDemo {
    public static void main(String args[]){
        Taxi minivan = new Taxi();
        Taxi sportscar = new Taxi();

        minivan.luggage=4;
        sportscar.luggage=1;
        minivan.passangers=10;
        sportscar.passangers=2;
        System.out.println("minivan can hold: "+ minivan.luggage +" pices of luggage");
       minivan.carHold();
        System.out.println("sportscar can hold: "+ sportscar.luggage +" pices of luggage");
        sportscar.carHold();
 int i;

    }
}
