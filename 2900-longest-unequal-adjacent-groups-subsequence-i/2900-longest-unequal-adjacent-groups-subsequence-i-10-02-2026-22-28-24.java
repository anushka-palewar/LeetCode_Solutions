class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> ls=new ArrayList<>();
        ls.add(words[0]);

        for(int i=1;i<groups.length;i++){
            if(groups[i]!=groups[i-1]){
                ls.add(words[i]);
            }
        }
        return ls;
    }
}