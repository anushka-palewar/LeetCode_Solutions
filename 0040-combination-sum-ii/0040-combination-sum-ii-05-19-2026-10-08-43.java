class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        helper(candidates,0,0,temp,res,target);
        return res;
    }

    static void helper(int nums[],int sum,int i,List<Integer> temp,List<List<Integer>> res,int tar){
        if(sum==tar){
            res.add(new ArrayList<>(temp));
            return;
        }

        if(sum>tar || i==nums.length){
            return;
        }

        for (int j=i;j<nums.length;j++) {
            if (j>i && nums[j]==nums[j-1]) {
                continue;
            }
            if (sum+nums[j]>tar) {
                break;
            }
            temp.add(nums[j]);
            helper(nums,sum + nums[j],j + 1,temp,res,tar);
            temp.remove(temp.size() - 1);
        }
    }
}