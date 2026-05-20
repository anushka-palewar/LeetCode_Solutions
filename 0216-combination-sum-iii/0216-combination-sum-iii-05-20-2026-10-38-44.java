class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        helper(k,n,0,1,new ArrayList<>(),res);
        return res;
    }
    static void helper(int k,int n,int sum,int start,List<Integer> temp,List<List<Integer>> res){
        if(temp.size()==k){
            if(sum==n){
                res.add(new ArrayList<>(temp));
            }
            return;
        }

        for(int i=start;i<=9;i++){
            if(sum+i>n) break;
            temp.add(i);
            helper(k,n,sum+i,i+1,temp,res);
            temp.remove(temp.size()-1);
        }
    }
}