public class pairs_in_array {
    public static int pairs(int nums[]){
        int tp=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                System.out.print("("+nums[i]+","+nums[j]+")");
                System.out.print(" ");
                tp++;
            }
            System.out.println();
        }
        System.out.print(tp);
        return -1;
    }
    public static int subarrays(int nums[]){
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                for(int k=i;k<=j;k++){
                    System.out.print("("+nums[k]+")"+" ");
                    sum=sum+nums[k];
                }
                if(maxsum<sum){
                    maxsum=sum;
                }
                sum=0;
                
                System.err.println("");
                
                
            }
            
            
            
        }
        System.out.println(((nums.length)*(nums.length+1))/2);
        return maxsum;
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10};
        // pairs(nums);
        System.out.println(subarrays(nums));
    }

}
