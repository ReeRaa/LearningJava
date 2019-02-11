package NewPackage;

public class IConstD implements IConst {
    public static void main(String[] args) {
        int nums[]=new int[MAX];
        for (int i=MIN;i<16;i++){
            if (i>=MAX) System.out.println(ERRORMSG);
            else {
                nums[i]=i;
                System.out.println(nums[i]+" ");
            }
        }
    }
}
