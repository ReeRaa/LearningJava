public class LearningArrays {
    public static void main(String args[]){
        int salaries[]=new int [5];
        int i;
        for (i=0;i<5;i++){
            salaries[i]=i;
            System.out.println(salaries[i]);
        }
       //find min and max values
        int maxMin[] = {2,4,5,7,1};
        int sortedArray[]=new int [5];
        int min, max;
        min=max=maxMin[0];
        for (i=1;i<5;i++){
            if ((maxMin[i])<min) min=maxMin[i];
            if ((maxMin[i])>max) max=maxMin[i];
        }
        System.out.println("Max = "+ max + " Min = "+ min);

        //find, on which place is letter A
        char someChar[]={'B','C','D','A','F','A'};
        char right ='A';
        for (i=0;i<6;i++){
            if (someChar[i]==right) System.out.println("Letter A is on place "+ (i+1));
        }

        //find where is word 'mets'
        String sonad[]={"puud","koobas","mets","linnud"};
        String rightWord="mets";
        for (i=0;i<4;i++){
            if (sonad[i]==rightWord) System.out.println("Searched word is '" + rightWord + "' which is on place "+ (i+1));
        }

    }
}
