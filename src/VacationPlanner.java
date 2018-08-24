import java.util.Scanner;
public class VacationPlanner {
    public static void main (String[] args){
        Welcome();
        Planning();
        TimeDifference();
        Area();
    }
    public static void Welcome(){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String userName = input.nextLine();
        System.out.print("Nice to meet you " + userName + ", where are you travelling to? ");
        String destination=input.nextLine();
        System.out.println("Great! "+ destination+" sounds like a great trip!");
        System.out.println("******************");

   }
   public static void  Planning(){
        Scanner input= new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling? ");
        int days= input.nextInt();
        System.out.print("How much money in EUR are you planning to spend on your trip? ");
        double planningToSpend= input.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currencySymbol= input.next();
        System.out.print("How many "+ currencySymbol+" are there in 1 EUR? ");
        double changeRate = input.nextDouble();
        System.out.println();
        System.out.println("If you are travelling for "+ days+" days, that is the same as "+(days*24)+" hours or "+(days*24*60)+" minutes.");

        System.out.println("If you are going to spend "+ planningToSpend+ " EUR that means per day you can spend up to "+((int)(100*(planningToSpend/days)))/100.0+" EUR " );
        System.out.println("Your total budeget in "+currencySymbol+" is "+ ((int)(100*changeRate*planningToSpend))/100.0+ " "+currencySymbol+", which per day is "+ ((int)(100*changeRate*planningToSpend/days))/100.0+ " "+currencySymbol);
    }
    public static void TimeDifference(){
        Scanner input=new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int timeDifference = input.nextInt();
        System.out.println("That means that when it is midnight at home it will be "+(((24+timeDifference)%24))+":00 in your travel destination and when it is noon at home it will be " +(12+timeDifference)+":00.");
        System.out.println("**********");
    }
    public static void Area(){
        Double miles=0.621371;
        Scanner input =new Scanner(System.in);
        System.out.print("What is the square area of your destination country in km2 ");
        Double SquareAreaDestination=input.nextDouble();
        System.out.println("In miles2 this is " + Math.round(SquareAreaDestination*miles));
        System.out.println("*****************");
    }
}
