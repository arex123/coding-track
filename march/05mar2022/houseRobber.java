class Solution {
    // https://leetcode.com/problems/house-robber/
    public int rob(int[] nums) {
        int inc = nums[0];
        int exc = 0;
        for(int i=1;i<nums.length;i++){
            int ni = exc+nums[i];
            int ne = Math.max(exc,inc);
            
            inc = ni;
            exc = ne;
            
        }
        return Math.max(inc,exc);
    }
}