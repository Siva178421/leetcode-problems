class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize both sums to the first element to handle arrays with all negative numbers safely
        int currentSum = nums[0];
        int maxSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            // Decide whether to add to the existing subarray or start a new one
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            
            // Update the overall maximum sum if our current subarray is better
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}
