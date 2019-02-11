package NewPackage;

import java.util.Scanner;

public class Car {
    Scanner input= new Scanner(System.in);
    String make=input.next();
    String model=input.next();
    int year=input.nextInt();
    Car(String ma,String mo, int y){
        make=ma;
        model=mo;
        year=y;
    }
    void ShowCar(){
        System.out.println(make + " " +model+ " "+year);
    }
}
