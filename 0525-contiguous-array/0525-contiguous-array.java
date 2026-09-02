class Solution {
    public int findMaxLength(int[] nums) {
        // int i=0;
        int j=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        // map.put(0,-1);
        int ans=0;
        int sum=0;
        while(j<nums.length){
            if(nums[j]==0){
                sum+=-1;
            }else{
                sum+=1;
            }

             if (sum == 0) {
        ans = Math.max(ans, j + 1);
    }
    //  this line for map.put(0,-1); replace

           if (map.containsKey(sum)) {
            ans = Math.max(ans, j - map.get(sum));
        } else {
            map.put(sum, j);
        }
        j++;
        }
        return ans;
    }
}