class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> mp=new HashMap<>();

        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }

        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>(
            (a,b)->b.getValue()-a.getValue()
        );

        pq.addAll(mp.entrySet());

        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character,Integer> num=pq.poll();
            sb.append(String.valueOf(num.getKey()).repeat(num.getValue()));
        }

        return sb.toString();
    }
}