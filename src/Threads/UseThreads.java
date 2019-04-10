package Threads;

public class UseThreads {
    public static void main(String args[]){
        System.out.println("Main thread starting.");

        //first construct MyThread obj
        MyThread mt=new MyThread("Child #1");

//        //next, construct a thread from that object
//        Thread newThread=new Thread(mt);

        //finally start execution of the thread
//        newThread.start();

        for (int i=0;i<50;i++){
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc){
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }
}
