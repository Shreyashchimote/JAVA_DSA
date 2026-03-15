public class LinearSearch {
    public static void searchlinear(int nums[], int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                System.out.println("Key found at index: " + i);
                return; // stop searching after finding the key
            }
        }
        // only executed if key is not found
        System.out.println("Not present");
    }
    public static int largestandsmallest(int nums[]){
        double largestnum= Double.NEGATIVE_INFINITY;
        int smallestnum=Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(largestnum<nums[i]){
                largestnum=nums[i];
            }
        }
        
        for (int i= 0; i < nums.length; i++){
            if(smallestnum>nums[i]){
                smallestnum=nums[i];
            }
        }
        System.out.println("smallest number is: "+ smallestnum);
        return ((int)largestnum);
    }

    public static void main(String[] args) {
        int nums[] = {13, 58, 78, 98, 44};
        int key = 58;
        searchlinear(nums, key);
        System.out.print("Largest number is: "+largestandsmallest(nums));
    }
}
