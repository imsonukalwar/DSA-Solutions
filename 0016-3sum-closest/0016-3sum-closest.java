class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=0;
        int gap=Integer.MAX_VALUE; 
      for(int i=0;i<nums.length-2;i++){
        int j=i+1;
        int k=nums.length-1;
        while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            if(sum<target){
                int newgap=target-sum;
                if(newgap<gap){
                    gap=newgap;
                    res=sum;
                }
                j++;
            }else if(sum>target){
                int newgap=sum-target;
                if(newgap<gap){
                    gap=newgap;
                    res=sum;
                }
                k--;
            }else{
                return sum;
            }
        }
      }
      return res;
    }
}