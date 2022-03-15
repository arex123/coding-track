class Solution {
    // https://leetcode.com/contest/biweekly-contest-71/problems/partition-array-according-to-given-pivot/
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] ans = new int[n];
        
        int p=0;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot) ans[p++]=nums[i];
        }
        
        for(int i=0;i<n;i++){
            if(nums[i]==pivot) ans[p++]=nums[i];
        }
        
        for(int i=0;i<n;i++){
            if(nums[i]>pivot) ans[p++]=nums[i];
        }
        
        return ans;
    }
}
