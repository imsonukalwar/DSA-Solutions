class Solution {
    public int findMiddleIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int presum[] = new int[nums.length];
        presum[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            presum[i] = presum[i - 1] + nums[i - 1];
        }
        int[] suffsum = new int[nums.length];
        suffsum[nums.length - 1] = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            suffsum[i] = suffsum[i + 1] + nums[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            if (presum[i] == suffsum[i]) {
                return i;
            }
        }
        return -1;
    }
}