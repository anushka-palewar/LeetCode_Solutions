class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> mp=new HashMap<>();

        for(String num:words){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }

        PriorityQueue<String> pq=new PriorityQueue<>((a, b) -> {
            if (mp.get(a).equals(mp.get(b)))
                return b.compareTo(a);
            return mp.get(a) - mp.get(b);
        }); //If frequencies are equal, lexicographically smaller word comes first.

        for (String word : mp.keySet()) {
            pq.offer(word);

            if (pq.size() > k)
                pq.poll();
        }

        List<String> ans = new ArrayList<>();

        while (!pq.isEmpty()) {
            ans.add(pq.poll());
        }

        Collections.reverse(ans);

        return ans;
    }
}