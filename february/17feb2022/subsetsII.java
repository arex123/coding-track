class Solution {
    // https://leetcode.com/problems/subsets-ii/
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        subdup(0,nums,new ArrayList(),ans);
        return ans;
    }
    void subdup(int idx , int[] arr,List<Integer> sa,List<List<Integer>> ans){
        
        
        ans.add(new ArrayList(sa));
        
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]){
                continue; //this is the real filter to ignore duplicate subsets
            }
            sa.add(arr[i]);
            subdup(i+1,arr,sa,ans);
            sa.remove(sa.size()-1);
        }
        
    }
}