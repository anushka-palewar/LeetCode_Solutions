class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> mp = new HashMap<>();

        //count freq
        for(char ch: s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }

        //sort by freq
        List<Character> list=new ArrayList<>(mp.keySet());
        list.sort((a, b) -> mp.get(b) - mp.get(a));

        //string in desc order
        StringBuilder sb=new StringBuilder();

        for(char ch: list){
            int freq=mp.get(ch);
            for(int i=0;i<freq;i++){
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}