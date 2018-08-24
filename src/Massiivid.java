public class Massiivid {
    public static void main(String args[]){
        /*int month_days[] =new int[12];
        month_days[0]=31;
        month_days[1]=28;
        month_days[2]=31;
        month_days[3]=30;
        month_days[4]=31;
        month_days[6]=31;
        month_days[7]=31;
        month_days[8]=30;
        month_days[9]=31;
        month_days[10]=30;
        month_days[11]=31;
        System.out.println("April has "+month_days[3]+" days.");
        String name_of_days[]={"Esmaspäev","Teisispäev","Kolmapäev"};
        System.out.println("Nädala kolmas päev on "+name_of_days[2]);

        double numbers[]= {1.2,2.4,5.6,6.7};
        double result =0;
        double sum=0;
        int i;
        for (i=0; i<4; i++)
            result=result +numbers[i];
        for (i=0; i<4; i++)
            sum=sum+numbers[i];
        System.out.println("Average is " + result/i);
        System.out.println("Sum is " + sum + " and i= "+ i);
*/
        int twoD[][] = new int [4][5];
        int i,j,k=0;

        for (i=0; i<4;i++)
            for ( j=0 ;j<5;j++){
                twoD[i][j]=k;
                k++;
            }
        for(i=0; i<4; i++) {
            for(j=0; j<5; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }


}
