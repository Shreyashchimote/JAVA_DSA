import java.util.Arrays;
public class Question1 {
    public static boolean leasttwice(int nums[]){
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
    
    public static int q2(int nums[],int target){
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start/end)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={ 4,  5, 6, 7, 0, 1, 2};
        int target=0;
        System.out.println(q2(nums, target));
    }
    

}
