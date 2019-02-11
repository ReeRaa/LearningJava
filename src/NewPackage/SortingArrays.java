package NewPackage;

public class SortingArrays {
    public static void main(String args[]) {
        int mainArray[] = {3, 1, 6, 5, 7, 8};
        int helpingArray[] = new int[6];
        int a, b, t, size = 6;

        //display original array
        System.out.println("Original array is: ");
        for (a = 0; a < size; a++) {
            System.out.println("element "+a+" is [" + mainArray[a] + "] ");
        }

        //Sorted array
        System.out.println();
        System.out.println("Sorted array is:");
        for (a=1; a<size;a++)
        for (b=size-1;b>=a;b--) {
            if (mainArray[b - 1] > mainArray[b]) { //is out of order
                //exchange elements
                t = mainArray[b - 1];
                mainArray[b - 1] = mainArray[b];
                mainArray[b] = t;
            }
        }
        //display sorted array
        for (int i=0;i<size;i++)
        System.out.println(" array element ["+(i)+ "] "+mainArray[i] );
        }

    }

