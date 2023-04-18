class Solution {
    // https://leetcode.com/problems/combination-sum-ii/
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList();
        combination(0,target,candidates,new ArrayList(),ans);
        return ans;
    }
    void combination(int idx,int target,int[] arr,List<Integer> sa,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList(sa));
            return;
        }
        if(target<0){
            return;
        }
        
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]){
                continue;
            }
            sa.add(arr[i]);            
            combination(i+1,target-arr[i],arr,sa,ans);
            sa.remove(sa.size()-1);
        }
        
    }
}