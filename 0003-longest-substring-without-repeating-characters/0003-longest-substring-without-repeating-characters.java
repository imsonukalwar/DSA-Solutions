class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int maxsub = Integer.MIN_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        if(s.length()==0){
            maxsub=0;
        }
        while (j < s.length()) {
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if (map.size() == j - i + 1) {
                maxsub = Math.max(maxsub, j - i + 1);
                j++;
            } else if (map.size() < j - i + 1) {
                while (map.size() < j - i + 1) {
                    char ch1 = s.charAt(i);
                    map.put(ch1, map.get(ch1) - 1);
                    if (map.get(ch1) == 0) {
                        map.remove(ch1);
                    }
                    i++;
                }
                j++;
            }
        }
        return maxsub;
    }
}