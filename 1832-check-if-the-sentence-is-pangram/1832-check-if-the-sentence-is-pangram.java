class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean present[]=new boolean[26];
        for(char ch: sentence.toCharArray()){
            if(Character.isLetter(ch)){
                present[ch-'a']=true;
            }
        }


        for(boolean check:present){
            if(!check){
                return false;
            }
        }

        return true;
    }
}