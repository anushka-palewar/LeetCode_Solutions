class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        helper(0,0,n,"",res);
        return res;
    }

    static void helper(int open,int close,int n,String p,List<String> res){
        if(open==close && open+close==n*2){
            res.add(p);
            return;
        }

        if(open<n){
            helper(open+1,close,n,p+'(',res);
        }

        if(open>close){
            helper(open,close+1,n,p+')',res);
        }
    }
}