class Solution {
    public boolean findSubarrays(int[] nums) {
       int sum=0;
       Set<Integer>set=new HashSet<>();
       for(int i=0;i<nums.length-1;i++){
        sum=nums[i]+nums[i+1];
        if(set.contains(sum)){
            return true;
        }
        set.add(sum);
       } 
       return false;
    }
}