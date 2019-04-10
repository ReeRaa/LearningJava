package Threads;

public class MyThread implements Runnable {
    Thread thrd;

    //construct new thread
    MyThread(String name) {
        thrd =new Thread(this,name);
        thrd.start();
    }

    //execution of thread
    public void run() {
        System.out.println(thrd.getName() + " starting.");

        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + ", count is " + count);
            }
        } catch (InterruptedException e) {
            System.out.println(thrd.getName() + " interrupted");
        }
        System.out.println(thrd.getName() + " terminating.");

    }
}

