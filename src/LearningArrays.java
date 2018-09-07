public class LearningArrays {
    public static void main(String args[]){
        int salaries[]=new int [5];
        int i;
        for (i=0;i<5;i++){
            salaries[i]=i;
            System.out.println(salaries[i]);
        }
        int maxMin[] = {2,4,5,7,1};
        int min, max;
        min=max=maxMin[0];
        for (i=1;i<5;i++){
            if ((maxMin[i])<min) min=maxMin[i];
            if ((maxMin[i])>max) max=maxMin[i];
        }
        System.out.println("Max = "+ max + " Min = "+ min);
    }
}
