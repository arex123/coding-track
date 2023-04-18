// https://leetcode.com/problems/arithmetic-slices
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        int ans = 0;
        int[] dp = new int[nums.length];
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]-nums[i-1]==nums[i+1]-nums[i]){
                dp[i]=dp[i-1]+1;
                ans+=dp[i];
            }
        }
        
        return ans;
    }
}