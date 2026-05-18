class Solution {
    public List<String> validStrings(int n) {
        List<String> ls=new ArrayList<>();
        helper(n,"",ls);
        return ls;
    }

    static void helper(int n,String p,List<String> ls){
        if(p.length()==n){
            ls.add(p);
            return;
        }

        helper(n,p+"1",ls);

        if(p.isEmpty() || p.charAt(p.length()-1)!='0'){
            helper(n,p+"0",ls);
        }
    }
}