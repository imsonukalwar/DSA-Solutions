class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int minSum=nums[0];
        int maxSum=nums[0];
        int ans=Math.abs(nums[0]);
        for(int i=1;i<nums.length;i++){
            int newmax=Math.max(nums[i],maxSum+nums[i]);
            int newmin=Math.min(nums[i],minSum+nums[i]);
            maxSum=newmax;
            minSum=newmin;
            ans=Math.max(ans,Math.max(newmax,Math.abs(newmin)));
        }
        return ans;
    }
}