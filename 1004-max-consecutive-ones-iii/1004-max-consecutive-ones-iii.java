class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
        int zerocount=0;
        int i=0;int j=0;
        while(j<nums.length){
            if(nums[j]==0){
                zerocount++;
            }
            if(zerocount<=k){
               max=Math.max(max,j-i+1);
               j++; 
            }
            if(zerocount>k){
                while(zerocount>k){
                    if (nums[i] == 0) {
                        zerocount--;
                    }
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}