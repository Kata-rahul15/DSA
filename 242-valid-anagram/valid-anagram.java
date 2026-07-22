class Solution {
    public boolean isAnagram(String s, String t) {
        int freq[]= new int[128];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
        freq[s.charAt(i)]++;
        freq[t.charAt(i)]--;
        }
        for(int i=0;i<=freq.length-1;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        
    return true;
    }
}