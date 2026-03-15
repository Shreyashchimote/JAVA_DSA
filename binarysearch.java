import  java.util.Arrays;
public class binarysearch {
    public static int searchbinary(int nums[], int key){
        Arrays.sort(nums);
        int start= 0;
        int end=(nums.length)-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==key){
                return mid;

            }if(nums[mid]>key){
                end=mid-1;
            }if(nums[mid]<key){
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        int key=4;
        System.out.println(searchbinary(nums, key));
    

}
}
