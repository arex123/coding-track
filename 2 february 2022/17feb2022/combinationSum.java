class Solution {
    // https://leetcode.com/problems/combination-sum/
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList();
        comb(0,ans,new ArrayList(),target,candidates);
        return ans;
        
    }
    void comb(int i,List<List<Integer>> ans,List<Integer> sans,int t,int[] arr){
        
        if(t==0){
            ans.add(new ArrayList(sans));
        }
        if(t<0){
            return;
        }
        
        for(int idx = i;idx< arr.length;idx++){
            sans.add(arr[idx]);
            comb(idx,ans,sans,t-arr[idx],arr);
            sans.remove(sans.size()-1);
        }
        
    }
}