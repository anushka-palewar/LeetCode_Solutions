class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        helper(nums,0,ls,temp);
        return ls;
    }

    static void helper(int nums[],int i,List<List<Integer>> res,List<Integer> temp){
        if(i==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[i]);
        helper(nums,i+1,res,temp);
        temp.remove(temp.size()-1);
        helper(nums,i+1,res,temp);
    }
}