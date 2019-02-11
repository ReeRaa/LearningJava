package NewPackage;

public class TwoDimArray {
    public static void main(String args[]){
        int x,y;
        int table[][]=new int[3][4];
        for (x=0;x<3;x++)
            for (y=0;y<4;y++){
            table[x][y]=x*4+y+1;
            System.out.println("table ["+x+"]["+y+"] value is "+table[x][y]);
            }
    }
}
