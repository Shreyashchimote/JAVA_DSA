public class subaaraysum {
    public static int subarrayssum_prefix(int nums[]){
        int maxsum = Integer.MIN_VALUE;  // to track the maximum subarray sum
        int sum = 0;

        int prefix[] = new int[nums.length]; // prefix array to store cumulative sums
        prefix[0] = nums[0];  // first element is same

        // Step 1: Build prefix sum array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];  // ❌ Problem here (i=0 causes error)
        }

        // Step 2: Calculate all subarray sums using prefix sums
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                // formula: sum(i...j) = prefix[j] - prefix[i-1]
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                
                if (maxsum < sum) {
                    maxsum = sum;  // update maxsum if new sum is greater
                }
            }
        }

        // Step 3: Print total number of subarrays
        System.out.println(((nums.length) * (nums.length + 1)) / 2);

        return maxsum;
    }

    public static void main(String[] args) {
        int nums[] = {1, -2, 6, -1, 3};
        System.out.println(subarrayssum_prefix(nums));
    }
}
