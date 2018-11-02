package bookpackext;

class ByTwos implements Series {
    int start,val,prev;

    ByTwos(){
        start=0;
        val=0;
        prev=-2;
    }

    @Override
    public int getNext() {
        prev=val;
        return val+=2;
    }

    @Override
    public void reset() {
        val=start;
        prev=start-2;
    }

    public void setStart(int x) {
        start=x;
        val=x;
        prev=start-2;
    }

    int getPrev(){
        return prev;
    }

}
