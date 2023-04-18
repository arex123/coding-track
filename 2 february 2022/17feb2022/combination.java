class Solution {
    // https://leetcode.com/problems/combinations/
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        twoCombFind(1,n,k,new ArrayList(),ans);
        return ans;
    }
    void twoCombFind(int st,int end,int k,List<Integer> sa,List<List<Integer>> ans){
        
        if(sa.size()==k){
            ans.add(new ArrayList(sa));
            return;
        }
        
        for(int i=st;i<=end;i++){
            sa.add(i);
            twoCombFind(i+1,end,k,sa,ans);
            sa.remove(sa.size()-1);
        }

    }
}