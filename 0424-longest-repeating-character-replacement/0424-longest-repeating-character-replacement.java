class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> mp=new HashMap<>();
        int maxFreq=0,maxLen=0,i=0;

        for(int j=0;j<s.length();j++){
            mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
            maxFreq=Math.max(maxFreq,mp.get(s.charAt(j)));

            while((j-i+1)-maxFreq >k){
                mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
                i++;
            }
            maxLen=Math.max(maxLen,j-i+1);
        }
        return maxLen;
    }
}