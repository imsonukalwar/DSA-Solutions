class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
       HashMap<Integer,Integer>map=new HashMap<>();
       int sum=0;
       int i=0;
       int j=0;
       int rem=0;
       map.put(0,-1);
       while(j<nums.length){
        sum+=nums[j];
        rem=sum%k;
        if(map.containsKey(rem)){
            if((j-map.get(rem) >=2)){
                return true;
            }
            i++;
        }else{
            map.put(rem,j);
        }
        j++;
       }
       return false;
    }
}