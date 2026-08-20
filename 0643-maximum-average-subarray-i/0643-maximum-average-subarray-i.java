class Solution {
    public double findMaxAverage(int[] nums, int k) {
      int n=nums.length;
      int i=0;
      int j=0;
      double avg=0.0;
      double max=Integer.MIN_VALUE;
      while(j<n){
        avg+=(nums[j]);
        if(j-i+1<k){
            j++;
        }else if(j-i+1==k){
            max=Math.max(max,avg/(double)k);
            avg-=nums[i];
            i++;j++;
        }
      }
      return max;  
    }
}