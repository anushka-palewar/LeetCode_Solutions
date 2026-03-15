class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> mp=new HashMap<>();

        for(char ch: t.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }

        int l=0,r=0,count=0,minLen=Integer.MAX_VALUE;
        int sIndex = -1;

        while(r<s.length()){
            char ch=s.charAt(r);

            if(mp.containsKey(ch)){
                if(mp.get(ch)>0){
                    count++;
                }
                mp.put(ch,mp.get(ch)-1);
            }


            while(count==t.length()){
                if(r-l+1<minLen){
                    minLen=r-l+1;
                    sIndex=l;
                }

                char left = s.charAt(l);

                if(mp.containsKey(left)){
                    mp.put(left,mp.get(left)+1);
                    if (mp.get(left)>0) {
                        count--;
                    }
                }
                l++;
            }
            r++;
        }
        return sIndex==-1 ? "" :s.substring(sIndex,sIndex+minLen);
    }
}