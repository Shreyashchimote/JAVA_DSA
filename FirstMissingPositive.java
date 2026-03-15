import java.util.*;
public class FirstMissingPositive {
    //  public static int firstMissingPositive(int[] nums){
    //     int i=1;
    //     for(int j=0;j<nums.length;j++){
    //         if(nums[j]>0 && nums[j]<=nums.length+1){
    //             if(nums[j]==i){
    //                 i++;
    //             }
    //         }
    //     }
    //     if(i==nums.length){
    //         return nums.length;
    //     }
    //     return i;
    //  }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNumber = 1;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }
    }

    //  public static void main(String[] args) {
    //      int nums[]={3,4,-1,1};
    //      System.out.println(firstMissingPositive(nums));
    //  }
}
