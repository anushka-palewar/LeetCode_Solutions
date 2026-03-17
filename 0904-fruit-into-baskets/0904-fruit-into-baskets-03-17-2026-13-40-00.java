class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer> mp=new HashMap<>();

        int i=0,j=0,count=0;
        while(j<fruits.length){
            mp.put(fruits[j],mp.getOrDefault(fruits[j],0)+1);

            while(mp.size()>2){
                mp.put(fruits[i],mp.get(fruits[i])-1);
                if(mp.get(fruits[i])==0) mp.remove(fruits[i]);
                i++;
            }

            count=Math.max(count,j-i+1);
            j++;
        }
        return count;
    }
}