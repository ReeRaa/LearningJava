package bookpackext;

public class SeriesDemo {
    public static void main(String[] args) {
        ByTwos ob=new ByTwos();
        ByThrees ob1=new ByThrees();

        for (int i=0;i<5;i++){
            System.out.println("Next value is: "+ob1.getNext());
            //System.out.println("Previoud value is: "+ob.getPrev());
        }
        System.out.println();
        System.out.println("Resetting");
        System.out.println();

        ob.reset();
        for (int i=0;i<5;i++){
            System.out.println("Next value is: "+ob1.getNext());
        }

        System.out.println();
        System.out.println("Set start to 100");
        ob.setStart(100);
        for (int i=0;i<5;i++){
            System.out.println("Next value is: "+ob1.getNext());
        }
    }
}
