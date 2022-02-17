class Solution {
    // https://leetcode.com/problems/combination-sum-iii/
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        combination(1,n,k,new ArrayList(),ans);
        return ans;
    }
    void combination(int idx,int n,int k,List<Integer> sa, List<List<Integer>> ans){
                
        if(sa.size()==k && n==0){
            ans.add(new ArrayList(sa));
            return;
        }
        
        if(n<=0 || k<=sa.size()) {
            return;
        }
        
        
        for(int i=idx;i<=9;i++){
            sa.add(i);
            combination(i+1,n-i,k,sa,ans);
            sa.remove(sa.size()-1);
        }
    }
}