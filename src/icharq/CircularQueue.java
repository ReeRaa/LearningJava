package icharq;

public class CircularQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    //contruct a char array
    public CircularQueue(int size){
        q=new char[size+1];
        getloc=putloc=0;
    }

    //put char to queue
    public void put(char ch){
        //queue is full if putloc is 1 less than getloc or if putloc is at the end of array and getloc is in the beginning
        if (putloc +1==getloc |
                ((putloc==q.length-1)& (getloc==0))){
            System.out.println(" Queue is full!");
            return;
        }
        q[putloc++]=ch;
        if (putloc==q.length) putloc=0; //loop back
    }

    //get char from queue
    public char get(){
        if (getloc==putloc){
            System.out.println(" Queue is empty!");
            return (char)0;
        }
        char ch=q[getloc++];
        if (getloc==q.length) getloc=0; //loop back
        return ch;
    }
}
