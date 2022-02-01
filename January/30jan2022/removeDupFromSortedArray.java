class Solution {
    public int removeDuplicates(int[] nums) {
        //optimized code
        int l=1;
        int n = nums.length;
        for(int r=1;r<n;r++){
            if(nums[r]!=nums[r-1]){
                nums[l]=nums[r];
                l++;
            }
        }
        return l;
    }
}
