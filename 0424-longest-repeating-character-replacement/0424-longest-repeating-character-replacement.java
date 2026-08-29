class Solution {
    public int characterReplacement(String s, int k) {
        int i=0;
        int j=0;
        int ans=0;int maxfeq=0;
        Map<Character, Integer> map = new HashMap<>();
        while(j<s.length()){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxfeq = Math.max(maxfeq, map.get(ch));
             if((j-i+1)-maxfeq>k){
                while((j-i+1)-maxfeq>k){
                    char ch1=s.charAt(i);
                    map.put(ch1,map.get(ch1)-1);
                i++;
                }
            }
            ans = Math.max(ans, j - i + 1);
            j++;
        }
        return ans;
    }
}