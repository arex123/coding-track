class Solution {
    // https://leetcode.com/problems/max-consecutive-ones/
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int n = nums.length;
        int tmax = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                // if(i>=1 && nums[i-1]==1){
                //     tmax++;
                // }
                tmax++;
                max=Math.max(tmax,max);
            }else{
                tmax=0;
            }
            
        }
        
        return max;
        
    }
}