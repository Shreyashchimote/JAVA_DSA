public class maxsubarray {
    public static void kadanes(int nums[]){
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if (sum<0) {
                sum=0;
            }
            maxsum=Math.max(sum,maxsum);

        }
        System.out.println(maxsum);
        return;

    }

    public static void main(String args[]){
        kadanes(new int[]{-2,-3,4,-1,-2,1,5,-3});
    }
}
