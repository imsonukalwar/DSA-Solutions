class Solution {
    public List<Integer> findAnagrams(String s, String p) {
      Map<Character, Integer>smap=new HashMap<>();
      Map<Character, Integer>pmap=new HashMap<>();
      List<Integer>list=new ArrayList<>();
      for(int x=0;x<p.length();x++){
        char ch=p.charAt(x);
        pmap.put(ch , pmap.getOrDefault(ch,0)+1);
      }

      int i=0;
      int j=0;
      while(j<s.length()){
        char ch=s.charAt(j);
        smap.put(ch,smap.getOrDefault(ch,0)+1);
        if(j-i+1<p.length()){
            j++;
        }else if(j-i+1==p.length()){
            if(pmap.equals(smap)){
                list.add(i);
            }
            char firstChar=s.charAt(i);
            if(smap.get(firstChar)==1){
                smap.remove(firstChar);
            }else{
                smap.put(firstChar,smap.get(firstChar)-1);
            }
            i++;
            j++;
        }
      }
      return list;
    }
}