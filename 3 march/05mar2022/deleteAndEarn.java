// https://leetcode.com/problems/delete-and-earn/
class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] count = new int[10001];//we will make frequency array of nums
        for(int n:nums)
            count[n]++;
        
        int exc = 0;
        int inc = 0;
        
        for(int i=0;i<=10000;i++){
            int ni = count[i]*i+exc;
            int ne = Math.max(exc,inc);
            
            exc = ne;
            inc = ni;
            
        }
        
        return Math.max(exc,inc);
        
    }
}