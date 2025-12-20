class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]=new int[26];
        int l=0,windowSize=0,maxfreq=0,maxWindow=0;

        for(int r=0;r<s.length();r++){
            freq[s.charAt(r)-'A']++;

            windowSize=r-l+1;
            maxfreq=Math.max(maxfreq,freq[s.charAt(r)-'A']);

            if((windowSize-maxfreq)>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            windowSize=r-l+1;
            maxWindow=Math.max(maxWindow,windowSize);
        }
        return maxWindow;
    }
}