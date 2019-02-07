package bookpackext;

public class ByThrees implements Series {
    int val, start;

    ByThrees(){
        val=0;
        start=0;
    }
    public int getNext(){
        return val+=3;
    }
    public void reset(){
        start=0;
        val=0;
        }

    public void setStart(int x){
        start=x;
    }
}
