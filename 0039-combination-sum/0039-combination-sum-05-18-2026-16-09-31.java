class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> result =new ArrayList<>();
     combinationSum(candidates, target, 0, 0, new ArrayList<Integer>(), result );
     return result;
    }
public void combinationSum(int[] candidates, int target, int i, int sum,ArrayList<Integer> temp,List<List<Integer>> result ) {
    if(i==candidates.length)return;
    if(sum==target){
        result.add(new ArrayList<>(temp));
        return ;
    }

     combinationSum(candidates, target, i+1, sum,temp,result);

    if(sum+candidates[i]<=target){
        temp.add(candidates[i]);
       combinationSum(candidates, target, i, sum+candidates[i],temp,result);
       temp.remove(temp.size()-1);
    }



    return  ;

}

}