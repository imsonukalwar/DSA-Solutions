class Solution {
    public int compress(char[] chars) {
    StringBuilder sr=new StringBuilder();
    int i=1;
    int count=1;
    sr.append(chars[0]);
    while(i<chars.length){
        if(chars[i]==chars[i-1]){
            count++;
        }else{
            if(count>1){
                sr.append(count);
            }
            sr.append(chars[i]);
            count=1;
        }
        i++;
    }
    if(count>1){
        sr.append(count);
    }

    for(int j=0;j<sr.length();j++){
        chars[j]=sr.charAt(j);
    }
    
    return sr.length();
    }
}