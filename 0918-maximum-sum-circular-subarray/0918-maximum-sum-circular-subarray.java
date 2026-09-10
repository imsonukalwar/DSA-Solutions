class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsum= maximumSum(nums);
        int circularSum=sum(nums)-minimumSum(nums);
        int ans=Math.max(maxsum,circularSum);
        // Important for all-negative array
        // assume herre your arr like this [-1-1-1]
        // here your max=-1;
        // but your curcularSum=0
        // for this line
        // int ans=Math.max(maxsum,circularSum);
        // so you get 0 --->but [-1-1-1] array has no 0 so your ans is wrong that's why 
        // i'm rwite this 
        if (maxsum < 0) {
            return maxsum;
        }
        return ans;
    }
    static int sum(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
    static int maximumSum(int []nums){
        int currentSum=nums[0];
        int maxSum=nums[0];
        for(int i=1;i<nums.length;i++){
            currentSum=Math.max(nums[i],nums[i]+currentSum);
            maxSum=Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
    static int minimumSum(int []nums){
        int currentSum=nums[0];
        int minSum=nums[0];
        for(int i=1;i<nums.length;i++){
            currentSum=Math.min(nums[i],nums[i]+currentSum);
            minSum=Math.min(currentSum,minSum);
        }
        return minSum;
    }
}